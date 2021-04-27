package com.sample.netflix.eureka.employee.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.netflix.eureka.employee.producer.model.Employee;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping
	@CircuitBreaker(fallbackMethod = "fallback", name = "firstPage_circuit_breaker")
	public Employee firstPage() {
		throw new RuntimeException();
		//return new Employee("empid_1", "ruchira", "software engineer", 3000);
	}
	
	private Employee fallback(RuntimeException ex) {
		return new Employee("fallback_empid_1", "fallback_ruchira", "fallback_software engineer", 3000);
	}
}
