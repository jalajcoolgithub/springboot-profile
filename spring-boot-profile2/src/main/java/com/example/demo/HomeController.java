package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/show")
	public String show()
	{
		String url="http://localhost:9092/home";
		return restTemplate.getForObject(url, String.class);
		 
	}
	
	@Bean
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
