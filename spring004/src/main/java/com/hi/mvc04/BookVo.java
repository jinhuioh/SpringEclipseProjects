package com.hi.mvc04;

public class BookVo {
	//데이터들을 전달할 때
	//데이터들을 넣어줄 가방(주소) 역할의 클래스가 필요
	//변수를 만들어서 값만 넣었다 뺐다만 함.
	//vo=value object 값들을 넣고 빼고 한다는의미
	//Data Transfer object(DAO)
	private String id;
	private String name;
	private String url;
	private String png;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPng() {
		return png;
	}
	public void setPng(String png) {
		this.png = png;
	}
	@Override
	public String toString() {
		return "BookVo [id=" + id + ", name=" + name + ", url=" + url + ", png=" + png + "]";
	}
	
	
	
//	public void setId(String id) {	
//		this.id = id; //private String id 에 setId(String id)이 아이디 값을 넣어줘.라는 의미. this는 public class MemberVo 안이엤는 id를 말해준다.
//	}
//	publick String getId() {	
//		return id; //id 넣어준거 가져와.
//	}
	
}
