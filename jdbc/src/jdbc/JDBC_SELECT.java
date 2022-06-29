package jdbc;
// select 구문을 이용하여 2를선택하면 여자 또는 1을 선택하면 남자만 system상에 보이게 하는방법
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author hi
 * 학생 추가
 */

public class JDBC_SELECT {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		

		System.out.print("성별(1:남자, 2:여자):"); //("성별(1:남자, 2:여자):" 로 보이도록 하겠다.
		String std_gender = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
		String url  = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw   = "wls2gml2!!";
		String query = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
				+ "from students s left outer join duty d\r\n"
				+ "on s.d_idx = d.d_idx"
				+ " where s.s_gender=?"   // gender값 내가 입력하도록 지정하지 않는다.  where s_gender='1' or where s_gender='2'또는 s_gender 안적으면 여자남자 상관없이 시퀀스 가져옴.
				+ " order by d.d_ranking is null asc,\r\n"
				+ "d.d_ranking, s.s_name";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC 드라이버 로딩~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공~");
			//preparedstatement 객체 생성
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, std_gender);
			
			rs = pstmt.executeQuery();
			//5. 받은 결과에서 데이타 얻기
			// 데이타가 두개 이상
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy년MM월dd일");
			String std_gender_0 = "";
			while(rs.next()) {//다음번 데이타가 있는지 확인.
				if(rs.getString("s_gender").equals("1")) { //1일때 남자 else 여자 도출
					std_gender_0 = "남자";
				} else {
					std_gender_0 = "여자";
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