package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	private String yourFavColor="Blue";
	@GetMapping("/col")
	public String getName() {
		return "My favorite color is " + yourFavColor;
	}

}
