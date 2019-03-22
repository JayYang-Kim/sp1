package com.sp.user2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("user2.userController")
public class UserController {
	// @RequestMapping()안에 method를 정의해 주지 않으면 get과 post를 모두 처리 
	@RequestMapping(value = "/user2/write")
	public ModelAndView user(HttpServletRequest req) {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return new ModelAndView("user2/write");
		}
		
		try {
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			
			String s = name + "님은";
			
			if(age < 19) {
				s += "미성년자 입니다.";
			} else {
				s += "성인입니다.";
			}
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("user2/result");
			mav.addObject("msg", s);
			
			return mav;
		} catch (Exception e) {
			return new ModelAndView("redirect:/user2/error");
		}
	}
	
	@RequestMapping("user2/error")
	public String errorForm() {
		return "user2/error";
	}
}
