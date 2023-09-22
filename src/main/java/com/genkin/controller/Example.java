package com.genkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	@GetMapping(value="/getThis")
	public String getThis() {
		return "AsainBatsha";
	}

}
