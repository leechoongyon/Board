package org.simple.service;

import java.util.Date;

import org.simple.domain.LoginDTO;
import org.simple.domain.UserVO;

public interface UserService
{
	public UserVO login(LoginDTO dto) throws Exception;
	public void keepLogin(String uid, String sessionId, Date next) throws Exception;
	public UserVO checkLoginBefore(String value);
}
