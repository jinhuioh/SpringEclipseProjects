package com.hi.mvcProject;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BoardVO vo) {
		return my.insert("board.insert", vo);
	}
	
	public BoardVO one(BoardVO vo) {
		return my.selectOne("board.one", vo);
	}
	
	public List<BoardVO> all(){
		return my.selectList("board.list");
	}
	
	public int update(BoardVO vo) {
		return my.update("board.update", vo);
	}
	
	public int delete(BoardVO vo) {
		return my.delete("board.delete", vo);
	}
}