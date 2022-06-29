//쎔이 하신거

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle_Insert {

	public static void main(String[] args) {
		Connection con=null;  
		PreparedStatement ps=null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
	      String id = "jspuser";
	      String pw = "12345";
	      String query ="INSERT INTO USERS(U_IDX,U_NAME,U_ID,U_PW,U_RGSTDATE)";
	      query= query +"VALUES(USERS_SEQ.NEXTVAL,'무명','룰루','ㅈㅈ',systimestamp)"; //query값을 저장하는데 뒤에 값을 붙여서 저장할거다.USERS_SEQ.NEXTVAL,?,?,?,systimestamp
	      try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				con = DriverManager.getConnection(url, id, pw);
				ps = con.prepareStatement(query);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	      } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {	
			if(ps!=null) {
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
