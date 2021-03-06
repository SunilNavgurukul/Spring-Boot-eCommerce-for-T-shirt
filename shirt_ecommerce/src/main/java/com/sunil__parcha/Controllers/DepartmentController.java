package com.sunil__parcha.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.Department;
import com.sunil__parcha.Service.ServiceDepartment;

@RestController
public class DepartmentController {

	@Autowired
	ServiceDepartment departmentService;

	@GetMapping(value = "/departments")
	private List<Department> getDepartment() {
		return departmentService.findAll();
	}

	@GetMapping(value = "/departments/{id}")
	private Optional<Department> getDepartmentById(@PathVariable("id") int id) {
		return departmentService.findById(id);
	}
}
