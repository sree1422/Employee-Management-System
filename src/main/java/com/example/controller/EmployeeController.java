package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Employee> allEmployees = empService.getAllEmployees();
		model.addAttribute("listEmployees", allEmployees);
		return "index";
	}

	@GetMapping("/addEmployeeForm")
	public String addEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute(employee);
		return "employeeForm";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee emp) {
		empService.saveEmployee(emp);
		return "redirect:/";
	}

	@GetMapping("/updateForm/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {

		Employee employeeById = empService.getEmployeeById(id);
		model.addAttribute("employee", employeeById);
		return "update_form";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") Integer id) {
		empService.deleteEmployee(id);
		return "redirect:/";
	}

}
