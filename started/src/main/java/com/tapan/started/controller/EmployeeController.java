package com.tapan.started.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tapan.started.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return new Employee(id, "john", "software engineer");
	}
}
