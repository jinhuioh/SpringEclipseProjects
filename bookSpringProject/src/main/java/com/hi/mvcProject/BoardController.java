package com.hi.mvcProject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BoardController {
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping("boardInsert")
	public void insert(BoardVO vo, Model model) {
		System.out.println(vo);
		int result = dao.insert(vo);
		String text = "寃뚯떆臾� �옉�꽦 �꽦怨�";
		if(result != 1) {
			text = "寃뚯떆臾� �옉�꽦 �떎�뙣";
		}
		model.addAttribute("result", text);
	}
	
	@RequestMapping("boardOne")
	public void one(BoardVO vo, Model model) {
		System.out.println(vo);
		BoardVO vo2 = dao.one(vo);
		System.out.println(vo2);
		model.addAttribute("one", vo2);
	}
	
	@RequestMapping("boardList")
	public void list(Model model) {
		List<BoardVO> list = dao.all();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("boardUpdate")
	public void update(BoardVO vo, Model model) {
		BoardVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
	}
	
	@RequestMapping("boardUpdate2")
	public String update2(BoardVO vo, Model model) {
		System.out.println(vo);
		int result = dao.update(vo);
		System.out.println(result);
		if(result == 1) {
			return "boardUpdate2";
		} else {
			return "no";
		}
	}
	
	@RequestMapping("boardDelete")
	public void delete(BoardVO vo, Model model) {
		int result = dao.delete(vo);
		model.addAttribute("result", result);
	}
	
}