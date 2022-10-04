// http응답을 반환할 때 비즈니스 로직을 캡슐화하거나 추가적인 정보를 함께 반환 하기 위해 dto사용
// DTO 를 Entity로 변환하기 위해 toEntity메서드를 작성하자.
package com.example.demo1.dto;

import com.example.demo1.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class TodoDTO {
	private String id;
	private String title;
	private boolean done;
	
	public TodoDTO(final TodoEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}
	// DTO 를 Entity로 변환하기 위해 toEntity메서드를 작성하자.
	public static TodoEntity toEntity(final TodoDTO dto) {
		return TodoEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.done(dto.isDone())
				.build();
	}
}
