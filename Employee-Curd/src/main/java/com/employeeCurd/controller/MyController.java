package com.employeeCurd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeCurd.entity.Employee;
import com.employeeCurd.repo.EmployeeRepo;

@RestController
@RequestMapping("employee")
public class MyController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	
	@GetMapping("/")
	public List <Employee> getAllEmployee() {
		
		return this.employeeRepo.findAll();
	}
	
	@PostMapping("/")
	public  Employee saveEmployee(@RequestBody Employee employee)  {
	
		 this.employeeRepo.save(employee);
		 return employee;
	}
	
	@GetMapping("/{id}")
	public  Optional<Employee> getEmployeeById(@PathVariable("id") Long id)  {
		 return this.employeeRepo.findById(id);
	}
	@PutMapping("/")
	public  Employee updateEmployee(@RequestBody Employee employee)  {
		
		  this.employeeRepo.save(employee);
		 return employee;
	}
	
	@DeleteMapping("/{id}")
	public String  deleteEmployeeById(@PathVariable("id") Long id)  {
		 this.employeeRepo.deleteById(id);
		 return "Employee has been Deleted";
	}
	@DeleteMapping("/")
	public String  deleteAllEmployee()  {
		 this.employeeRepo.deleteAll();
		 return "All Employees has been Deleted";
	}

}
