package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Comment;

public interface CommentDao {
	
	/**评论查询
	 * @param map
	 * @return
	 */
	public List<Comment>  list(Map<String,Object> map);
	

	
	public Long getTotal() ;
	
	/**添加评论
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
	
	public Integer update(Comment comment);
	
	
	public Integer delete(Integer id);
	
	

}
