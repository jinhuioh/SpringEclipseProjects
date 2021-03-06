package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC_Test_2 {

	public static void main(String[] args) {
		Connection con = null; // database 연결을 위한 객체
		Statement stm  = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "wls2gml2!!";
		String query  = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
				+ "from students s left outer join duty d\r\n"
				+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
				+ "d.d_ranking, s.s_name";
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			//2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			//3. Satement 객체 생성
			stm = con.createStatement();
			//4. 쿼리 실행후 결과를 리턴
			rs = stm.executeQuery(query);
			//5. 받은 결과에서 데이타 얻기
			// 데이타가 두개 이상
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy년MM월dd일");
			String std_gender = "";
			while(rs.next()) {//다음번 데이타가 있는지 확인
				if(rs.getString("s_gender").equals("1")) {
					std_gender = "남자";
				} else {
					std_gender = "여자";
				}
				if(rs.getString("d_name") == null) { 
					System.out.println(rs.getString("s_idx")
						+" | "+"반학생 | "+rs.getString("s_name")
						+" | "+std_gender
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				} else {
					System.out.println(rs.getString("s_idx")
						+" | "+rs.getString("d_name")
						+" | "+rs.getString("s_name")
						+" | "+std_gender
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}	
			}
		}
	}
}
					// TODO Auto-generated catch block
					