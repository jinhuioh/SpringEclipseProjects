package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicecenterfaqDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public List<ServicecenterfaqVO> all() {
		return my.selectList("servicecenterfaq.list");
	}
	
	
}
