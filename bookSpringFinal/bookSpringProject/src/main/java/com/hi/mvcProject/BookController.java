package com.hi.mvcProject;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.mvcProject.BookDAO;
import com.hi.mvcProject.BookVO;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;

	@RequestMapping("memberCheck")
	public String login(BookVO vo, HttpSession session) throws Exception {
		System.out.println(vo);
		BookVO vo2 = dao.login(vo);
		System.out.println(vo2);
		if (vo2 != null) {
			session.setAttribute("userId", vo2.getId());
			session.setAttribute("userName", vo2.getName());
			return "redirect:member.jsp";
		} else { // 濡쒓렇�씤�뿉 �떎�뙣�뻽�쓣 �븣
			return "memberCheck";
		}
	}

	@RequestMapping("memberCreate")
	public String create(BookVO vo) throws Exception {
		System.out.println(vo);
		int result = dao.create(vo);
		if (result == 1) {
			return "memberOk";
		} else { // int result = dao.idCheck(vo);.
			return "memberCreate";
		}
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:member.jsp";
	}

	@RequestMapping("memberIdCheck")
	public void idCheck(BookVO vo, Model model) {
		System.out.println(vo);
		BookVO vo2 = dao.idCheck(vo);
		System.out.println("寃곌낵>> " + vo2);
		int result = 1;
		if (vo2 == null) {
			result = 0; // �벝 �닔 �엳�뒗 id�엫.
		}
		model.addAttribute("result", result);
	}

	@RequestMapping("memberDelete")
	public String delete1(BookVO vo, Model model, HttpSession session) {
		int result = dao.delete(vo);
		model.addAttribute("result", result);
		session.invalidate();
		return "redirect:member.jsp";
	}
}
