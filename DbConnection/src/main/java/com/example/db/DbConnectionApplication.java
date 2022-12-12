package com.example.db;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.db.model.EmployeeDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DbConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConnectionApplication.class, args);
	}
}
