package com.zensar.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//Writing test case for every peice bussiness code including spring controller is mandatory
@RestController
public class HelloRestController {
   @GetMapping("/Hello")
   public String getMessage()
   {
	   System.out.println("Testing getMessage");
	   return "Welcome to ..............";
   }
   @PostMapping("/Hello")
   
   public ResponseEntity<String> createMessage(@RequestBody String msg) {
	System.out.println("Message  created.......");
	return new ResponseEntity<String>("Message  created......." +msg,HttpStatus.CREATED);
   }
}
