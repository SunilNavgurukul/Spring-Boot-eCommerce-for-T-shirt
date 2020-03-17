package com.sunil__parcha.Controllers;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sunil__parcha.Modals.Products;
import com.sunil__parcha.Repositories.ProductRepo;

@RestController
public class ProductController {
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping(value="/products")
	public JSONObject attribute(){
		JSONArray array = new JSONArray();
		
		for(Object[] i : productRepo.findAll_product()) {
			JSONObject obj1 = new JSONObject();
			obj1.put("product_id", i[0]);
			obj1.put("name", i[1]);
			obj1.put("description", i[2]);
			obj1.put("price", i[3]);
			obj1.put("discounted_price", i[4]);
			obj1.put("thumbnail", i[5]);
			array.add(obj1);
		}
		JSONObject obj2 = new JSONObject();
		obj2.put("count", productRepo.findAll().size());
		obj2.put("rows", array.subList(0, 20));
		return obj2;
	}
	
	@GetMapping(value="/products/{id}")
	public Optional<Products> attributeById(@PathVariable("id") int id){
		
		return productRepo.findById(id);
	}
	
	@GetMapping(value="/products/inCategory/{id}")
	public JSONObject categoryById(@PathVariable("id")int id){
		JSONArray array = new JSONArray();		
		for(Object[] i : productRepo.findByCatogery(id)) {
			JSONObject obj1 = new JSONObject();
			obj1.put("product_id", i[0]);
			obj1.put("name", i[1]);
			obj1.put("description", i[2]);
			obj1.put("price", i[3]);
			obj1.put("discounted_price", i[4]);
			obj1.put("thumbnail", i[5]);
			array.add(obj1);
		}
		JSONObject obj2 = new JSONObject();
		obj2.put("count", productRepo.findByCatogery(id).size());
		obj2.put("rows", array);
		return obj2;
	
	}
}
