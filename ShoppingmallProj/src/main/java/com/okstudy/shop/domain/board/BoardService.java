package com.okstudy.shop.domain.board;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface BoardService {
	// 01. 게시글 작성
	public void create(BoardVO vo) throws Exception;
	// 02. 게시글 상세보기
	public BoardVO read(int boardIdx) throws Exception;
	// 03. 게시글 수정
	public void update(BoardVO vo) throws Exception;
	// 04. 게시글 삭제
	public void delete(int boardIdx) throws Exception;
	// 05. 게시글 전체 목록
	public List<BoardVO> listAll() throws Exception;
}