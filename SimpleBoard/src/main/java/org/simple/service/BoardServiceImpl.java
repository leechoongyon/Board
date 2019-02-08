package org.simple.service;

import java.util.List;

import javax.inject.Inject;

import org.simple.domain.BoardVO;
import org.simple.domain.Criteria;
import org.simple.domain.SearchCriteria;
import org.simple.mapper.BoardMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService
{
	@Inject
	private BoardMapper dao;

	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Override
	public void regist(BoardVO board) throws Exception
	{
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception
	{
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception
	{
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception
	{
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception
	{
		return dao.listAll();
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception
	{

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception
	{

		return dao.countPaging(cri);
	}

	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception
	{
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{

		return dao.listSearchCount(cri);
	}

}
