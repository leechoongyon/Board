package org.simple.mapper;

import java.util.Date;

import org.simple.domain.LoginDTO;
import org.simple.domain.UserVO;

public interface UserMapper
{
	public UserVO login(LoginDTO dto) throws Exception;
	public void keepLogin(String uid, String sessionId, Date next);
	public UserVO checkUserWithSessionKey(String value);
}
