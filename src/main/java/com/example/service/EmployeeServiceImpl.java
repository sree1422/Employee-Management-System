package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
  
	@Override
	public void saveEmployee(Employee emp) {
		empRepo.save(emp);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployeeById(Integer id) {
		return empRepo.getById(id);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();			
	}

	@Override
	public void deleteEmployee(Integer id) {
		empRepo.deleteById(id);
		
	}
	

}
