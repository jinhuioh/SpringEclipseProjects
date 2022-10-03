package com.example.demo1.dto;

import lombok.Data;
//@Data는 getter&setter을 구현해준다.p93
@Data
public class TestRequestBodyDTO {
	//컨트롤러에 TestRequestDTO를 요청 바디로 받는 testControllerRequestBody()메서드 추가
	private int id;
	private String message;
}
