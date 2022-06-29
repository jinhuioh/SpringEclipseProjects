package com.hi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//크루드
@Component //싱글톤 객체로 만들어달라고 스프링에게 요청.(주소가 lam에 생김)
public class BookDAO {
	// DAO: Data Access Object (데이타베이스에 엑세스해서 처리하는 기능)
	// 1.회원가입 (create)
	// 2.회원정보검색, 로그인 (read)
	// 3.회원정보수정 (update)
	// 4.회원탈퇴 (delete)
	// 이 작업을 만드는 것을, CRUD(크루드)라고 읽는다.
	@Autowired
	SqlSessionTemplate my;  //전역변수
	//싱글톤으로 만든 mybatis객체의 주소를 찾아서 my변수에 넣어주세요.
	//DAO부품안에 myBatis부품을 끼워넣음
	//dependency(의존성) Injection(주입): 의존성 주입(DI)
	//의존성: 해당부품이 반드시 필요하다는 의미
	//주입: 의존성을 구현하고 싶으면ram에 만들어놓은 주소를 쓰는 클래스의
	//변수에 주소를 넣어주세요.
	public void create(BookVo vo)  {
		my.insert("book.create", vo);
	}

	public void update(BookVo vo) {
		my.update("book.up", vo);
	}

	public void delete(BookVo vo)   {
		my.delete("book.del", vo);
	}

	public BookVo read(BookVo vo)  {
		 return my.selectOne("book.one", vo);
	}

	public List<BookVo> readAll() {
		  return my.selectList("book.all");
	}

}
