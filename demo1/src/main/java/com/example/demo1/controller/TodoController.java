// 컨트롤러는 사용자에게 TodoDTO를 요청 바디로 넘겨받고 이를 TodoEntity로 변환하여 저장해야한다.
// 또한 TodoService의  CRUD(예 create())가 리턴하는 TodoEntity를 TodoDTO로 변환해 리턴해야한다.
package com.example.demo1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.ResponseDTO;
import com.example.demo1.dto.TestRequestBodyDTO;
import com.example.demo1.dto.TodoDTO;
import com.example.demo1.model.TodoEntity;
import com.example.demo1.service.TodoService;

import org.springframework.web.bind.annotation.PathVariable;// {id}와 같이 url의 경로로 넘어오는 값을 변수로 받을 수 있다.
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

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
	
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			String temporaryUserId = "temporary-user"; // temporary user id.
			//1.TodoEntity로 변환
			TodoEntity entity = TodoDTO.toEntity(dto);
//			
			//2.id를 null로 초기화한다. 생성 당시에는 id가 없어야 하기 때문
			entity.setId(null);
			
			//3.임시 사용자 아이디를 설정해준다. 지금은 temporary-user 사용자만 인증 없이 사용 할 수 있는 애플리케이션.(수정할 예정)
			entity.setUserId(temporaryUserId);
			
			//4.서비스를 이용해 Todo 엔티티를 생성한다.
			List<TodoEntity> entities = service.create(entity);

			//5.자바 스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//6.변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			//7.ResponseDTO를 리턴한다.
			return ResponseEntity.ok().body(response);
			
		}
		catch (Exception e) {
			//8.혹시 예외가 있는 경우 dto대신 error에 메세지를 넣어 리턴한다.
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);// 예외가 있는경우 badRequest()로 response를 리턴해준다.
		}//catch
		
	}//createTodo
	
	@GetMapping
	public ResponseEntity<?> retrieveTodoList(){
		String temporaryUserId = "temporary-user";//temporary user id.
		//1.서비스의 메서드의 retrieve()메서드를 사용해 Todo리스트를 가져온다.
		List<TodoEntity> entities = service.retrieve(temporaryUserId);
		
		//2.자바 스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO리스트로 변환한다.
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		
		//3.변환된 TodoDTO리스트를 이용해 ResponseDTO를 초기화한다.
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		
		//4.ResponseDTO를 리턴한다.
		return ResponseEntity.ok().body(response);
	}
	
}

