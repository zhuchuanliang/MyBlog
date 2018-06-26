package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BlogDao;
import com.java1234.entity.Blog;
import com.java1234.service.BlogService;


@Service("blogService")
public class BlogServiceImpl implements BlogService {

	@Resource
	private BlogDao blogDao;
	
	public List<Blog> countList() {
		// TODO Auto-generated method stub
		return blogDao.countList();
	}
	public List<Blog> list(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return blogDao.list(map);
	}
	public Long getTotal(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return blogDao.getTotal(map);
	}
	public Blog findById(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.findById(id);
	}
	public Integer update(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.update(blog);
	}
	public Blog getLastBlog(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.getLastBlog(id);
	}
	public Blog getNextBlog(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.getNextBlog(id);
	}
	public Integer add(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.add(blog);
	}
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.delete(id);
	}
	public Integer getBlogByTypeId(Integer typeId) {
		// TODO Auto-generated method stub
		return blogDao.getBlogByTypeId(typeId);
	}

}
