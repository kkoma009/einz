package com.example.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.oracle.model.BoardModel;
import com.example.oracle.service.BoardService;


@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list") // URL 주소
	public String list(Model model) {
		
		System.out.println("controller");

		BoardModel board = boardService.printBoard();
		
		System.out.println("board.getId():::"+board.getId());
		System.out.println("board.getName():::"+board.getName());
		
		model.addAttribute("id", board.getId());
		model.addAttribute("name", board.getName());
		model.addAttribute("email", board.getEmail());
		
		return "list"; // JSP 파일명
	}
}
