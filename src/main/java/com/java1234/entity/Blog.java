package com.java1234.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**2018��3��24��
 * @author Administrator
 *
 */
/**2018��3��31��
 * @author Administrator
 *
 */
public class Blog {
	
	private Integer id;
	private String title;
	private String summary;
	private Date releaseDate;
	private int clickHit;
	private int replyHit;
	private String content;
	private int typeId;
	private String keyWord;
	
	private String contentNoTag; // �������ݣ�����ҳ��ǩ Lucene�ִ��õ�
	
	private int blogCount;
	private String releaseDateStr;
	
	
	
	
	private BlogType blogType; // ��������
	
	
	private List<String> imageList=new LinkedList<String>();
	
	
	public String getContentNoTag() {
		return contentNoTag;
	}
	public void setContentNoTag(String contentNoTag) {
		this.contentNoTag = contentNoTag;
	}
	public List<String> getImageList() {
		return imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public BlogType getBlogType() {
		return blogType;
	}
	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}
	
	public String getReleaseDateStr() {
		return releaseDateStr;
	}
	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}
	public int getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(int blogCount) {
		this.blogCount = blogCount;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getClickHit() {
		return clickHit;
	}
	public void setClickHit(int clickHit) {
		this.clickHit = clickHit;
	}
	public int getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(int replyHit) {
		this.replyHit = replyHit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	
	

}
