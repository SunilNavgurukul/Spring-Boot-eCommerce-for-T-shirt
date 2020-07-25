package com.sunil__parcha.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.department;
import com.sunil__parcha.Repositories.DepartmentRepo;

@Service
public class ServiceDepartment {

	@Autowired
	private DepartmentRepo departmentrepo;

	public List<department> findAll() {
		return departmentrepo.findAll();
	}

	public Optional<department> findById(int id) {
		return departmentrepo.findById(id);
	}

}
