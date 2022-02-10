package com.nate.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName) {
		if(firstName == null) {
			return "Hello Human";
		} else {
			return "Hello " + firstName + " " + lastName;
		}
	}
}