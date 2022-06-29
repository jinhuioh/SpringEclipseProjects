package jdbc;
//null 값제외하고 불러오기.,join해서 가져오는거. 기존거에서 timestamp(simpledataformat)추가
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC_Test {

	public static void main(String[] args) {
		Connection con = null;//database연결을 위한 객체
		
		Statement stm=null; //SQL문을 서버로 보내기 위한 객체
		ResultSet rs=null; //SQL문을 실행하고 결과를 받기 위한 객체
		
		
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "wls2gml2!!";
		
		
		String query = "select s.s_idx, s.s_name , s.s_gender ,d.d_ranking, d.d_idx , d.d_name,s.s_rgstdate\r\n"
				+ "from students s , duty d \r\n"
				+ "where s.d_idx = d.d_idx  order by d.d_ranking";
		
		// try catch 구문을 mariadb 나 postgresqldb로 사용하려면 
		//jdbc상위폴더 선택->왼쪽클릭 후 properties->libraries->modul path->add external jars-> 로컬디스크c에서 lib폴더에서 mysqldb알집 또는 postgresqldb알집 선택
		try {
		
			//1.JDBC 드라이버 로딩
			Class.forName("org.mariadb.jdbc.Driver");
		//	Class.forName("org.postgresql.Driver"); 이거 postgresql도 사용가능!!! 
			System.out.println("JDBC 드라이버 로딩 성공~");
		
			
			//2.connection 생성
			con =DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공~");
		
			//3. Statement 객체 생성
			stm =con.createStatement();
			
			//4.쿼리 실행후 결과를 리턴
			rs = stm.executeQuery(query);

			
			//5.받은 결과에서 데이터 얻기
			
			// 레코드 개수가 여러개일때(while) 
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy년mm월dd일");
			while(rs.next()) {	//다음번 데이터가 있는지 확인
				if(rs.getString("d_name") ==null) {	
					System.out.println(rs.getString("s_idx")
							+" | "+ 
							rs.getString("s_name")
							+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				} else {	
					System.out.println(rs.getString("s_idx")
							+" | "+ 
							rs.getString("s_name")
							+" | "+ 
							rs.getString("d_name")
							+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
					
				}
			}
		}
				
		
			
			
			
		 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
			//system.out.println("error:"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally  {
			
			//6.Statement객체 close&반환
			if(stm != null) {	// '!=' 는 '아닐때~'를 뜻한다. '! =' 이렇게 띄어쓰기 하면 오류남. 꼭 붙여서 쓰기. 
				// close 눌러서 2번째꺼 s어쩌고 그거 클릭해야 try catch구문 자동생성
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			
			//7. ResultSet 객체 close&반환 
			if(rs !=null) {	
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//8. Connection사용후 close&반환
			if(con !=null) {	
				 	
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
 
