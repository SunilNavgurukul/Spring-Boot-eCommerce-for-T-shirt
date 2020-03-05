package com.sunil__parcha.Controllers;


import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sunil__parcha.Repositories.Attribute_valueRepo;

@RestController
public class Attribute_valueController {

	@Autowired
	Attribute_valueRepo attribute_valueRepo;

	@GetMapping(value = "/attributes/values/{id}")
	public Object[] attributeValue(@PathVariable("id") int id) {
		JSONArray array = new JSONArray();
		for(Object[] i : attribute_valueRepo.findByAttributeValueId(id)) {
			JSONObject obj = new JSONObject();
			obj.put("attribute_id", i[0]);
			obj.put("value", i[1]);
			array.add(obj);
		}
//		System.out.println(array.toJSONString());
		return array.toArray();
	}
	
	@GetMapping(value = "/attributes/inProduct/{id}")
	public Object[] attributeProduct(@PathVariable("id") int id) {
		JSONArray array = new JSONArray();
		for(Object[] i : attribute_valueRepo.findByAttributeValueProduct()) {
			JSONObject obj = new JSONObject();
			obj.put("attribute_name", i[2]);
			obj.put("attribute_id", i[0]);
			obj.put("value", i[1]);
			array.add(obj);
		}
//		System.out.println(array.toJSONString());
		return array.toArray();
//		return attribute_valueRepo.findByAttributeValueProduct();
	}
}
