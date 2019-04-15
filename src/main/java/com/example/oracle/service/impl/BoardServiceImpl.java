package com.example.oracle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oracle.dao.BoardDao;
import com.example.oracle.model.BoardModel;
import com.example.oracle.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;
	
	@Override
	public BoardModel printBoard() {
		
		BoardModel board = dao.getBoard();
		return board;
	}
}