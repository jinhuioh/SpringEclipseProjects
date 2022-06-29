package com.hi.mvcProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductlistController {

	@Autowired
	ProductListService productListService; 
	
	@Autowired
	ProductlistDAO dao;
	
	@RequestMapping("productAdd")
	public void plus(ProductlistVO vo, Model model, HttpSession session) {
		System.out.println("add vo"+vo);
		ArrayList<ProductlistVO> list = null; 
		if(session.getAttribute("basket")!=null) {
			list = (ArrayList<ProductlistVO>)session.getAttribute("basket"); 
		}else {
			list = new ArrayList<ProductlistVO>();
		}
		list.add(vo); 
		session.setAttribute("basket", list);
		model.addAttribute("size", list.size()); 
	}
	
	@RequestMapping("productOne")
	public void one(ProductlistVO vo, Model model) {
		System.out.println("ProductlistController vo2:"+vo);
		ProductlistVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
	}

	@RequestMapping("productList")
	public void list(Model model, @RequestParam(value="currentPage",defaultValue = "1",required = false)int currentPage,
								  @RequestParam(value = "rowPerPage", defaultValue = "30",required = false) int rowPerPage) {
		
		System.out.println("productList�쓽 currentPage"+currentPage);
		System.out.println("productList�쓽 rowPerPage"+rowPerPage);
		
		Map<String,Object> map = productListService.getProductList(currentPage, rowPerPage);
		
		model.addAttribute("currentPage", currentPage); 
		model.addAttribute("lastPage", map.get("lastPage")); 
		model.addAttribute("list", map.get("list")); 
		
	}
	
	@RequestMapping("productIn")
	public void insert(ProductlistVO vo, Model model)  {
		int result = dao.insert(vo); //�꽦怨듯븯硫� 1 �떎�뙣�븯硫�0 
		//model.addAttribute("result",result);
		//if(result == 1) {
		//	return "productIn";
		//}else {
		//	return "productNo"; 
		//}
	}
	
	@RequestMapping("productInsert")
	public void insert2(ProductlistVO vo, Model model) {
	
	}

	@RequestMapping("productDel")
	public void delete(ProductlistVO vo, Model model) {
		System.out.println("Del ProductlistVO vo"+vo);
		int result = dao.del(vo);
		model.addAttribute("result", result);
	}
	
	@RequestMapping("basketDel")
	public void delete2(ProductlistVO vo, Model model) {
		System.out.println("basketDel vo"+vo);
		
	}

	@RequestMapping("productUp")
	public void update(ProductlistVO vo, Model model) {
		System.out.println("======Controller productUp vo========"+vo);
		ProductlistVO vo2 = dao.one(vo); 
		model.addAttribute("one", vo2); 
	}
	
	@RequestMapping("productUpdate")
	public String update2(ProductlistVO vo, Model model) {
		System.out.println("======Controller productUpdate vo========"+vo);
		int result = dao.up(vo); 
		if(result == 1) {
			return "productUpdate";
		}else {
			return "productNo"; 
		}
	}
	
}
