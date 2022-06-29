

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//크루드
public class MemberDAO {
	//DAO: Data Access Object (데이타베이스에 엑세스해서 처리하는 기능)
	//1.회원가입 (create)
	//2.회원정보검색, 로그인 (read)
	//3.회원정보수정 (update)
	//4.회원탈퇴 (delete)
	//이 작업을 만드는 것을, CRUD(크루드)라고 읽는다.
	public void create(MemberVo vo) throws Exception {
		System.out.println("dao에서 전달받은 값"+vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		String name2 = vo.getName();
		String tel2 = vo.getTel();
		
		System.out.println("전달받은 id는"+ id2);
		System.out.println("전달받은 pw는"+ pw2);
		System.out.println("전달받은 name는"+ name2);
		System.out.println("전달받은 tel는"+ tel2);
		
		/* 1.connector(드라이버) 라이브러리 설정*/
		Class.forName("com.mysql.jdbc.Driver");		
		System.out.println("1.드라이버/커넥터 설정 성공!");

		/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url,user,pass);		
		System.out.println("2.db연결 성공!");

		// 3.sql문을 생성
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3.sql문객체 생성 성공!");
		ps.setString(1, id2);
		ps.setString(2, pw2);
		ps.setString(3, name2);
		ps.setString(4, tel2);
		
		// 4.생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. sql문 전송!");	
	}
	
	public void update(MemberVo vo) throws Exception {
	System.out.println("dao에서 전달받은 값"+vo);
	String id2 = vo.getId();
	String pw2 = vo.getPw();
	String name2 = vo.getName();
	String tel2 = vo.getTel();
	
	System.out.println("전달받은 id는"+ id2);
	System.out.println("전달받은 pw는"+ pw2);
	System.out.println("전달받은 name는"+ name2);
	System.out.println("전달받은 tel는"+ tel2);
	
	/* 1.connector(드라이버) 라이브러리 설정*/
	Class.forName("com.mysql.jdbc.Driver");		
	System.out.println("1.드라이버/커넥터 설정 성공!");

	/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
	String url = "jdbc:mysql://localhost:3366/big";
	String user = "root";
	String pass = "1234";
	Connection con = DriverManager.getConnection(url,user,pass);
	System.out.println("2.db연결 성공!");

	// 3.sql문을 생성
	String sql = "update member set tel=? where id=?";
	PreparedStatement ps = con.prepareStatement(sql);
	
	System.out.println("3.sql문객체 생성 성공!");
	ps.setString(1, id2);
	ps.setString(2, tel2);
	
	// 4.생성한 sql문을 mysql로 보낸다.
	ps.executeUpdate();
	System.out.println("4. sql문 전송!");
	}
	
	public void delete(MemberVo vo) throws Exception {
		System.out.println("dao에서 전달받은 값"+vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		String name2 = vo.getName();
		String tel2 = vo.getTel();
		
		System.out.println("전달받은 id는"+ id2);
		
		/* 1.connector(드라이버) 라이브러리 설정*/
		Class.forName("com.mysql.jdbc.Driver");		
		System.out.println("1.드라이버/커넥터 설정 성공!");

		/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url,user,pass);		
		System.out.println("2.db연결 성공!");

		// 3.sql문을 생성
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3.sql문객체 생성 성공!");
		ps.setString(1, id2);
		
		// 4.생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. sql문 전송!");
		}
	
	public MemberVo readOne(MemberVo vo) throws Exception  {
		System.out.println("회원검색처리 처리 요청됨.");
		System.out.println("dao에서 전달받은 값"+vo);
		String id2 = vo.getId();
		
		System.out.println("전달받은 id는"+ id2);
		
		/* 1.connector(드라이버) 라이브러리 설정*/
		Class.forName("com.mysql.jdbc.Driver");		
		System.out.println("1.드라이버/커넥터 설정 성공!");

		/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url,user,pass);		
		System.out.println("2.db연결 성공!");

		// 3.sql문을 생성
		String sql = "select * from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3.sql문객체 생성 성공!");
		ps.setString(1, id2);

		
		// 4.생성한 sql문을 mysql로 보낸다.
		ResultSet rs = ps.executeQuery();
		//System.out.println("결과값이 있는지 채크 결과는"+rs.next());
		System.out.println("4. sql문 전송!");	
		MemberVo vo2 = new MemberVo(); //가방역할. 아래 스트링 값들을 넣을거.
		if(rs.next()) {	
			String id = rs.getString("id"); //String id = rs.getString("1"); 이랑 같다. 컬럼명으로 해도 되고 인덱스 순서로 줘도 된다.
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setName(name);
			vo2.setTel(tel);			
		} else {	
			System.out.println("검색결과없음");
		}
		return vo2; //public void에서 void안에 vo2를 리턴하기위해, 클래스이름MemberVo를 넣어준다.
	}
	
	
	public ArrayList<MemberVo> readAll() throws Exception {
		System.out.println("회원검색처리 전부 요청됨.");

		
		
		/* 1.connector(드라이버) 라이브러리 설정*/
		Class.forName("com.mysql.jdbc.Driver");		
		System.out.println("1.드라이버/커넥터 설정 성공!");

		/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url,user,pass);		
		System.out.println("2.db연결 성공!");

		// 3.sql문을 생성
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3.sql문객체 생성 성공!");

		
		// 4.생성한 sql문을 mysql로 보낸다.
		ResultSet rs = ps.executeQuery();
		//System.out.println("결과값이 있는지 채크 결과는"+rs.next());
		System.out.println("4. sql문 전송!");	
		//가방들을 모을 저장공간을 만들어야 함.
		//배열은 적합하지 않음.
		//MemberVo[] list =new Member[]();
		//가변적인 저장공간이 필요.ArrayList 사용
		ArrayList<MemberVo> list = new ArrayList<>();
		while(rs.next()) {	
			MemberVo vo2 = new MemberVo(); //가방역할. 아래 스트링 값들을 넣을거.
			String id = rs.getString("id"); //String id = rs.getString("1"); 이랑 같다. 컬럼명으로 해도 되고 인덱스 순서로 줘도 된다.
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setName(name);
			vo2.setTel(tel);
			list.add(vo2);
		}
		return list; //public void에서 void안에 vo2를 리턴하기위해, 클래스이름MemberVo를 넣어준다.
	
	}
	
	public boolean login(MemberVo vo) throws Exception  {
		System.out.println("회원검색처리 처리 요청됨.");
		System.out.println("dao에서 전달받은 값"+vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		
		System.out.println("전달받은 id는"+ id2);
		
		/* 1.connector(드라이버) 라이브러리 설정*/
		Class.forName("com.mysql.jdbc.Driver");		
		System.out.println("1.드라이버/커넥터 설정 성공!");

		/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url,user,pass);		
		System.out.println("2.db연결 성공!");

		// 3.sql문을 생성
		String sql = "select * from member where id=? and pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3.sql문객체 생성 성공!");
		ps.setString(1, id2);
		ps.setString(2, pw2);

		
		// 4.생성한 sql문을 mysql로 보낸다.
		ResultSet rs = ps.executeQuery();
		//System.out.println("결과값이 있는지 채크 결과는"+rs.next());
		System.out.println("4. sql문 전송!");	
		boolean result = false; //없음.
		if(rs.next()) {	
			System.out.println("검색결과 있음");
			result =true;
		} else {	
			System.out.println("검색결과없음");
		}
		return result; //public void에서 void안에 vo2를 리턴하기위해, 클래스이름MemberVo를 넣어준다.
	}
		
	
}
