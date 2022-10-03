package com.example.demo1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.ResponseDTO;
import com.example.demo1.dto.TestRequestBodyDTO;
import com.example.demo1.service.TodoService;

import org.springframework.web.bind.annotation.PathVariable;// {id}와 같이 url의 경로로 넘어오는 값을 변수로 받을 수 있다.
import org.springframework.web.bind.annotation.RequestBody;

@RestController
//요청 컨트롤러 메서드 매핑. 클라이언트가 get메서드로 요청하면  @GetMapping에 연결된 컨트롤러가 실행된다.
// "localhost:8888/test" 의 get 메서드가 testController()에 연결된다는 뜻!!
@RequestMapping("todo")
public class TodoController {
	//TodoController내부에 선언된 TodoService에  @Autowired 어노테이션이 붙어 있는 것을 확인한다.
	// 자동으로 빈을 찾은다음 그 빈을 인스턴스 멤버 변수에 연결해준다.
	@Autowired
	private TodoService service;
	
	@GetMapping("/test")
	public ResponseEntity<?> testTodo(){
		String str = service.testService();//테스트 서비스 사용
		List<String> list = new ArrayList<>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}

	
}

