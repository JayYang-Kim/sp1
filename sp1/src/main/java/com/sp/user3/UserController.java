package com.sp.user3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user3.userController")
public class UserController {
	@RequestMapping("user3/hello")
	public void result(HttpServletResponse resp) throws IOException {
		// 리턴타입 : void - 직업 resp를 조작하거나 파일 다운로드등에서 사용
		Calendar cal = Calendar.getInstance();
		String s = String.format("%tF %tT", cal, cal);
		
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("현재시간 : " + "<h3>" + s + "</h3>");
		out.print("</body></html>");
	}
}
