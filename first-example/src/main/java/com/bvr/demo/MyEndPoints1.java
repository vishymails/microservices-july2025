package com.bvr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints1 {

	@RequestMapping("/mypage")
	public String myString() {
		return "First MicroService Example";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome : " + name;
	}
	
	
	@RequestMapping(path="/pathvarexample/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Path Definitions : " + name;
	}
	
	
	@GetMapping(path = "/secondSampleBean")
	public SecondSampleBean secondBean() {
		return new SecondSampleBean("For Oracle India");
	}
}
