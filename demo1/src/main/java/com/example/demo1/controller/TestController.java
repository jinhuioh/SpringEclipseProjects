package com.example.demo1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.ResponseDTO;
import com.example.demo1.dto.TestRequestBodyDTO;

import org.springframework.web.bind.annotation.PathVariable;// {id}와 같이 url의 경로로 넘어오는 값을 변수로 받을 수 있다.
import org.springframework.web.bind.annotation.RequestBody;

@RestController
//요청 컨트롤러 메서드 매핑. 클라이언트가 get메서드로 요청하면  @GetMapping에 연결된 컨트롤러가 실행된다.
// "localhost:8888/test" 의 get 메서드가 testController()에 연결된다는 뜻!!
@RequestMapping("test")
public class TestController {
	//http://localhost:8080/test/testGetMapping을 실행하는 경우 
	@GetMapping("/testGetMapping")
	public String testControllerWithPath() {
		return "hello world! testGetMapping";
	}
	//매개변수 /{id}는 경로로 들어오는 임의의 숫자 또는 문자를 변수 id에 매핑하라는 뜻이다.
	//예를들어 http://localhost:8080/test/123을 실행하는 경우 컨트롤러의 id변수에 123이 들어간다.
	//(required = false)는 이 매개변수가 꼭 필요한 것은 아니라는 뜻이다. 따라서 id = 123을 명시하지 않아도 에러가 발생하지 않는다.
	@GetMapping("/{id}")
	public String testControllerWithPathVariables(@PathVariable(required = false) int id) {
		return "hello world! id는>> " + id;
	}
	//@PathVariable과 같은 방법으로 @RequestParam이 있다.
	//http://localhost:8080/test/testRequestParam?id=123와 같이 실행시키면 된다.
	@GetMapping("/testRequestParam")
	public String testControllerRequestParam(@RequestParam(required = false) int id) {
		return "@RequestParam을 이용한, hello world! id는>> " + id;
	}
	//TestRequestDTO를 요청바디로 받는 메서드
	//@RequestBody 를 이용하여 RequestBody로 보내오는 json을 TestRequestBodyDTO 오브젝트로 변환해 가져와보자.
	//클라이언트는 요청바디로 json형태의 문자열을 넘겨준다.(id는 정수이므로 문자열이 들어가면 오류가 발생하게 된다.)
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "@RequestBody를 이용한 hellow world!!" + testRequestBodyDTO.getId()
				+ "Message: " + testRequestBodyDTO.getMessage();
	}
	// ResponseDTO를 리턴하는 컨트롤러 구현
	@GetMapping("/testResponseBody")
	public ResponseDTO<String> testControllerResponseBody() {
		List<String> list = new ArrayList<>();
		list.add("hellow world! Im ResponseDTO");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return response;
	}
	// ResponseEntity를 리턴하는 컨트롤러 구현
	@GetMapping("/testResponseEntity")
	public ResponseEntity<?> testControllerResponseEntity() {
		List<String> list = new ArrayList<>();
		list.add("hellow world! Im ResponseEntity");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
	
}

