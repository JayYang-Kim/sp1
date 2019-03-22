package com.sp.user5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("user5.userController")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user5/calc", method=RequestMethod.GET)
	public String form() {
		return "user5/write";
	}
	
	@RequestMapping(value="/user5/calc", method=RequestMethod.POST)
	public String submit(User dto, Model model) {
		String s = userService.calculator(dto);
		
		model.addAttribute("msg", s); // 포워딩하는 jsp에 전달할 값
		
		return "user5/result";
	}
}
