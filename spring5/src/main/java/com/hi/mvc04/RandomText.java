package com.hi.mvc04;

import java.util.Random;

public class RandomText {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			//System.out.println(r.nextBoolean());	
			
			//int는 4바이트 -21억~21억까지의 수 나타낼 수 있다.
			System.out.println(r.nextInt());
			
			//0~9까지 수 발생.
			System.out.println(r.nextInt(10));
			
			//0~9->1~10으로 바꿔주기. 
			System.out.println(r.nextInt(10)+1);
			
			//0~99나오게 만들어보기.
			System.out.println(r.nextInt(100));
			
			//10~90나오게 만들어보기. 아래:80+10이랑 같은거임.
			System.out.println(r.nextInt(81)+10);
		}
	}

}
