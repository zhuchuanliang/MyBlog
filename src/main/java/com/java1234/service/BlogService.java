package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Blog;

public interface BlogService {
	
	//��ѯ���еĲ���
		public List<Blog> countList();
		
		/**��ҳ��ѯ������Ϣ
		 * @param map
		 * @return
		 */
		public List<Blog> list(Map<String,Object> map);
		
		/**��ȡ�ܵĲ�ѯ��¼��
		 * @param map
		 * @return
		 */
		public Long getTotal(Map<String,Object> map);
		

		/**����id�����Ҳ��͵�ʵ��
		 * @param id
		 * @return
		 */
		public Blog findById(Integer id);
		
		/**���²�����Ϣ
		 * @param blog
		 * @return
		 */
		public Integer update(Blog blog);
		
		/**��ȡ��һƪ���Ͷ���
		 * @param id
		 * @return
		 */
		public Blog getLastBlog(Integer id);
		
		

		/**��ȡ��һƪ���Ͷ���
		 * @param id
		 * @return
		 */
		public Blog getNextBlog(Integer id);

		
		/**��Ӳ���
		 * @param blog
		 * @return
		 */
		public Integer add(Blog blog);
		
		/**ɾ������
		 * @param id
		 * @return
		 */
		public Integer delete(Integer id);
		
		/**�ж�ĳ���������Ƿ��в���
		 * @param id
		 * @return
		 */
		public Integer getBlogByTypeId(Integer typeId);


}
