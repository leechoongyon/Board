package org.simple.mapper;

import org.apache.ibatis.annotations.Param;

public interface PointMapper
{
	public void updatePoint(@Param("uid") String uid, @Param("point") int point) throws Exception;
}