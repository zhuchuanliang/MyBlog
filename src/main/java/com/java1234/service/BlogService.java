package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Blog;

public interface BlogService {
	
	//查询所有的博客
		public List<Blog> countList();
		
		/**分页查询博客信息
		 * @param map
		 * @return
		 */
		public List<Blog> list(Map<String,Object> map);
		
		/**获取总的查询记录数
		 * @param map
		 * @return
		 */
		public Long getTotal(Map<String,Object> map);
		

		/**根据id来查找博客的实体
		 * @param id
		 * @return
		 */
		public Blog findById(Integer id);
		
		/**更新博客信息
		 * @param blog
		 * @return
		 */
		public Integer update(Blog blog);
		
		/**获取上一篇博客对象
		 * @param id
		 * @return
		 */
		public Blog getLastBlog(Integer id);
		
		

		/**获取下一篇博客对象
		 * @param id
		 * @return
		 */
		public Blog getNextBlog(Integer id);

		
		/**添加博客
		 * @param blog
		 * @return
		 */
		public Integer add(Blog blog);
		
		/**删除博客
		 * @param id
		 * @return
		 */
		public Integer delete(Integer id);
		
		/**判断某种类型下是否有博客
		 * @param id
		 * @return
		 */
		public Integer getBlogByTypeId(Integer typeId);


}
