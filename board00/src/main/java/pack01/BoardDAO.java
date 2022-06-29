package pack01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import pack01.BoardVo;

//크루드
public class BoardDAO {
   //DAO: Data Access Object (데이타베이스에 엑세스해서 처리하는 기능)
   //1.회원가입 (create)
   //2.회원정보검색, 로그인 (read)
   //3.회원정보수정 (update)
   //4.회원탈퇴 (delete)
   //이 작업을 만드는 것을, CRUD(크루드)라고 읽는다.
   public void create(BoardVo vo) throws Exception {
      System.out.println("dao에서 전달받은 값"+vo);
      int idx2 = vo.getIdx();
      String name2 = vo.getName();
      String content2 = vo.getContent();
      String title2 = vo.getTitle();
      Timestamp rgstdate2 = vo.getRgstdate();
      
      System.out.println("전달받은 idx는"+ idx2);
      System.out.println("전달받은 name는"+ name2);
      System.out.println("전달받은 content는"+ content2);
      System.out.println("전달받은 title는"+ title2);
      System.out.println("전달받은 등록일은"+ rgstdate2);
      
      /* 1.connector(드라이버) 라이브러리 설정*/
      Class.forName("com.mysql.jdbc.Driver");      
      System.out.println("1.드라이버/커넥터 설정 성공!");

      /*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(board)*/
      String url = "jdbc:mysql://localhost:3366/board";
      String user = "root";
      String pass = "1234";
      Connection con = DriverManager.getConnection(url,user,pass);      
      System.out.println("2.db연결 성공!");

      // 3.sql문을 생성
      String sql = "insert into board(name,content,title) values (?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      
      System.out.println("3.sql문객체 생성 성공!");
      ps.setString(1, name2);
      ps.setString(2, content2);
      ps.setString(3, title2);
      // 4.생성한 sql문을 mysql로 보낸다.
      ps.executeUpdate();
      System.out.println("4. sql문 전송!");   
   }
   
