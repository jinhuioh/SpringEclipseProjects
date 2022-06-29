package jdbc;
//scanner이용해서 업데이트하고(수정)전체 시퀀스 보여주기.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JDBC_DELET {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.print("시퀀스:");
		String std_idx = scanner.nextLine();
		scanner.close();
		
		Connection con=null;
		Statement stm=null;
		ResultSet rs   = null;
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "wls2gml2!!";
	
		String query  ="DELETE FROM students WHERE s_idx="+std_idx;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con= DriverManager.getConnection(url, user,pw);
			stm = con.createStatement();
			//--------------- UPDATE 수행[START]
			int cnt = stm.executeUpdate(query);
			System.out.println(cnt+"개의 데이타 수정");
			//--------------- UPDATE 수행[END]
			
			//--------------- SELECT 수행[START]
			query = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
					+ "from students s left join duty d\r\n"
					+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
					+ "d.d_ranking, s.s_name";
			rs = stm.executeQuery(query);
			
			
			
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy년MM월dd일");
			String std_gender_0="";
			while(rs.next()) {
				if(rs.getString("s_gender").equals("1")) {
					std_gender_0 = "남자";
				} else {
					std_gender_0= "여자";
				}
				if(rs.getString("d_name") == null) { 
					System.out.println(rs.getString("s_idx")
						+" | "+"반학생 | "+rs.getString("s_name")
						+" | "+std_gender_0
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
						
				} else {
					System.out.println(rs.getString("s_idx")
						+" | "+rs.getString("d_name")
						+" | "+rs.getString("s_name")
						+" | "+std_gender_0
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
						
				}
			}
			//--------------- SELECT 수행[END]
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				System.out.println("커넥션이 아직 살아 있음.");
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("커넥션을 끊음.");
			}
			if(stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}