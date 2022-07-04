package com.example.employee.controller.employee;

import com.example.employee.model.employee.Employee;
import com.example.employee.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@GetMapping("/employees")
	public List<Employee> readEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.PUT)
	public Employee readEmployees(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
		return employeeService.updateEmployee(id, empDetails);
	}

	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "empId") Long id) {
		employeeService.deleteEmployee(id);
	}
}
