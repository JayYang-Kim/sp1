package com.sp.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

@Controller("user.userController")
public class UserController {
	// Controller 안에서는 비즈니스 로직은 들어가면 안된다.
	// 클라이언트가 get방식으로 접속한 경우 밑에 줄 실행
	@RequestMapping(value = "/user/write", method=RequestMethod.GET) // 주소
	public String form() {
		// return 타입이 string인 경우 : view 이름 (jsp)
		return "user/write";
	}
	
	// 클라이언트가 post방식으로 접속한 경우 밑에 줄 실행
	@RequestMapping(value = "/user/write", method=RequestMethod.POST) // 주소
	public ModelAndView submit(String name, int age) { // ()안에 input name과 동일하게 입력하며 값을 받을 수 있다.
		// return 타입이 ModelAndView인 경우 : 처리 결과를 보여줄 view와 view에 전달할 값을 저장
		ModelAndView mav = new ModelAndView("user/result");
		
		// ModelAndView를 위의 한 줄을 밑에 두 줄로 생성할 수 있다.
		/*
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/result");
		*/
		
		String s = "성인";
		
		if(age < 19) {
			s = "미성년자";
		}
		
		String msg = name + "님은" + s + "입니다.";
		
		// request.setAttribute("Key", 값); 와 유사한 개념
		mav.addObject("msg", msg);
		
		return mav;
	}
}
