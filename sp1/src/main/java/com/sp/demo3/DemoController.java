package com.sp.demo3;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo3.demoController")
public class DemoController {
	@RequestMapping(value="/demo3/request", method=RequestMethod.GET)
	public String form() {
		return "demo3/write";
	}
	
	/*
	 * 동일한 이름의 파라미터를 List로 넘겨 받기
	 * List 앞에 @RequestParam을 붙인다.
	 * */
	@RequestMapping(value="/demo3/request", method=RequestMethod.POST)
	public String submit(
			@RequestParam String name,
			@RequestParam int age,
			@RequestParam(required=false) List<String> hobby,
			Model model) {
		
		String s = "이름 : " + name + "<br/>";
		s += "나이 : " + age + "<br/>";
		s += "취미 : ";
		
		if(hobby != null) {
			for(String h : hobby) {
				s += h + " ";
			}
		}
		
		model.addAttribute("msg", s);
		
		return "demo3/result";
	}
}
