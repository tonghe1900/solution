package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.demo.pojo.Employee;


@Service
public class EmployeeService {
	
	

	private ConcurrentHashMap<Integer,Employee > data  = new ConcurrentHashMap<>();
	
	public Employee save(Employee employee) {
		data.put(employee.getId(), employee);
		return employee;
		
	}

	public Employee find(Integer id) {
		return data.get(id);
		
	}
	
	public Employee update(int id, Employee employee) {
		Employee employeeOld = data.get(id);
		employeeOld.setEmail(employee.getEmail());
		employeeOld.setOffice(employee.getOffice());
		employeeOld.setRole(employee.getRole());
		employeeOld.setName(employee.getName());
		employeeOld.setRole(employee.getRole());
		return employee;
	}
	
	public boolean delete(int id) {
		data.remove(id);
		return true;
		
	}

	public List<Employee> findAll() {
		List<Employee>  res = new ArrayList<>();
		for(int key: data.keySet()) {
			res.add(data.get(key));
			
		}
		return res;
		
	}
	
	
	

}
