package com.example.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.model.User;
import com.example.service.UserServiceImpl;


@RestController
@RequestMapping("/users")
public class UserController {

	 @Autowired
	    private UserServiceImpl userService;

	    @RequestMapping(value="/user", method = RequestMethod.GET)
	    public List listUser(){
	        return userService.findAll();
	    }

	    @RequestMapping(value = "/user", method = RequestMethod.POST)
	    public User create(@RequestBody User user){
	        return userService.save(user);
	    }

	    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	    public String delete(@PathVariable(value = "id") int id){
	        userService.delete(id);
	        return "success";
	    }

}
