package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Servicecenter2DAO {
	@Autowired
	SqlSessionTemplate my;
	
	public int create (Servicecenter2VO vo) {
		return my.insert("servicecenter2.create",vo);
	}
	
	public Servicecenter2VO readOne (Servicecenter2VO vo) {
		return my.selectOne("servicecenter2.one",vo);
	}
	public List<Servicecenter2VO> all() {
		return my.selectList("servicecenter2.list");
	}
	
	public int update (Servicecenter2VO vo) {
		return my.insert("servicecenter2.up",vo);
	}
	
	public int delete (Servicecenter2VO vo) {
		return my.insert("servicecenter2.del",vo);
	}
	
	public int number (Servicecenter2VO vo) {
		return my.update("servicecenter2.number",vo);
	}
	
}
