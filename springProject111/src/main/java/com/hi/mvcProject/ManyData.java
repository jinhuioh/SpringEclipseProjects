package com.hi.mvcProject;

import java.util.Random;

public class ManyData {

	public static void main(String[] args) {
		// 1. 고정된 크기를 가지고 있는 경우,
		//	  크기의 변화가 별로 없는 경우
		// 토익 990개 문제 
		// 정답, 내답 
		// => 배열 
		int[] 정답 = new int[990];
		int[] 내답 = new int[990];
		
		Random r = new Random(100);
		for (int i = 0; i < 990; i++) {
			정답[i] = r.nextInt(4) + 1; //1~4
			내답[i] = r.nextInt(4) + 1; //1~4
		}
		
		int count = 0;
		for (int i = 0; i < 990; i++) {
			if(정답[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println("최종 성적은 " + count + "점");

	}

}