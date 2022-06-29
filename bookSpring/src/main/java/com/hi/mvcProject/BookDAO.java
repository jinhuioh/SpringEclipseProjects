package com.hi.mvcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 싱글톤으로 만들어달라고 스프링에게 요청
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;

	//회원가입
	public int create(BookVO vo) {
		int result = 0;
		try {
			result = my.insert("book.create", vo);
		}catch(Exception e) {
			System.out.println("에러발생.");
		}
		return result;
	}
	//로그인
	public BookVO login(BookVO vo) {
		return my.selectOne("book.login", vo);
	}
	
	public BookVO  idCheck(BookVO vo) {
		BookVO  vo2  = my.selectOne("book.idCheck", vo);
		return vo2;
	}

}