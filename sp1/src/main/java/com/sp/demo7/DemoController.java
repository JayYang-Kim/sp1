package com.sp.demo7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/*
 * # 스프링 MVC Flash Attribute
 * - POST 형태로 서버로 전송한 후 DB에 저장하고 정보를 보여주기 위해 포워딩하는 경우
 * 사용자가 f5키를 눌러 POST 요청을 여러번 보내면 문제가 발생할 수 있다. (여러번 DB가 저장되는 이슈)
 * 이런 문제를 해결하기 위해 SPRING 3.1부터는 RedirectAttributes를 제공한다.
 * - RedirectAttributes를 이용하여 데이터를 저장하고 Redircet된 페이지로 넘어가면 처리 후 즉시 데이터가 사라지므로 위와 같은 문제를 해결할 수 있다.
 */

@Controller("demo7.demoController")
public class DemoController {
	@RequestMapping(value="/demo7/request", method=RequestMethod.GET)
	public String form() {
		return "demo7/write";
	}
	
	@RequestMapping(value="/demo7/request", method=RequestMethod.POST)
	public String submit(Demo dto,
			final RedirectAttributes attr) {
		
		// Redirect된 JSP 페이지에서 값을 확인할 수 있다.
		attr.addFlashAttribute("dto", dto);
		attr.addFlashAttribute("msg", "가입완료");
		
		return "redirect:/demo7/show";
	}
	
	@RequestMapping(value="/demo7/show")
	public String show(@ModelAttribute("dto") Demo dto) {
		/*
		 * 위 메소드의 파라미터인 @ModelAttribute("dto") Demo dto는 리다에릭트한 페이지에사 addFlashAttribute로 넘긴 데이터를
		 * 현재 메소드에서 받기 위해 지정한것이며 f5를 눌러 새로고침하면 모두 지워진다. (한 번만 가져올 수 있다.)
		 * @ModelAttribute("dto")에서 dto는 생략불가 (생략하면 값을 가져올 수 없다.)
		 * */
		System.out.println(dto.getId() + " : " + dto.getName());
		return "demo7/result";
	}
}
