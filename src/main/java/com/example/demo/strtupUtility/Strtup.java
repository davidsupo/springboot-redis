package com.example.demo.strtupUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Strtup implements CommandLineRunner {
	
	@Autowired StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Student std = new Student();
		std.setCity("Chiclayo");
		std.setId("1");
		std.setName("David");
		Student save = repo.save(std);
		log.info("=========================>" + save.toString());
	}

}
