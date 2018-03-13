package com.ibm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.MessageProperties;

@RestController
public class DemoController {
	@Autowired
	private MessageProperties properties;

	@GetMapping( "/message" )
	public String hello() {
		return properties.toString();
	}
}