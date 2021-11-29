package com.sreenu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sreenu.beans.UserDetails;

/**
 * @author sreenivasulu
 *
 */
@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET,path = "/hello")
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/user")
	public UserDetails getUser() {
		return new UserDetails("sreenivas","sadu","Bangalore");
	}

}