package com.sp.user6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("user6.userController")
public class UserController {
	
	@RequestMapping(value="/user6/request", method=RequestMethod.GET) 
	public String form() {
		return "user6/write";
	}

	@RequestMapping(value="/user6/reuqest", method=RequestMethod.POST)
	public String submit(User dto, Model model) {
		String s = "이름 : " + dto.getName() + "<br/> 취미 : ";
		if(dto.getHobby() != null) {
			for(String h : dto.getHobby()) {
				s += h + " , ";
			}
		}
		
		model.addAttribute("msg", s);
		
		return "user6/result";
	}
	
}
