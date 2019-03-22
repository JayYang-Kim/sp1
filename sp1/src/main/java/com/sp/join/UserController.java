package com.sp.join;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("user") // 세션에 저장하는 어노테이션
@Controller("join.userController")
public class UserController {
	
	// 세션을 생성하여 User() 객체를 생성한다.
	@ModelAttribute("user")
	public User command() {
		return new User();
	}
	
	@RequestMapping(value="/join/main", method=RequestMethod.GET)
	public String form(@ModelAttribute User user) { // 세션에 내용 저장
		return "join/step1";
	}
	
	@RequestMapping(value="/join/step1", method=RequestMethod.POST)
	public String step1(@ModelAttribute("user") User user) { // 세션에 내용 저장
		return "join/step2";
	}
	
	@RequestMapping(value="/join/step2", method=RequestMethod.POST)
	public String step2(@ModelAttribute("user") User user, SessionStatus sessionStatus, Model model) { // 세션에 내용 저장
		
		String s = "이메일 : " + user.getEmail() + "<br/>";
		s += "이름 : " + user.getName() + "<br/>";
		s += "아이디 : " + user.getId() + "<br/>";
		s += "패스워드 : " + user.getPwd() + "<br/>";
		s += "전화번호 : " + user.getTel() + "<br/>";
		
		sessionStatus.setComplete(); // 세션에 저장된 모델 지우기
		
		model.addAttribute("msg", s);
		
		return "join/complete";
	}
}
