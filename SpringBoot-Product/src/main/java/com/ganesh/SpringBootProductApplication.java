package com.ganesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ganesh.repository.ProductRepository;

@SpringBootApplication
public class SpringBootProductApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductApplication.class, args);
	}
	
	
	@Autowired
	ProductRepository PR;
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
