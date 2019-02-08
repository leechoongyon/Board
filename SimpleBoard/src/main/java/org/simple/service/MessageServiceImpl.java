package org.simple.service;

import javax.inject.Inject;

import org.simple.domain.MessageVO;
import org.simple.mapper.MessageMapper;
import org.simple.mapper.PointMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageServiceImpl implements MessageService
{
	@Inject
	private MessageMapper messageDAO;

	@Inject
	private PointMapper pointDAO;

	@Transactional
	@Override
	public void addMessage(MessageVO vo) throws Exception
	{
		messageDAO.create(vo);
		pointDAO.updatePoint(vo.getSender(), 10);
	}

	@Override
	public MessageVO readMessage(String uid, Integer mid) throws Exception
	{
		messageDAO.updateState(mid);
		pointDAO.updatePoint(uid, 5);
		return messageDAO.readMessage(mid);
	}
}
