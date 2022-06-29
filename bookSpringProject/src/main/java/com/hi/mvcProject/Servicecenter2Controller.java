package com.hi.mvcProject;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Servicecenter2Controller {

	@Autowired
	Servicecenter2DAO dao;
	
	@RequestMapping("serviceWrite")
	public String create(Servicecenter2VO vo) {
		System.out.println("게시글등록요청");
		int result =dao.create(vo);
		dao.number(vo);
		if(result==1) {
			System.out.println("게시글등록");
			
			return "serviceInsert";

		}else {
			System.out.println("실패");
			return "er";
		}
	}
	
	@RequestMapping("serviceUpdate1")
	public void update(Servicecenter2VO vo) {
		dao.update(vo);
	}
	
	@RequestMapping("serviceUpdate2")
	public void preupdate(Servicecenter2VO vo, Model model) {
		Servicecenter2VO one = dao.readOne(vo);
		model.addAttribute("one",one);
		System.out.println("update요청_");
	}
	
	
	@RequestMapping("serviceDelete")
	public void delete(Servicecenter2VO vo) {
		dao.delete(vo);
	}
	@RequestMapping("serviceOne")
	public void readone(Servicecenter2VO vo, Model model) {
		Servicecenter2VO one= dao.readOne(vo);
		model.addAttribute("one", one);
	}
	
	@RequestMapping("serviceList")
	public void readlist(Model model) {
		List<Servicecenter2VO> list=dao.all();
		model.addAttribute("list", list);
	}
	
}
