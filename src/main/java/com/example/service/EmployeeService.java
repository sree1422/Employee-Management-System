package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);
 public List<Employee> getAllEmployees();
 public void deleteEmployee(Integer id);
 public Employee getEmployeeById(Integer id);
}
