package com.question1.ayushi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	/*@RequestMapping(value = "/index")
	public String showLoginPage() {
		return "index";
	}*/
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showLoginPage() {
		return "index";
	}

	/*
	 * name should be same as what we are passing in login.jsp
	 * we dont need to add the attrribute to the RequestParam
	 */
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	//@ResponseBody
	public String handleLoginRequest( ) {
		return "helloWorld";
		
	}
}
