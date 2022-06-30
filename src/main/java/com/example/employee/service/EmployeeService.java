package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	// CREATE
	public Employee createEmployee(Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}

	// READ
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	// UPDATE
	public Employee updateEmployee(Long employeeId, Employee employeeDetails) {
		Employee employee = employeeRepository.findById(employeeId).get();
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());

		return employeeRepository.save(employee);
	}

	// DELETE
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}


}
