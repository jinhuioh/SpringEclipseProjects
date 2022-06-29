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


public class JDBC_SELECT_oracle { 

	public static void main(String[] args) {
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "jspuser";
		String pw = "12345";
		String query = "SELECT * FROM users";
				
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 드라이버 로딩~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공~");
			//preparedstatement 객체 생성
			pstmt = con.prepareStatement(query);

			
			
			rs = pstmt.executeQuery();
			//5. 받은 결과에서 데이타 얻기
			// 데이타가 두개 이상
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy년MM월dd일");
			
			while(rs.next()) {//다음번 데이타가 있는지 확인.
				String u_idx = rs.getString("u_idx");
				String u_name = rs.getString("u_name");
				String u_id = rs.getString("u_id");
				String u_pw = rs.getString("u_pw");
				System.out.println("-----------------------------");
				System.out.println(u_idx+""+"|"+u_name+""+"|"+u_id+""+"|"+u_pw+"");
			}
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