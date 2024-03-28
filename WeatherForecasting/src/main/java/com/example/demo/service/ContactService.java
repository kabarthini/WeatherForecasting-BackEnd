package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	 private ContactRepository contactRepository;
	public void saveContact(Contact contact) 
	{
		contactRepository.save(contact);
	}
	public List<Contact> getContact() 
	{
		return contactRepository.findAll();	
	}
	public void updateContact(Contact contact) {
		
		contactRepository.save(contact);
	}
	public void deleteContact(int contactId) {
		contactRepository.deleteById(contactId);
	}
}
