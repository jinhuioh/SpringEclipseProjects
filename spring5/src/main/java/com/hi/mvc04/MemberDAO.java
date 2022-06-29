package com.hi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//크루드
@Component
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;

	public void create(MemberVo vo) {
		my.insert("member.create", vo);
	}

	public int update(MemberVo vo) {
		return my.update("member.up", vo);
	}

	public int delete(MemberVo vo) {
		return my.delete("member.del", vo);
	}

	public MemberVo readOne(MemberVo vo) {
		return my.selectOne("member.one", vo);
	}

	public List<MemberVo> readAll() {
		return my.selectList("member.all");

	}

	public MemberVo login(MemberVo vo) {
		return my.selectOne("member.login", vo);
	}

}
