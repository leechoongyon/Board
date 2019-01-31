package org.simple.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.simple.domain.BoardVO;
import org.simple.persistence.BoardDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class BoardDAOTest
{
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception
	{
		BoardVO board = new BoardVO();
		board.setTitle("title");
		board.setContent("content");
		board.setWriter("user00");
		dao.create(board);
	}
}
