package com.ms.eclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/products/{prodNo}")
	public String home(@PathVariable("prodNo") int prodNo) throws InterruptedException {
		System.out.println("Fetching Product Details....."+prodNo);
		//TODO: uncomment thread.sleep() when you want to forcefully down the service for testing circuit breaker
		// circuit breaker enabled in product-service client application
		//Thread.sleep(1000*5);
		System.out.println("successfully Fetched product details, for "+prodNo);
		return "Feching Product details for: "+prodNo;
	}
}
