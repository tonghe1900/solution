package com.demo;

import com.demo.controller.EmployeeController;
import com.demo.controller.EmployeeResult;
import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {
	@InjectMocks
	private EmployeeController employeeController;

	@Mock
	private EmployeeService employeeService;

	@Test
	public void testSaveEmployee() {
		Employee employee = new Employee();

		Mockito.when(employeeService.save(employee)).thenReturn(employee);

		EmployeeResult result = employeeController.saveEmployee(employee);

		Assert.assertEquals(result.getMessage(), "save successfully");
		Assert.assertEquals(result.getHttpStatus(), HttpStatus.OK);
	}

	@Test
	public void testUpdateEmployee() throws Exception {
		int id = 7;
		Employee employee = new Employee();
		employee.setName("bill");
		Mockito.when(employeeService.update(id, employee)).thenReturn(employee);

		EmployeeResult result = employeeController.updateEmployee(id, employee);

		
		Assert.assertEquals(result.getMessage(), "no such employee");
		Assert.assertEquals(result.getHttpStatus(), HttpStatus.OK);
	}

	@Test
	public void testDelete() throws Exception {
		int id = 7;
		Employee employee = new Employee();
		employee.setName("bill");
		Mockito.when(employeeService.delete(id)).thenReturn(true);

		EmployeeResult result = employeeController.removeEmployee(id);

		
		
		Assert.assertEquals(result.getHttpStatus(), HttpStatus.OK);
		
	}
	
	@Test
	public void testFind() throws Exception {
		int id = 7;
		Employee employee = new Employee();
		employee.setName("bill");
		Mockito.when(employeeService.find(id)).thenReturn(employee);

		EmployeeResult result  = employeeController.findEmployee(id);

		
		
		Assert.assertEquals(result.getHttpStatus(), HttpStatus.OK);
		
	}


}
