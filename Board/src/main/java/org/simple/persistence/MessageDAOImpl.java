package org.simple.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.simple.domain.MessageVO;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDAOImpl implements MessageDAO
{
	@Inject
	private SqlSession session;

	private static String namespace = "org.simple.mapper.MessageMapper";

	@Override
	public void create(MessageVO vo) throws Exception
	{

		session.insert(namespace + ".create", vo);
	}

	@Override
	public MessageVO readMessage(Integer mid) throws Exception
	{

		return session.selectOne(namespace + ".readMessage", mid);
	}

	@Override
	public void updateState(Integer mid) throws Exception
	{
		session.update(namespace + ".upldateState", mid);
	}

}
