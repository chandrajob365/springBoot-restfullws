package com.stackSimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {
	// Simple Method
	// @RequestMapping(method = RequestMethod.GET, path="/helloWorld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "helloworld1";
	}
	
	@GetMapping("/helloworld2")
	public UserDetails helloWorldBean() {
		return new UserDetails("Manish", "Chandra", "Bangalore");
	}
}
