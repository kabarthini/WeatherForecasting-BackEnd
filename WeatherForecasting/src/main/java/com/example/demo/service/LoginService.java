package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

public class LoginService {
	@Autowired
	private LoginRepository userrepo;
	public List<Login> getUser() 
	   {
		  return userrepo.findAll();
	   }
	public void saveUser(Login le)
	   {
		  userrepo.save(le);
	   }

}
