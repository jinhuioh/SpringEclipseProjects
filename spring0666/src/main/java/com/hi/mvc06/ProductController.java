package com.hi.mvc06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.mvc06.ProductVo;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@RequestMapping("create")
	public void create(ProductVo vo) {
		dao.create(vo);
	}
	
	@RequestMapping("update")
	public void update(ProductVo vo) {
		dao.update(vo);
	}
	@RequestMapping("delete")
	public void delete(ProductVo vo) {
		dao.delete(vo);
	}
	@RequestMapping("all")
	public void readAll(Model model) {
		List<ProductVo> list = dao.readAll();
		model.addAttribute("list", list);
	}
	@RequestMapping("one")
	public void one(ProductVo vo, Model model) {
		ProductVo one = dao.readOne(vo);
		model.addAttribute("one", one);
	}
}
