package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_Update {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Connection con = null;//database연결을 위한 객체
		
		Statement stm=null; //SQL문을 서버로 보내기 위한 객체	
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "wls2gml2!!";
		String query = "UPDATE students SET s_name='홍길순', s_gender='2' where s_idx=8";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con= DriverManager.getConnection(url, user,pw);
			stm = con.createStatement();
			//stm.execute(query);
			if(stm.executeUpdate(query)>0) {	
				System.out.println("수정된 값있음");
			} else {	
				System.out.println("수정된 값없음");
			}
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		} finally {	
			if(con !=null) {
				System.out.println("커넥션이 아직 살아 있음.");
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("커넥션을 끊음.");
			}
		}
		

	}

}
