package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.TodoEntity;
import com.example.demo1.persistence.TodoRepository;
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

}