   public void update(BoardVo vo) throws Exception {
   System.out.println("dao에서 전달받은 값"+vo);
   int idx2 = vo.getIdx();  
   String name2 = vo.getName();
   String content2 = vo.getContent();
   String title2 = vo.getTitle();

   
   System.out.println("전달받은 name는"+ name2);
   System.out.println("전달받은 content는"+ content2);
   System.out.println("전달받은 title는"+ title2);
   
   /* 1.connector(드라이버) 라이브러리 설정*/
   Class.forName("com.mysql.jdbc.Driver");      
   System.out.println("1.드라이버/커넥터 설정 성공!");

   /*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
   String url = "jdbc:mysql://localhost:3366/board";
   String user = "root";
   String pass = "1234";
   Connection con = DriverManager.getConnection(url,user,pass);      
   System.out.println("2.db연결 성공!");

   // 3.sql문을 생성
   String sql = "update board set content=?, title=? where idx=?";
   PreparedStatement ps = con.prepareStatement(sql);
   
   System.out.println("3.sql문객체 생성 성공!");
   ps.setString(1, content2);
   ps.setString(2, title2);
   ps.setInt(3, idx2);
   
   // 4.생성한 sql문을 mysql로 보낸다.
   ps.executeUpdate();
   System.out.println("4. sql문 전송!");
   }
   
   public void delete(BoardVo vo) throws Exception {
      System.out.println("dao에서 전달받은 값"+vo);
      int idx2 = vo.getIdx();
      String name2 = vo.getName();
      String content2 = vo.getContent();
      String title2 = vo.getTitle();
      Timestamp rgstdate2 = vo.getRgstdate();
      
      System.out.println("전달받은 id는"+ idx2);
      
      /* 1.connector(드라이버) 라이브러리 설정*/
      Class.forName("com.mysql.jdbc.Driver");      
      System.out.println("1.드라이버/커넥터 설정 성공!");

      /*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
      String url = "jdbc:mysql://localhost:3366/board";
      String user = "root";
      String pass = "1234";
      Connection con = DriverManager.getConnection(url,user,pass);      
      System.out.println("2.db연결 성공!");

      // 3.sql문을 생성
      String sql = "delete from board where idx = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      
      System.out.println("3.sql문객체 생성 성공!");
      ps.setInt(1, idx2);
      
      // 4.생성한 sql문을 mysql로 보낸다.
      ps.executeUpdate();
      System.out.println("4. sql문 전송!");
      }
   
   public BoardVo readOne(BoardVo vo) throws Exception {
	      System.out.println("dao에서 전달받은 값"+vo);
	      int idx2 = vo.getIdx();
	      String name2 = vo.getName();
	      String content2 = vo.getContent();
	      String title2 = vo.getTitle();
	      Timestamp rgstdate2 = vo.getRgstdate();
	      
	      System.out.println("전달받은 idx는"+ idx2);
	      System.out.println("전달받은 name는"+ name2);
	      System.out.println("전달받은 content는"+ content2);
	      System.out.println("전달받은 title는"+ title2);
	      System.out.println("전달받은 등록일은"+ rgstdate2);
	      
	      /* 1.connector(드라이버) 라이브러리 설정*/
	      Class.forName("com.mysql.jdbc.Driver");      
	      System.out.println("1.드라이버/커넥터 설정 성공!");

	      /*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(board)*/
	      String url = "jdbc:mysql://localhost:3366/board";
	      String user = "root";
	      String pass = "1234";
	      Connection con = DriverManager.getConnection(url,user,pass);      
	      System.out.println("2.db연결 성공!");

	      // 3.sql문을 생성
	      String sql = "select * from board where idx=?";
	      PreparedStatement ps = con.prepareStatement(sql);
	      
	      System.out.println("3.sql문객체 생성 성공!");
	      ps.setInt(1, idx2);

	      // 4.생성한 sql문을 mysql로 보낸다.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. sql문 전송!");
	      BoardVo vo2 = new BoardVo();
	      if(rs.next()) {	
	    	  String name = rs.getString("name");
	    	  String content = rs.getString("content");
	    	  String title = rs.getString("title");
	    	  Timestamp rgstdate = rs.getTimestamp("rgstdate");
	    	  vo2.setIdx(idx2);
	    	  vo2.setName(name);
	    	  vo2.setContent(content);
	    	  vo2.setTitle(title);
	    	  vo2.setRgstdate(rgstdate);    	  
	      }else {	
	    	  System.out.println("검색결과없음");
	      }
	      return vo2;
	   }
   
   public ArrayList<BoardVo> readAll() throws Exception {
	      /* 1.connector(드라이버) 라이브러리 설정*/
	      Class.forName("com.mysql.jdbc.Driver");      
	      System.out.println("1.드라이버/커넥터 설정 성공!");

	      /*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(board)*/
	      String url = "jdbc:mysql://localhost:3366/board";
	      String user = "root";
	      String pass = "1234";
	      Connection con = DriverManager.getConnection(url,user,pass);      
	      System.out.println("2.db연결 성공!");

	      // 3.sql문을 생성
	      String sql = "select * from board";
	      PreparedStatement ps = con.prepareStatement(sql);
	      
	      System.out.println("3.sql문객체 생성 성공!");


	      // 4.생성한 sql문을 mysql로 보낸다.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. sql문 전송!");
	      ArrayList<BoardVo> list = new ArrayList<>();
	      while(rs.next()) {	
				BoardVo vo2 = new BoardVo(); //가방역할. 아래 스트링 값들을 넣을거.
				int idx = rs.getInt("idx"); //String id = rs.getString("1"); 이랑 같다. 컬럼명으로 해도 되고 인덱스 순서로 줘도 된다.
				String name = rs.getString("name");
				String title = rs.getString("title");
				String content = rs.getString("content");
				vo2.setIdx(idx);
				vo2.setName(name);
				vo2.setName(title);
				vo2.setContent(content);
				list.add(vo2);
			}
			return list;
	   }
      
   public boolean login(BoardVo vo) throws Exception  {
		System.out.println("회원검색처리 처리 요청됨.");
		System.out.println("dao에서 전달받은 값"+vo);
		int idx2 = vo.getIdx();
		String name2 = vo.getName();
		
		System.out.println("전달받은 id는"+ idx2);
		
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
		ps.setInt(1, idx2);
		ps.setString(2, name2);

		
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