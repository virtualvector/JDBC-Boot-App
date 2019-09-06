package com.socgen.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String getUserCount() {
		String qry = "select count(*) from userdetails";
		
		return jdbcTemplate.queryForObject(qry, String.class);
	}
}
