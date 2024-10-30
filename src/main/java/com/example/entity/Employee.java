package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employee_id;
	private String employee_name;
	private String designation;
	private Double salary;
public Integer getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(Integer employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", designation=" + designation
			+ ", salary=" + salary + "]";
}
public Employee(Integer employee_id, String employee_name, String designation, Double salary) {
	super();
	this.employee_id = employee_id;
	this.employee_name = employee_name;
	this.designation = designation;
	this.salary = salary;
}
public Employee() {
	super();
}

}
