package com.hi.mvc04;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //스프링 프레임워크에 컨트롤러 역할의 클래스로 등록
public class ProductController {
	
	@Autowired //dao 에@component 가 꼭 있어야된다.
	MemberDAO dao;
	//회원과 관련된 여러가지 제어를 담당하는 클래스
	//회원가입,탈퇴,검색,로그인,수정 등 기능을 제어.
	@RequestMapping("check3.hi")
	public void login(MemberVo vo, HttpSession session) throws Exception {
		System.out.println(vo);
//		boolean result = dao.login(vo);
//		if(result) {	
			//result가true면 세션을 잡아라.이미 true값이 들어있음.
			session.setAttribute("user", vo.getId());
			//name을 세션으로 잡아서 브라우저 2곳에서 
			//id가 apple인 ***님 환영합니다. 창 띄어보기.
			session.setAttribute("name", "홍길동");
			session.setAttribute("password", vo.getPw());
//		}
	}
	
	@RequestMapping("create3")
	//create라고 요청이 들어오면 
	//회원가입 기능을 처리해주세요.
	public void create(MemberVo vo) throws Exception {
		System.out.println("회원가입 제어 요청됨.");
		//1.입력한값 받아오기
		//2.vo(가방)만들어서 넣기 (public void create()에 MemberVo vo만 넣어주면 1,2번 다해줌. dao도 같다.
		System.out.println(vo);
		//3.dao한테 vo주면서 create호출하기.(요청)
		dao.create(vo);
	}
	
	@RequestMapping("del3")	
	public void del(MemberVo vo) {
		System.out.println("회원탈퇴 제어 요청됨.");
		System.out.println(vo);
	}
	
	@RequestMapping("up3")
	public void up(MemberVo vo) {
		System.out.println("회원수정 제어 요청됨.");
		System.out.println(vo);
	}
}
