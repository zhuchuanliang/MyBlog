package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.CommentDao;
import com.java1234.entity.Comment;
import com.java1234.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	
	@Resource
	private CommentDao commentDao;
	
	public List<Comment> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return commentDao.list(map);
	}

	public int add(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.add(comment);
	}

	public Long getTotal() {
		// TODO Auto-generated method stub
		return commentDao.getTotal();
	}

	public Integer update(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.update(comment);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return commentDao.delete(id);
	}

	

}
