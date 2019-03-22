package com.sp.demo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("demo5.demoController")
public class DemoController {
	
	@RequestMapping(value="/demo5/request", method=RequestMethod.GET)
	public String form() {
		return "demo5/write";
	}
	
	/*
	 * @ModelAttribute : dto를 넘겨줄때 사용 (model을 사용하지 않고 넘겨줄 수 있다.)
	 * @ModelAttribute : 기본은 dto라는 이름으로 넘어가며, @ModelAttribute("vo") 이런식으로 정의하며 vo라는 이름으로 넘긴다. 
	 * */
	@RequestMapping(value="/demo5/request", method=RequestMethod.POST)
	public String submit(@ModelAttribute("vo") Demo dto) {
		// 포워딩하는 jsp에 vo라는 이름으로 dto 객체를 넘겨준다.
		return "demo5/result";
	}
	
}
