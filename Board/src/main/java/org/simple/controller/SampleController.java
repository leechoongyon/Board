package org.simple.controller;

import java.util.ArrayList;
import java.util.List;

import org.simple.domain.SampleVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/*")
public class SampleController
{
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
