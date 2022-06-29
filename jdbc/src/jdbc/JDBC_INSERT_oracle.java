
//내가한거
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class JDBC_INSERT_oracle {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);      
   
      System.out.print("학생이름:");
      String u_name = scanner.nextLine();
      System.out.print("아이디:");
      String u_id = scanner.nextLine();
      System.out.print("패스워드:");
      String u_pw = scanner.nextLine();
      
      scanner.close();
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
      String url = "jdbc:oracle:thin:@localhost:1521/xe";
      String user = "jspuser";
      String pw = "12345";
      String query ="INSERT INTO users(U_IDX,U_NAME,U_ID,U_PW,U_RGSTDATE) values(USERS_SEQ.NEXTVAL,?,?,?,systimestamp)";
     
   //oracle은 not null로 지정해놓으면 그것자체가 바꿀수 없는 값이 되어서 
   // value 값에 USERS_SEQ.NEXTVAL(시퀀스),systimestamp(시간)를 넣어 자동으로 다음값을 저장하라고 시켜야한다.mysql,postgresql은 
   //그냥 vaulues(?,?,?);만 해줘도 된다... 
      
      try {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 드라이버 로딩~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공~");
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, u_name);
			pstmt.setString(2, u_id);
			pstmt.setString(3, u_pw);
			
			
			int cnt = pstmt.executeUpdate();
			System.out.println("학생한명 등록~");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}