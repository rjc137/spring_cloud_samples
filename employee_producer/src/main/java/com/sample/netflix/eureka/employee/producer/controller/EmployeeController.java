package com.sample.netflix.eureka.employee.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.netflix.eureka.employee.producer.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping
	public Employee firstPage() {
		return new Employee("empid_1", "ruchira", "software engineer", 3000);
	}
}
