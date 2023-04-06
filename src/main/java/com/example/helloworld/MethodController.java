package com.example.helloworld;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	
	@GetMapping("/")//should look like http://localhost:8080/?firstname=Mike&lastname=W
	public String queryParamExample(@RequestParam String firstname, @RequestParam String lastname) {
		return "Hello "+ firstname + " " + lastname;
	}
	@GetMapping("/{name}")
	public String queryParamExample2(@PathVariable String name ) {
		return "Hello "+name;
	}
	@GetMapping("/hello")
	public String getTest() {
		return "GET method called";
	}
	@PostMapping("/")
	public String postTest() {
		return "POST method called";
	}
	@PutMapping("/")
	public String putTest() {
		return "PUT method called";
	}
	@DeleteMapping("/")
	public String deleteTest() {
		return "DELETE method called";
	}

}
