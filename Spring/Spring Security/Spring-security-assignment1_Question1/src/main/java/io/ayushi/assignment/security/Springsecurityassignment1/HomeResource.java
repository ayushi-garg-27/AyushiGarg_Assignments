package io.ayushi.assignment.security.Springsecurityassignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	
	@GetMapping("/admin")
    public String admin() {
        return ("<h1>Hello World</h1>");
    }
}
