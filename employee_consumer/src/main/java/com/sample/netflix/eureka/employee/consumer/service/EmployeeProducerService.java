package com.sample.netflix.eureka.employee.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "employee-producer")
public interface EmployeeProducerService {
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String getData();
}