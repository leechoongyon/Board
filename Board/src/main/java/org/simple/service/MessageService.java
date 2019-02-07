package org.simple.service;

import org.simple.domain.MessageVO;

public interface MessageService
{
	public void addMessage(MessageVO vo) throws Exception;
	public MessageVO readMessage(String uid, Integer mno) throws Exception;
}
