package com.hi.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hi.mvc06.ProductVo;

@Controller
public class ProductDAO {
	@Autowired
	SqlSessionTemplate my;
	public void create(ProductVo vo) {
		my.insert("pro.create", vo);
	}
	public int update(ProductVo vo) {
		return my.update("pro.up", vo);
	}
	public int delete(ProductVo vo) {
		return my.delete("pro.del", vo);
	}
	public ProductVo readOne(ProductVo vo) {
		return my.selectOne("pro.one", vo);
	}
	public List<ProductVo> readAll() {
		return my.selectList("pro.all");
	}

}
