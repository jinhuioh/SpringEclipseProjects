package jdbc_mainjava;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class PrintUtil {
	
	public static void print_list(ArrayList<StudentsVO> list) {	
		String std_gender ="";
		String std_duty ="";
		System.out.println("시퀀스 | 성별 | 이름 | 직함 | 휴대폰 | 생년월일 |등록일");
		for(StudentsVO studentsVO : list) {	
			if(studentsVO.getD_name()==null) {	
				std_duty="반학생";
			} else {	
				std_duty = studentsVO.getD_name();
			}
			if(studentsVO.getS_gender().equals("1")) {	
				std_gender="남자";
			} else {	
				std_gender = "여자";
			}
			System.out.println(studentsVO.getS_idx()+"|"+
					std_gender+"|"+studentsVO.getS_name()+"|"+
					std_duty+"|"+studentsVO.getS_phone()+"|"+
					studentsVO.getS_birth()+"|"+
					studentsVO.getS_rgstdate());
		}
		
	}
	
	public static void print_view(StudentsVO studentsVO) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println("===========================");
		System.out.println("시퀀스:"+studentsVO.getS_idx());
		System.out.println("이름:"+studentsVO.getS_name());
		System.out.println("핸드폰:"+studentsVO.getS_phone());
		System.out.println("생년월일:"+studentsVO.getS_birth());
		if(studentsVO.getS_gender().equals("1")) {	
			System.out.println("성별:남자");
		} else {	
			System.out.println("성별:여자");
		}
		if(studentsVO.getD_name()==null) {	
			System.out.println("직함:반학생");
		} else {	
			System.out.println("직함:"+studentsVO.getD_name());	
		}
		
		if(studentsVO.getS_mdfydate()==null) {	
			System.out.println("수정일없음");
		} else {	
			System.out.println("수정일:"+format.format(studentsVO.getS_mdfydate()));
		}
		
		System.out.println("등록일:"+format.format(studentsVO.getS_rgstdate()));
		System.out.println("===========================");
	}

	public static void classprint_view(StudentsVO studentsVO) {
		// TODO Auto-generated method stub
		
	}

	public static void print_view(StudentsDAO stDAO) {
		// TODO Auto-generated method stub
		
	}

	public static void print_view(int s_idx) {
		// TODO Auto-generated method stub
		
	}
	
	
}
