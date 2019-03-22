package com.sp.user4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @RequestMapping : 다수의 요청 처리
 * 
 * 표현 방법)
 * 
 * @RequestMapping(value="/user/write") // get, post 요청 처리
 * @RequestMapping("/user/write")
 * @RequestMapping("main*)
 * @RequestMapping("*.do")
 * @RequestMapping({"/a/a", "/a/b"})
 * */

@Controller("user4.userController")
public class UserController {
	// Controller 안에서는 비즈니스 로직은 들어가면 안된다.
	// 클라이언트가 get방식으로 접속한 경우 밑에 줄 실행
	@RequestMapping(value = "/user4/write", method=RequestMethod.GET) // 주소
	public String form() {
		// return 타입이 string인 경우 : view 이름 (jsp)
		return "user4/write";
	}
	
	// 클라이언트가 post방식으로 접속한 경우 밑에 줄 실행
	/*
	@RequestMapping(value = "/user4/result", method=RequestMethod.POST) // 주소
	public Map<String, Object> submit(String name, int age) { // ()안에 input name과 동일하게 입력하며 값을 받을 수 있다.
		// map, model, modelMap을 리턴하는 경우 view는 url로 결정된다.
		// map은 ajax에서 json으로 응답할때 많이 사용된다.
		String s = "성인";
		
		if(age < 19) {
			s = "미성년자";
		}
		
		String m = name + "님은" + s + "입니다.!!!!";
		
		Map<String, Object> map = new HashMap<>();
		map.put("msg", m); // request.setAttribute("키", 값)과 유사한 개념
		
		return map;
	}
	*/
	
	@RequestMapping(value = "/user4/result", method=RequestMethod.POST) // 주소
	public Model submit(String name, int age) { // ()안에 input name과 동일하게 입력하며 값을 받을 수 있다.
		String s = "성인";

		if (age < 19) {
			s = "미성년자";
		}

		String m = name + "님은" + s + "입니다.!!!!";
		
		Model model = new ExtendedModelMap();
		model.addAttribute("msg", m); // request.setAttribute("키", 값)과 유사한 개념
		
		return model;
	}
	
}
