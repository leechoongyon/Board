package org.simple.service;

import java.util.Date;

import javax.inject.Inject;

import org.simple.domain.LoginDTO;
import org.simple.domain.UserVO;
import org.springframework.stereotype.Service;
import org.simple.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService
{
	@Inject
	private UserMapper dao;

	@Override
	public UserVO login(LoginDTO dto) throws Exception
	{
		return dao.login(dto);
	}

	@Override
	public void keepLogin(String uid, String sessionId, Date next) throws Exception
	{
		dao.keepLogin(uid, sessionId, next);
	}

	@Override
	public UserVO checkLoginBefore(String value)
	{
		return dao.checkUserWithSessionKey(value);
	}
}
