package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employees")

	public EmployeeResult saveEmployee(@RequestBody Employee employee) {

		employeeService.save(employee);

		return new EmployeeResult(HttpStatus.OK, "save successfully");

	}

	@GetMapping("/employees")
	public List<Employee> findEmployees() {
		return employeeService.findAll();

	}

	@GetMapping("/employees/{id}")
	public EmployeeResult findEmployee(@PathVariable int id) {
		if (employeeService.find(id) == null)
			return new EmployeeResult(HttpStatus.OK, "no such employee");
		return new EmployeeResult(HttpStatus.OK, "find successfully", employeeService.find(id));

	}

	@DeleteMapping("/employees/{id}")
	public EmployeeResult removeEmployee(@PathVariable int id) {
		if (employeeService.find(id) == null)
			return new EmployeeResult(HttpStatus.OK, "no such employee");
		employeeService.delete(id);
		return new EmployeeResult(HttpStatus.OK, "delete successfully");

	}

	@PostMapping("/employees/{id}")
	public EmployeeResult updateEmployee(@PathVariable int id, @RequestBody Employee employee) {

		if (employeeService.find(id) == null)
			return new EmployeeResult(HttpStatus.OK, "no such employee");
		return new EmployeeResult(HttpStatus.OK, "update successfully", employeeService.update(id, employee));

	}

}
