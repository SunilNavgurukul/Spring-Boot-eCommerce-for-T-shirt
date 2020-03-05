package com.sunil__parcha.Controllers;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.Products;
import com.sunil__parcha.Repositories.ProductRepo;

@RestController
public class ProductController {
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping(value="/products")
	public JSONObject attribute(){
		JSONObject obj = new JSONObject();
		obj.put("count", productRepo.findAll().size());
		obj.put("rows", productRepo.findAll().subList(0, 20));
		return obj;
	}
}
