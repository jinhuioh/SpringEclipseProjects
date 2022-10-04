package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.TodoEntity;
import com.example.demo1.persistence.TodoRepository;

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

}
