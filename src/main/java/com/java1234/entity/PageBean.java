package com.java1234.entity;

/**2018��3��22��
 * @author Administrator
 *һ����ҳ���󣬲���������ǰ�ǵڼ�ҳ��ÿҳ��ʾ������
 */
public class PageBean {
	
	private int page;  //��ʾ��ǰ
	private int pageSize;//ÿҳ�ļ�¼��
	@SuppressWarnings("unused")
	private int start;  //ÿҳ����ʼ��
	
	
	
	public PageBean(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStart() {
		return (page-1)*pageSize;
	}
	
	
	
	

}
