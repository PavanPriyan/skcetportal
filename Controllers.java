package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	private String studentName="MyName";
	@GetMapping("/name")
	public String getName() {
		return "Welcome " + studentName;
	}

}
