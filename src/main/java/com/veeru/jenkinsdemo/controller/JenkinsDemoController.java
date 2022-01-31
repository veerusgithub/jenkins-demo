package com.veeru.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemoController {

	@GetMapping
	public String getMessage() {
		return "Hey!!! i am going to deploy through Jenkins";
	}
}
