package com.shubham.Api5.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@PostMapping("/addemployee")
	public ResponseEntity<String> addEmployee(@RequestBody User newUser ) {
				
		System.out.println(newUser.getName());
		System.out.println(newUser.getPhoneno());
		System.out.println(newUser.getDepartmentit());
		System.out.println(newUser.getCid());
		
		
		return new ResponseEntity<>("Employee Added Successfully..!", HttpStatus.OK);
		
	}

}
