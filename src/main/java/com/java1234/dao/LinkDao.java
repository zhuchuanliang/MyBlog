package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Link;

public interface LinkDao {
	
	//��ѯ�������ӵ���Ϣ
	public List<Link> list(Map<String,Object> map);
	
	public Long getTotal();
	
	public Integer add(Link link);
	public Integer update(Link link);
	public Integer delete(Integer id);

}
