package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/display")
	public String show()
	{
		return "helloooooooooooooo";
	}

}
