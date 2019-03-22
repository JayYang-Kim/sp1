package com.sp.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("blog.blogController")
public class BlogController {
	private List<Blog> list = new ArrayList<>();
	{
		list.add(new Blog("100001", "자바", "자바 스터디"));
		list.add(new Blog("100002", "서블릿", "웹 프로그래밍"));
		list.add(new Blog("100003", "HTML", "CSS"));
		list.add(new Blog("100004", "스프링", "STS"));
		list.add(new Blog("100005", "아파치", "톰캣"));
	}
	
	@RequestMapping(value="/blog")
	public String main(Model model) {
		model.addAttribute("list", list);
		
		return "blog/main";
	}
	
	/*
	 * @PathVariable : URI 템플릿을 이용하여 REST 방식의 URL 매칭처리를 위한 어노테이션
	 * 블로그, 카페 등 유저별로 페이지를 구축해야 하는 경우 편리
	 * @RequestMapping에서는 {템플릿변수}를 사용하고
	 * @PathVariable에서는 {템플릿변수}와 동일한 이름의 변수를 추가한다.
	 * */
	@RequestMapping(value="/blog/{blogId}/main")
	public String execute(@PathVariable String blogId, Model model) {
		Blog dto = null;
		for(Blog b : list) {
			if(blogId.equals(b.getUserId())) {
				dto = b;
				break;
			}
		}
		
		model.addAttribute("dto", dto);
		return "blog/view";
	}
}
