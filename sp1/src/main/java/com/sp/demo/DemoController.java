package com.sp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * @RequestParam : key = value 형태로 화면에서 넘어오는 파라미터를 맵핑된 메소드의 파라미터로 지정해준다.
 * 주로 get 방식으로 들어오는 request에서 사용한다. (기본은 필수로 키가 넘어오지 않으면 400에러 발생)
 * @RequestParam(defaultValue="") : 넘어온 값이 없을 경우 "defaultValue"에 있는 값으로 대체된다.
 * @RequestParam(required=false) : 필수값을 선택으로 변경할 수 있다.
 * */

@Controller("demo.demoController")
public class DemoController {
	@RequestMapping(value="/demo/reuqest")
	public String submit(@RequestParam(value="irum", defaultValue="자바") String name, // name은 필수값으로 처리된다.
			@RequestParam(defaultValue="0") int age, // 넘어온 값이 없으면 0으로 처리 
			Model model) {
		String s = "이름 : " + name + " ,나이 : " + age;
		
		model.addAttribute("msg", s);
		
		return "demo/result";
	}
}
