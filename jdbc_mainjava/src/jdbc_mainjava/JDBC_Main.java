package jdbc_mainjava; //crud를 이용해 게시판 만들기.

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC_Main {
	
	public static void main(String[] args) {	
		Database db = new Database();	
		Connection con =db.getConnection();	
			
		StudentsDAO stDAO = new StudentsDAO(con);
		
		Scanner scanner=new Scanner(System.in);
		while(true) {	
			System.out.println("회원(1:등록,2:수정,3:뷰,4:삭제,5:목록,q:끝내기:");
			String ch_num = scanner.nextLine();
			
			if(ch_num.equals("q")) {	//프로그렘끝내기
				System.out.println("안녕하계세요~");
				break;
			
			} else if (ch_num.equals("5")) {	
				
				PrintUtil.print_list(stDAO.list());
			
			} else if (ch_num.equals("1")) {	//회원정보 등록
	
				StudentsVO studentsVO = new StudentsVO();
				System.out.print("학생이름:");
				studentsVO.setS_name(scanner.nextLine());
				System.out.print("성별(1:남자, 2:여자):");	
				studentsVO.setS_gender(scanner.nextLine());
				System.out.print("phone:");	
				studentsVO.setS_phone(scanner.nextLine());
				System.out.print("birth:");	
				studentsVO.setS_birth(scanner.nextLine());
				//회원정보 db등록
				stDAO.insert(studentsVO);
				//회원목록 가져오기.
				PrintUtil.print_list(stDAO.list());
			
			} else if (ch_num.equals("3")) {	//회원정보뷰
				System.out.print("학생시퀀스:");
				PrintUtil.print_view(
						stDAO.view(Integer.parseInt(scanner.nextLine()))
						);
			} else if (ch_num.equals("2")) { //회원정보수정
				StudentsVO studentsVO = new StudentsVO();
				System.out.print("학생시퀀스:");
				studentsVO.setS_idx(Integer.parseInt(scanner.nextLine()));
				
				System.out.print("학생이름:");
				studentsVO.setS_name(scanner.nextLine());
				
				System.out.print("핸드폰:");
				studentsVO.setS_phone(scanner.nextLine());
				
				System.out.print("생년월일:");
				studentsVO.setS_birth(scanner.nextLine());
				
			
				System.out.print("학생성별:");
				studentsVO.setS_gender(scanner.nextLine());
			
				stDAO.update(studentsVO);
				
			
				PrintUtil.print_view(
						stDAO.view(studentsVO.getS_idx()));
				
			} else if(ch_num.equals("4")) {	//회원삭제하기.
				System.out.print("학생시퀀스:");
				stDAO.delete(Integer.parseInt(scanner.nextLine()));
				PrintUtil.print_list(stDAO.list()); //회원목록 가져오기.
			
			}
		}
		
		// 학생 한 명 등록
//		StudentsVO studentsVO = new StudentsVO();
//		studentsVO.setS_name("이순신");
//		studentsVO.setS_gender("1");
//		stDAO.insert(studentsVO);
		
		//학생정보를 하나 가져옵니다.
//		StudentsVO studentsVO=stDAO.view(22);
//		PrintUtil.print_view(studentsVO);
		
		//학생정보를 하나 수정
//		StudentsVO studentsVO = new StudentsVO();
//		studentsVO.setS_idx(22);
//		studentsVO.setS_name("이숙희");
//		studentsVO.setS_gender("2");
//		stDAO.update(studentsVO);
		
		//학생정보를 하나 가져옵니다.
	//	PrintUtil.print_view(stDAO.view(22));
		
		//학생 목록가져오기
//		ArrayList<StudentsVO> list = stDAO.list();
//		PrintUtil.print_list(list);
		
		//학생 한명 삭제
//		stDAO.delete(32);
//		ArrayList<StudentsVO> list = stDAO.list(); //arraylist함수를 써야 나머지 정보들이 정렬되어 나온다.
//		PrintUtil.print_list(list);
		
		scanner.close();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
