package com.hi.mvcProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicecenterfaqController {

	@Autowired
	ServicecenterfaqDAO dao;
	
	@RequestMapping("faqList")
	public void list(Model model) {
		List<ServicecenterfaqVO> list=dao.all();
		model.addAttribute("list", list);
	}
	
}
