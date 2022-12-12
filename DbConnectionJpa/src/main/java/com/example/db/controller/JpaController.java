package com.example.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.db.dao.Repositorys;
import com.example.db.model.JpaTutorials;

@Controller("/jpa")
public class JpaController{
	
	@Autowired
	private Repositorys repo;
	

	@GetMapping("/all")
	public ResponseEntity<?> getAlls() {
		List<JpaTutorials> tut = repo.findAll();
		return new ResponseEntity<>(tut, HttpStatus.OK);
	}

}
