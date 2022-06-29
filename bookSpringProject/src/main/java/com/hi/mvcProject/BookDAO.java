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

@Component 
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;

	//�쉶�썝媛��엯
	public int create(BookVO vo) {
		int result = 0;
		try {
			result = my.insert("book.create", vo);
		}catch(Exception e) {
			System.out.println("�뿉�윭諛쒖깮.");
		}
		return result;
	}
	//濡쒓렇�씤
	public BookVO login(BookVO vo) {
		return my.selectOne("book.login", vo);
	}
	
	public BookVO  idCheck(BookVO vo) {
		BookVO  vo2  = my.selectOne("book.idCheck", vo);
		return vo2;
	}
	public int delete(BookVO vo) {
		return my.delete("book.delete1", vo);
	}
	
}