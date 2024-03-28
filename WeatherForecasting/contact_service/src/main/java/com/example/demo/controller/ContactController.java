package com.example.demo.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContactRequest;
import com.example.demo.dto.ContactResponse;
import com.example.demo.service.ContactService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/contact")
public class ContactController {
	 private ContactService contactService;
	    
	    @PostMapping("/addContact")
	    public ResponseEntity<String> addContact(@RequestBody ContactRequest contactRequest)
	    {
	    	boolean contactExists=contactService.addContact(contactRequest);
	        if(contactExists)
	        {
	        	return ResponseEntity.status(HttpStatus.CREATED).body("Feedback added!");
	        }
	        else
	        {
	        	return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Something went wrong!");
	        }
	    }
	    
	    @GetMapping("/getContact")
	    public ResponseEntity<List<ContactResponse>> getContact()
	    {
	    	return ResponseEntity.status(HttpStatus.OK).body(contactService.getContact());
	    }
}
