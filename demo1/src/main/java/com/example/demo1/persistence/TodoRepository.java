//TodoRepository는 JpaRepository를 상속한다.
//JpaRepository는 기본적인 데이터베이스 오퍼레이션 인터페이스를 제공(save, findById, findAll 등).
//구현은 JPA실행시 자동으로 해준다. 따라서 save메서드를 구현하려고 "Insert into..."와 같은 sql쿼리를 작성할 필요가 없다.
package com.example.demo1.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo1.model.TodoEntity;
// JpaRepository는 인터페이스이다. 이 인터페이스를 사용하려면 새 인터페이스를 작성해 JpaRepository를 확장해야한다. 
// TodoEntity는 테이블에 매핑될 엔티티 클래스이고, String은 이 엔티티의 기본키 타입이다.

//@Repository를 통해 이 클래스를 루트 컨테이너에 빈(Bean) 객체로 생성.
//루트 컨테이너의 객체는 어디서든 공유가능하기 때문에, 아래와 같이 자동 의존성 주입(DI) 어노테이션을 이용해 객체를 받아올 수 있다.
//DI를 통해, TodoService.java파일에서 TodoRepository를 사용.
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
	// 스프링 데이터 jpa가 메서드 이름을 파싱해서 select * from TodoRepository Wehre userId = '{userId}'와 같은 쿼리를 작성해 실행한다.
//	List<TodoEntity> findByUserId(String userId);
	
	//@Query를 이용하여 위와 같이 메서드를 작성할 수 있다.
	// ?1은 메서드의 매개변수의 순서 위치이다. 
	@Query("select * from Todo t where t.userId = ?1")
	List<TodoEntity> findByUserId(String userId);
	
}
