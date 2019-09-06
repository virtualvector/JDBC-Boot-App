package com.socgen.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	TestDao dao;

	@RequestMapping("/usercount")
	String getUserCount() {
		return dao.getUserCount();
	}
	
}
