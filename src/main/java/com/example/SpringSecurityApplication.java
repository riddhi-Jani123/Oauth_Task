package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.dao.UserDAO;
import com.example.model.User;

@SpringBootApplication
public class SpringSecurityApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}


	}


