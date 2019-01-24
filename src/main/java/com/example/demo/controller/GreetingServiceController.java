package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingServiceController {


	private static final String template = "Hello, %s!";

	@RequestMapping("/greeting/{name}")

    public String greeting2(@PathVariable("name") String name) {

        return String.format(template, name) ;

    }

}

