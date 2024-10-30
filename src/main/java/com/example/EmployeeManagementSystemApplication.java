package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepo;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		Employee e1 = new Employee(1,"Sreenu","SD", 50000.0);
		Employee e2 = new Employee(2,"Dhruva","Tester", 24009.0);
		Employee e3 =new Employee(3,"Sai","Manager", 80000.0);
		
		bean.saveAll(Arrays.asList(e1,e2,e3));
	}

}
