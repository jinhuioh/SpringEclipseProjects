package com.hi.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //1.컨트롤러로 등록되어있다. 2. 싱글톤으로 객체 생성해준다.(주소 생성)
public class AjaxController {

	@RequestMapping("movie")
	public void name1(String title, int price, Model model) { //여기 값을 view에 movie.jsp에 전달해주는 역할이 Model이다.
		System.out.println("ajax로 받은 데이터"+title+""+price);
		double price2 = price * 0.8;
		//model: 결과를 담는 views아래 까지만 데이터를 전달하고 ram에서 삭제.(session은 ram에 계속 남아있다.)
		model.addAttribute("title", title);
		model.addAttribute("price2", (int)(price2)); //int를 붙여주면 강제타입전환되어 소수점 사라진다.
		//강제형변환(강제타입변환)==>캐스팅(casting)
	}
	@RequestMapping("user")
	public void name2(String user, Model model) { //여기 값을 view에 movie.jsp에 전달해주는 역할이 Model이다.
		System.out.println("ajax로 받은 데이터"+user);
		//dao에 userid를 주면서 이미 있는지 아닌지 체크
		//select * from member where id='user'
		String[] list = {"apple", "melon", "summer"};
		String result = "사용가능한 id입니다.";
		for(String s : list) {	
			if(s.equals(user)) {	
				result = "사용불가능한 id";
			}
		}//for문
		model.addAttribute("result", result);
	}//publick void
	
	@RequestMapping("reply")
	public void name3(String reply, Model model) { //여기 값을 view에 movie.jsp에 전달해주는 역할이 Model이다.
		System.out.println("ajax로 받은 데이터"+reply);
		
		model.addAttribute("reply", reply);	
	}
	
}
