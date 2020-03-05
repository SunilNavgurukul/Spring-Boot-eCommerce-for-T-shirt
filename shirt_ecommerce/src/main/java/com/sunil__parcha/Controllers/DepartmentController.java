package com.sunil__parcha.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.department;
import com.sunil__parcha.Repositories.DepartmentRepo;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentRepo departmentRepository;
	
	@GetMapping(value="/departments")
	private List<department> getDepartment() {
		return departmentRepository.findAll();
	}
	
	@GetMapping(value="/departments/{id}")
	private Optional<department> getDepartmentById(@PathVariable("id") int id1) {
		return departmentRepository.findById(id1);
	}
}
