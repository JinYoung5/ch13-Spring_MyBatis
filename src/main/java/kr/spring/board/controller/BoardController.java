package kr.spring.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	//list.do로 리다이렉트
	@RequestMapping("/")
	public String main() {
		return "redirect:/list.do";
	}
	
	@RequestMapping("/list.do")
	public ModelAndView getList() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("selectList");
		
		return mav;
	}
}
