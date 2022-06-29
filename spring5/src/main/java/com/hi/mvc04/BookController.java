 package com.hi.mvc04;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링 프레임워크에 컨트롤러 역할의 클래스로 등록
public class BookController {
	@Autowired
	BookDAO dao; 
	//회원과 관련된 여러가지 제어를 담당하는 클래스
	//회원가입,탈퇴,검색,로그인,수정 등 기능을 제어.

	@RequestMapping("money.do")
	public void ajax02(double money, int choice, Model model) {
		System.out.println("결제금액: "+ money);
		switch (choice) {
		case 1:
			money = money * 0.7;
			break;
		case 2:
			money = money * 0.9;
			break;
		}
		model.addAttribute("moneyResult",(int)money);
	}
	
	
	@RequestMapping("ajax1")
	public void ajax1(String phone, Model model) {
		System.out.println("ajax1호출!됨.");
		System.out.println("전달받은 전화번호: "+phone);
		String no = "";
		//세글자 010-->111
		//세글자 011-->222
		//세글자 나머지-->333
		//랜덤한 값 3글자 만들어서 뒤에 붙여 인증번호 6자리로 만들기.
		String pre = phone.substring(0,3);
		if(pre.contentEquals("010")) {	
			no = no + "lll";
		} else if (pre.equals("011")){	
			no = no + "222";
		} else {	
			no = no + "333";			
		}
		Random r = new Random();
		int no2 = r.nextInt(900) + 100;
		//100부터~~999(899+100=999)까지 수 랜덤하게 나옴.
		 no= no + no2;
		 
		 System.out.println("전송할 인증번호" + no);
		 //views까지 no값을 전달하고 ram에서 제거하고자 하는 경우. session으로 쓰면 ram에 계속내용이 있어서 안좋은방법이다.
		 //model객체의 속성으로 지정.
		 model.addAttribute("no", no);
	}
	
	@RequestMapping("create2")
	//create라고 요청이 들어오면 
	//회원가입 기능을 처리해주세요.
	public void create(BookVo vo) throws Exception {
		System.out.println("회원가입 제어 요청됨.");
		//1.입력한값 받아오기
		//2.vo(가방)만들어서 넣기 (public void create()에 bookVo vo만 넣어주면 1,2번 다해줌. dao도 같다.
		System.out.println(vo);
		//3.dao한테 vo주면서 create호출하기.(요청)
		dao.create(vo);
	}

	@RequestMapping("check2.hi")
	public void login(BookVo vo, HttpSession session) throws Exception {
		System.out.println(vo);
//		boolean result = dao.login(vo);
//		if(result) {	
			//result가true면 세션을 잡아라.이미 true값이 들어있음.
			session.setAttribute("user", vo.getId());
			//name을 세션으로 잡아서 브라우저 2곳에서 
			//id가 apple인 ***님 환영합니다. 창 띄어보기.

//		}
	}
	
	@RequestMapping("del2")	
	public void del(BookVo vo, BookDAO dao) {
		System.out.println("회원탈퇴 제어 요청됨.");
		System.out.println(vo);
	}
	
	@RequestMapping("up2")
	public void up(BookVo vo, BookDAO dao) {
		System.out.println("회원수정 제어 요청됨.");
		System.out.println(vo);
	}
	
	@RequestMapping("all2")
	public void all2(BookVo vo, Model model) {
		List<BookVo> list = dao.readAll();
		model.addAttribute("all");
	}

	@RequestMapping("one2")
	public void one(BookVo vo, Model model) {
		System.out.println(vo.getId());
		BookVo one = dao.read(vo);
		model.addAttribute("one", one);
		System.out.println(one);
	}
}
