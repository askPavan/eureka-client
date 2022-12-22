package com.ms.eclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/products/{prodNo}")
	public String home(@PathVariable("prodNo") int prodNo) {
		System.out.println("Fetching Product Details....."+prodNo);
		return "Feching Product details for: "+prodNo;
	}
}
