package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("app")
@Api(value = "My User Controller", description = "Rest Controller for Users")
public class MyTestController {
	
	List<User> list = new ArrayList<>();
	
	@ApiOperation(
			value = "Get Users",
			produces = "A List of Users",
			notes = "Hit this URL to get All Users"
			)
	@RequestMapping("/users")
	List<User> getAllUsers(){
		return list;
	}
	
	
	@ApiOperation(
			value = "Add a New User",
			consumes = "A new User in JSON",
			notes = "Hit this URL to add a new User"
			)
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody User user){
		list.add(user);
	}
	
	
	
	
}
