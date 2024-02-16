 package com.example.demo;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@GetMapping("/getData")
	public String getData() {
		return "data";
	}

}
