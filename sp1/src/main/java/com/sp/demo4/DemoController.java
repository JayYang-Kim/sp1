package com.sp.demo4;

import java.net.URLDecoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * @RequestMapping 주소값이 동일한 경우 오류가 발생한다.
 * 주소값이 동일할때 오류가 발생하지 않는 경우는 method=RequestMethod.GET, method=RequestMethod.POST를 했을 경우만 가능하다. 
 * */
@Controller("demo4.demoController")
public class DemoController {
	@RequestMapping(value="/header/request")
	public String form(Model model) {
		return "demo4/user";
	}
	
	@RequestMapping(value="/header/result")
	public String result(
			@RequestParam String name,
			@RequestHeader("Accept-Language") String lang,
			@RequestHeader("User-Agent") String agent,
			HttpServletRequest req,
			Model model) throws Exception {
		
		name = URLDecoder.decode(name, "UTF-8");
		
		String s = "이름 : " + name + "<br/>";
		
		s += "Accept-Language : " + lang + "<br/>";
		s += "User-Agent : " + agent + "<br/>";
		
		// 이전주소 : Referer는 @RequestHeader로 넘겨받지 못한다.
		String r = req.getHeader("Referer");
		if(r != null) {
			s += "이전주소 : " + r;
		}
		
		model.addAttribute("msg", s);
		
		return "demo4/result";
	}
	
	@RequestMapping(value="/cookie/set")
	public String cookieSet(HttpServletResponse resp) {
		Cookie c = new Cookie("subject", "java"); // 쿠키에서 한글은 반드시 인코딩을 해야한다.
		
		resp.addCookie(c);
		
		return "demo4/user";
	}
	
	@RequestMapping(value="/cookie/get")
	public String cookieGet(
			@CookieValue(value="subject", required=false) String subject,
			Model model
			) {
		String s = "쿠키내용 - " + subject;
		
		model.addAttribute("msg", s);
		
		return "demo4/result";
	}

}
