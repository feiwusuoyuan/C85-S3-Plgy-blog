package com.yc.C85S3Plgyblog.bean;

public class Article {
	private String id;
    private String author;
    private String title;
    private String content;
    private String keywords;
    private String description;
    private String categoryid;
    private String label;
    private String titleimgs;
    private String status;
    private String createtime;
    private String readcnt;
    private String agreecnt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTitleimgs() {
		return titleimgs;
	}
	public void setTitleimgs(String titleimgs) {
		this.titleimgs = titleimgs;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(String readcnt) {
		this.readcnt = readcnt;
	}
	public String getAgreecnt() {
		return agreecnt;
	}
	public void setAgreecnt(String agreecnt) {
		this.agreecnt = agreecnt;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", author=" + author + ", title=" + title + ", content=" + content + ", keywords="
				+ keywords + ", description=" + description + ", categoryid=" + categoryid + ", label=" + label
				+ ", titleimgs=" + titleimgs + ", status=" + status + ", createtime=" + createtime + ", readcnt="
				+ readcnt + ", agreecnt=" + agreecnt + "]";
	}
      
    
    
    
}
