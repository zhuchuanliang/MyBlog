package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Comment;

public interface CommentService {
	
	public List<Comment>  list(Map<String,Object> map);

	
	public Long getTotal() ;
	
	
	/**�������
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
	
	public Integer update(Comment comment);
	
	public Integer delete(Integer id);

}
