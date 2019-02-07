package org.simple.persistence;

import org.simple.domain.MessageVO;

public interface MessageDAO
{
	public void create(MessageVO vo) throws Exception;
	public MessageVO readMessage(Integer mid) throws Exception;
	public void updateState(Integer mid) throws Exception;
}
