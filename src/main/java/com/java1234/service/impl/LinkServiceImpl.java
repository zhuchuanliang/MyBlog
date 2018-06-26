package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.LinkDao;
import com.java1234.entity.Link;
import com.java1234.service.LinkService;

@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Resource
	private LinkDao linkDao;
	
	public List<Link> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return linkDao.list(map);
	}

	public Long getTotal() {
		// TODO Auto-generated method stub
		return linkDao.getTotal();
	}

	public Integer add(Link link) {
		// TODO Auto-generated method stub
		return linkDao.add(link);
	}

	public Integer update(Link link) {
		// TODO Auto-generated method stub
		return linkDao.update(link);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return linkDao.delete(id);
	}

}
