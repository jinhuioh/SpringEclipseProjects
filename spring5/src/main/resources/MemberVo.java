

public class MemberVo {
	//데이터들을 전달할 때
	//데이터들을 넣어줄 가방(주소) 역할의 클래스가 필요
	//변수를 만들어서 값만 넣었다 뺐다만 함.
	//vo=value object 값들을 넣고 빼고 한다는의미
	//Data Transfer object(DAO)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
//	public void setId(String id) {	
//		this.id = id; //private String id 에 setId(String id)이 아이디 값을 넣어줘.라는 의미. this는 public class MemberVo 안이엤는 id를 말해준다.
//	}
//	publick String getId() {	
//		return id; //id 넣어준거 가져와.
//	}
	
}
