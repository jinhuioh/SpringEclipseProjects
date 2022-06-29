package ex_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Date에 오류뜨는데 이게 Date개체 사용지정을 안해서 그럼. Date클릭하구 util입력하면 된다.
		// 아니면 import java.util.Date;를 pakage주소 아래에 적으셈
			
		
		
		Board board= new Board();	
		board.setIdx(1);	
		board.setId("incarus");
		board.setName("jinhui");
		board.setContents("코딩 재미있다");
		board.setTitle("행복");	
		board.setRgstdate(new Date());	
			
		Board board2=new Board();	
		board2.setIdx(2);	
		board2.setId("aaa779979");
		board2.setName("진희");
		board2.setContents("동해물과백두산이");
		board2.setTitle("애국가");	
		board2.setRgstdate(new Date());	
			
		ArrayList<Board> list = new ArrayList<Board>();	
		list.add(board);	
		list.add(board2);	
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy.mm.dd");	//이 식을써야 날짜가 이쁘게 나옴.
		
		for(int i=0;i<list.size();i++) {	
			Board boardreturn = (Board)list.get(i);	
			
			System.out.println("시퀀스:"+boardreturn.getIdx());	
			System.out.println("아이디:"+boardreturn.getId());	
			System.out.println("제목:"+boardreturn.getTitle());	
			System.out.println("이름:"+boardreturn.getName());	
			System.out.println("내용:"+boardreturn.getContents());
			System.out.println("날짜:"+simpleDateFormat.format(boardreturn.getRgstdate()));	
			System.out.println("========================");
		}

	}

}
