package com.sp.blog;

public class Blog {
	private String userId;
	private String userName;
	private String blogName;
	
	public Blog() {
		
	}
	
	public Blog(String userId, String userName, String blogName) {
		this.userId = userId;
		this.userName = userName;
		this.blogName = blogName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
}
