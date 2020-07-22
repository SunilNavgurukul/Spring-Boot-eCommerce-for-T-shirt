package com.sunil__parcha.Controllers;


import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sunil__parcha.Modals.Products;
import com.sunil__parcha.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;
	
	@GetMapping(value="/products")
	public JSONObject attribute(@RequestParam(required=false) String page, @RequestParam(required=false) String limit, @RequestParam(required=false) String description_length) {	
		
		return productservice.findAll_product(page, limit, description_length);
	}
	
	@GetMapping(value="/products/{id}")
	public Optional<Products> attributeById(@PathVariable("id") int id){
		
		return productservice.findById(id);
	}
	
	@GetMapping(value="/products/inCategory/{id}")
	public JSONObject categoryById(@PathVariable("id")int id, @RequestParam(required=false) String page, @RequestParam(required=false) String limit, @RequestParam(required=false) String description_length) {
		
		return productservice.findByCatogery(id, page, limit, description_length);
	
	}
	
	@GetMapping(value="/products/inDepartment/{id}")
	public JSONObject DepartmentById(@PathVariable("id")int id, @RequestParam(required=false) String page, @RequestParam(required=false) String limit, @RequestParam(required=false) String description_length){
		
		return productservice.findByDepartment(id, page, limit, description_length);
	
	}
	
	@GetMapping(value="/products/{id}/details")
	public JSONArray DepartmentById(@PathVariable("id")int id) {
		return productservice.findByProductId(id);
	
	}
	
}
