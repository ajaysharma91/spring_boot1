package com.parashar.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld implements ErrorController{
	@RequestMapping(value="/")
public String showMessage()
{
	return "Hello Parashar, Your Application Here";
}
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
