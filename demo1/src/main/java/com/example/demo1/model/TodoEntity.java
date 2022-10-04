//데이터베이스에 저장하기 위해 유저가 정의한 클래스
//일반적으로 RDBMS에서 Table을 객체화 시킨 것으로 보면 된다
package com.example.demo1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
// 자바 클래스를 엔티티로 지정하려면 아래와 같이 어노테이션을 추가해준다.
@Entity
// 테이블 이름을 Todo로 지정.이 엔티티는 Todo테이블에 매핑된다는 뜻이다.
@Table(name="Todo")
public class TodoEntity {
	// @Id는 기본키가 될 필드에 지정한다. 우리의 경우 id가 기본키이므로 id필드 위에 @Id를 추가해야한다.
	@Id
	// id필드는 오브젝트를 데이터베이스에 저장할 때마다 생성할 수도 있지만 @GeneratedValue어노테이션을 이용하여 자동으로 생성가능하다.
	// 매개변수인 generator을 "system-uuid" 방식으로 id를 생성하겠다는 의미. 기본 Generator가 아니라 나만의 Generator을 사용하고 싶은 경우 이용
	// 문자열 형태의 UUID의 사용을 위해 커스텀 generator을 만들었다.
	// 매개변수 strategy로 "uuid"를 넘겼다. 이렇게 uuid를 사용하는 "system-uuid"라는 이름의 GenericGenerator을 만들었고, 
	// 이 Genertor는 @GeneratoedValue가 참고해서 사용한다.
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;// 이 오브젝트의 아이디
	private String userId;// 이 오브젝트를 생성한 사용자의 아이디
	private String title;// todo title(ex. 운동하기)
	private boolean done;//true - todo를 완료한 경우(checked)
}
