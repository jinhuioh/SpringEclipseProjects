package com.hi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;

	public int create(BbsVo vo) {
		return my.insert("bbs.create", vo);
		// my.insert(namespace.id) bbsMapper.xml에서 쓰여있는 namespace와 id
	}

	public BbsVo one(BbsVo vo) {
		return my.selectOne("bbs.one", vo);
	}

	public List<BbsVo> all() {
		return my.selectList("bbs.all");
	}

	public int delete(BbsVo vo) {
		return my.delete("bbs.del", vo);
	}

	public int update(BbsVo vo) {
		return my.update("bbs.up", vo);
	}
}
