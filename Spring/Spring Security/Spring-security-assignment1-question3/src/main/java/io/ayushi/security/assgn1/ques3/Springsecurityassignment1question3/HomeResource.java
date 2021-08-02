package io.ayushi.security.assgn1.ques3.Springsecurityassignment1question3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome to the Home Pages</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>This is the User Login</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Hello World</h1>");
	}

}
