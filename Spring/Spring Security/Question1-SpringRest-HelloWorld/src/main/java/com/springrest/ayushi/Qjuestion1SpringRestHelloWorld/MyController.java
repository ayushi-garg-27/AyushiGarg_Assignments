package com.springrest.ayushi.Qjuestion1SpringRestHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/welcome")
    public String helloWorld() {
        return ("Hello World");
    }
	

}
