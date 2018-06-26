package com.java1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BloggerDao;
import com.java1234.entity.Blogger;
import com.java1234.service.BloggerService;

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {


	@Resource
	private BloggerDao bloggerDao;
	
	public Blogger getByUserName(String userName) {
		// TODO Auto-generated method stub
		return bloggerDao.getByUserName(userName);
	}

	public Blogger find() {
		// TODO Auto-generated method stub
		return bloggerDao.find();
	}

	public Integer update(Blogger blogger) {
		// TODO Auto-generated method stub
		return bloggerDao.update(blogger);
	}
	

}
