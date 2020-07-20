package com.sunil__parcha.Service;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.attribute;
import com.sunil__parcha.Repositories.AttributeRepo;

@Service
public class AttributeService {

	@Autowired
	AttributeRepo attributerepo;

	public List<attribute> findAll() {
		return attributerepo.findAll();
	}
	
	public Optional<attribute> findById(int id) {
		return attributerepo.findById(id);
	}

	@SuppressWarnings("unchecked")
	public JSONArray findByAttributeValueId(int id) {
		JSONArray array = new JSONArray();
		for(Object[] i : attributerepo.findByAttributeValueId(id)) {
			JSONObject obj = new JSONObject();
			obj.put("attribute_id", i[0]);
			obj.put("value", i[1]);
			array.add(obj);
		}
		return array;
	} 
	
	@SuppressWarnings("unchecked")
	public JSONArray AttributeValueProduct(int id) {
		JSONArray array = new JSONArray();
		for(Object[] i : attributerepo.findByAttributeValueProduct(id)) {
			JSONObject obj = new JSONObject();
			obj.put("attribute_name", i[0]);
			obj.put("attribute_value_id", i[1]);
			obj.put("attribute_value", i[2]);
			array.add(obj);
		}
		return array;
	} 
	
	
	
}
