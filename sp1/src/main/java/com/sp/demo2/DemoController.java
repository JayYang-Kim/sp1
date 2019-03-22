package com.sp.demo2;

import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo2.demoController")
public class DemoController {
	@RequestMapping(value="/demo2/request", method=RequestMethod.GET)
	public String form() {
		return "demo2/write";
	}
	
	/*
	 * 파라미터를 Map으로 넘겨 받기
	 * Map 앞에 @RequestParam을 붙인다.
	 * 파라미터의 이름이 동일한 경우 하나만 받을 수 있으므로 주의한다.
	 * */
	@RequestMapping(value="/demo2/request", method=RequestMethod.POST)
	public String submit(
			@RequestParam Map<String, String> paramMap,
			Model model) {
		
		String s = "이름 : " + paramMap.get("name") + "<br/>";
		s += "나이 : " + paramMap.get("age") + "<br/>";
		s += "취미 : ";
		
		Iterator<String> it = paramMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(key.startsWith("hobby")) {
				s += paramMap.get(key) + " ";
			}
		}
		
		model.addAttribute("msg", s);
		
		return "demo2/result";
	}
}
