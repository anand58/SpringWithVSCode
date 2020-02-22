package com.springbootonvisualcode.springbootonvisualcodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/{firstname}/{lastname}", method = RequestMethod.GET)
	public String getMessage(@PathVariable("firstname") String firstName, @PathVariable("lastname") String lastname){

		return "my name is: "+firstName+" "+lastname;

	}

}
