package com.sunil__parcha.Controllers;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.Category;
import com.sunil__parcha.Service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = "/categories")
	public JSONObject CatoryGet() {
		return categoryService.findDataById();
	}

	@GetMapping(value = "/categories/{id}")
	private Optional<Category> getDepartmentById(@PathVariable("id") int id) {
		return categoryService.findById(id);
	}

	@GetMapping(value = "/categories/inProduct/{id}")
	private JSONArray getProductById(@PathVariable("id") int id) {
		return categoryService.findProductById(id);
	}

	@GetMapping(value = "/categories/inDepartment/{id}")
	private List<Category> getDepartmrntById(@PathVariable("id") int id) {
		return categoryService.findDepartmentById(id);
	}

}
