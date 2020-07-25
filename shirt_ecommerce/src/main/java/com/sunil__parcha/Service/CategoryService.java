package com.sunil__parcha.Service;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.Category;
import com.sunil__parcha.Repositories.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryrepo;

	@SuppressWarnings("unchecked")
	public JSONObject findDataById() {
		JSONObject obj = new JSONObject();
		obj.put("count", categoryrepo.findByLimit().size());
		obj.put("raws", categoryrepo.findByLimit());
		return obj;
	}

	public Optional<Category> findById(int id) {
		return categoryrepo.findById(id);
	}

	@SuppressWarnings("unchecked")
	public JSONArray findProductById(int id) {
		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();
		for (Object[] i : categoryrepo.findProductById(id)) {
			obj.put("category_id", i[1]);
			obj.put("department_id", i[2]);
			obj.put("name", i[0]);
			array.add(obj);
		}
		return array;
	}

	public List<Category> findDepartmentById(int id) {
//		JSONArray array = new JSONArray();
//		JSONObject obj = new JSONObject();
//		for(Object[] i : categoryrepo.findDepartmentById(id)) {
//			obj.put("category_id", i[0]);
//			obj.put("name", i[1]);
//			obj.put("description", i[2]);
//			array.add(obj);
//		}
		return categoryrepo.findByDepartment_id(id);
	}
}
