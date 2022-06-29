package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductlistDAO {

	@Autowired
	SqlSessionTemplate my;

	public ProductlistVO one(ProductlistVO vo) {
		System.out.println("ProductlistVO vo:"+vo);
		return my.selectOne("productlist.one", vo);
	}

	public List<ProductlistVO> all(ProductPage page) {
		return my.selectList("productlist.list", page);
	}
	
	public int count() {
		return my.selectOne("productlist.count");
	}
	
	public int insert(ProductlistVO vo) {
		return my.insert("productlist.in", vo);
	}
	public int up(ProductlistVO vo) {
		System.out.println("DAO vo"+vo);
		return my.update("productlist.up", vo);
	}
	public int del(ProductlistVO vo) {
		System.out.println("DAO del vo"+vo);
		return my.delete("productlist.del", vo);
	}
	
}
