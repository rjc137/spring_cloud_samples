package com.sample.netflix.eureka.employee.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.netflix.eureka.employee.consumer.service.EmployeeProducerService;

@RestController
@RequestMapping("/consumers")
public class EmployeeConsumerController {

	@Autowired
	private EmployeeProducerService loadBalancer;

	@GetMapping
	public ResponseEntity<String> getEmployee() {
		return ResponseEntity.ok(loadBalancer.getData());

	}
}
