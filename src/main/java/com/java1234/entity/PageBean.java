package com.java1234.entity;

/**2018年3月22日
 * @author Administrator
 *一个分页对象，参数包括当前是第几页，每页显示的数量
 */
public class PageBean {
	
	private int page;  //表示当前
	private int pageSize;//每页的记录数
	@SuppressWarnings("unused")
	private int start;  //每页的起始数
	
	
	
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
