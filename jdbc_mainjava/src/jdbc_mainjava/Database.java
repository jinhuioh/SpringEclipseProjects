package jdbc_mainjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*	
 * 	
 * 	
 * 데이터베이스 커넥션 연결
 */

public class Database {
	private Connection con;
	public Database() {	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Mariadb 드라이버 로딩");
			String connurl = "jdbc:mariadb://localhost:3306/sharedb";	
			String user = "sharedb";	
			String pwd = "wls2gml2!!";
			con = DriverManager.getConnection(connurl, user, pwd);
			System.out.println("Mariadb Connection 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {	
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {	
		return con;
	}
	
}
