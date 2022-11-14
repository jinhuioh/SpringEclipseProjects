package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.TodoEntity;
import com.example.demo1.persistence.TodoRepository;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;
// 서비스 구현에 디버깅을 위한 로그 설정.
// 정보, 디버깅, 경고,에러 등을 위한 로그를 로그레벨이라고 하고 System.out.println으로 모두 구현할 수 있지만, 비효율적이다.
// SLf4j는 이러한 기능을 제공하는 라이브러리이다.
@Slf4j
// 스테레오타입 어노테이션. 기능적으로 비즈니스 로직을 수행하는 서비스 레이어임을 알려주는 어노테이션이다.
@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	
	public String testService() {
		// TodoEntitiy 생성
		TodoEntity entity = TodoEntity.builder().title("My first Todo item").build();
		
		// TodoEntitiy 저장
		repository.save(entity);
		
		// TodoEntitiy 검색
		TodoEntity saveEntity = repository.findById(entity.getId()).get();
		
		return saveEntity.getTitle();
	}
	
	//create 구현---------------------------------------------------------------------------
	public List <TodoEntity> create(final TodoEntity entity){
		//validations
		//경고창
		if(entity == null) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null!");
		}
		//유저 아이디가 null 일 때
		if(entity.getUserId() == null) {
			log.warn("Unkown user.");
			throw new RuntimeException("Unknown user!");
		}
		//저장
		repository.save(entity);
		//저장된 user Id
		log.info("Entity Id: {} is saved.", entity.getId());
		return repository.findByUserId(entity.getUserId());
	}//public List(create)
	
	//코드 리팩토링
	//검증 부분은 다른 메서드에서도 계속 쓰일 예정이므로 private method로 리팩토링한다.
	private void validate(final TodoEntity entity) {
		//경고창
		if(entity == null) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null!");
		}
		//유저 아이디가 null 일 때
		if(entity.getUserId() == null) {
			log.warn("Unkown user.");
			throw new RuntimeException("Unknown user!");
		}//if
	}//private void
	//read(검색) 구현---------------------------------------------------------------------------
	public List <TodoEntity> retrieve(final String userId){
		return repository.findByUserId(userId);
	}//public List(retrieve)

	//update 구현---------------------------------------------------------------------------
	public List <TodoEntity> update(final TodoEntity entity){
		//1.저장할 엔티티가 유효한지 확인.(Create Todo에서 구현한 메서드 이용)
		validate(entity);
		//2.넘겨받은 엔티티 id를 이용해 TodoEntity를 가져온다. 존재하지 않은 엔티티는 업데이트 할 수 없기 때문
		final java.util.Optional<TodoEntity> original = repository.findById(entity.getId());
		
		original.ifPresent(todo -> {
			//3.반환된 TodoEntity가 존재하면 값을 새 entity값으로 덮어 씌운다.
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());
			
			//4.db에 새 값을 저장
			repository.save(todo);
		});
			return retrieve(entity.getUserId());
	}//public update

	//delete 구현---------------------------------------------------------------------------
	public List <TodoEntity> delete(final TodoEntity entity){
		//1.저장할 엔티티가 유효한지 확인.
		validate(entity);
		try {
			//2.엔티티 삭제
			repository.delete(entity);
		} catch(Exception e) {
			//3.exception 발생 시 id와 exception을 로깅한다.
			log.error("error deleting entity!!",entity.getId(),e);
			
			//4.컨트롤러로 exception을 보낸다. 데이터베이스 내부 로직을 캡슐화 하려면 e를 리턴하지 않고 새 exception오브젝트를 리턴한다.
			//4번 무슨말인지 잘 모르겠음..좀 더 공부해보자.
			throw new RuntimeException("error deleting entity!!" + entity.getId());
			
		}
		//5. 새 Todo 리스트를 가져와 리턴한다.
		return retrieve(entity.getUserId());
	}//delete
	
	
}//public class
	
	
	
	
	

