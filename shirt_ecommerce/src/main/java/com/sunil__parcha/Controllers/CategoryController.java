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
import com.sunil__parcha.Repositories.CategoryRepo;

@RestController
public class CategoryController {

	@Autowired
	CategoryRepo categoryRepository;

	@GetMapping(value = "/categories")
	public List<Category> CatoryGet() {
		return categoryRepository.findByLimit();
	}

	@GetMapping(value = "/categories/{id}")
	private Optional<Category> getDepartmentById(@PathVariable("id") int id) {
		return categoryRepository.findById(id);
	}

	@GetMapping(value = "/categories/product/{id}")
	private Object[] getProductById(@PathVariable("id") int id) {
		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();
		for(Object[] i : categoryRepository.findProductById(id)) {
			obj.put("category_id", i[0]);
			obj.put("department_id", i[1]);
			obj.put("name", i[2]);
			array.add(obj);
		}
//		System.out.println(array.toJSONString());
		return array.toArray();
	}

	@GetMapping(value = "/categories/inDepartment/{id}")
	private Object[] getDepartmrntById(@PathVariable("id") int id) {
		JSONArray Depart = new JSONArray();
		JSONObject obj1 = new JSONObject();
		for(Object[] i : categoryRepository.findDepartmentById(id)) {
			obj1.put("category_id", i[0]);
			obj1.put("name", i[1]);
			obj1.put("description", i[2]);
			System.out.println(obj1.toString());
			Depart.add(obj1);
		}
		System.out.println(Depart.toJSONString());
		return Depart.toArray();
	}

}
