package org.simple.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.simple.domain.SampleVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/*")
public class SampleController
{
	private static final Logger logger = LogManager.getLogger(SampleController.class);
	
	@RequestMapping("sendList")
	public List<SampleVO> sendList()
	{
		List<SampleVO> list = new ArrayList<SampleVO>();
		for (int i = 0 ; i < 10 ; i++)
		{
			SampleVO vo = new SampleVO();
			vo.setFirstName("길동");
			vo.setLastName("홍");
			vo.setMno(i);
			list.add(vo);
		}
		return list;
	}
}
