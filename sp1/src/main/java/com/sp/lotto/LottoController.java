package com.sp.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("lotto.lottoController")
public class LottoController {
	
	@Autowired
	private LottoService lottoService;
	
	@RequestMapping(value = "/lotto/write", method = RequestMethod.GET)
	public String form() {
		return "lotto/write";
	}
	
	@RequestMapping(value = "/lotto/write", method = RequestMethod.POST)
	public String lotto(Lotto dto, Model model) {
		lottoService.lotto(dto);
		
		model.addAttribute("msg", dto.getCount());
		
		return "lotto/result";
	}
	
}
