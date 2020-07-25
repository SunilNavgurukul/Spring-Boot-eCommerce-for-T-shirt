package com.sunil__parcha.Controllers;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.attribute;
import com.sunil__parcha.Service.AttributeService;

@RestController
public class AttributeController {

	@Autowired
	AttributeService attributeservice;

	@GetMapping(value = "/attributes")
	public List<attribute> attribute() {
		return attributeservice.findAll();
	}

	@GetMapping(value = "/attributes/{id}")
	public Optional<attribute> attributeById(@PathVariable("id") int id) {
		return attributeservice.findById(id);
	}

	@GetMapping(value = "/attributes/values/{id}")
	public JSONArray attributeValue(@PathVariable("id") int id) {
		return attributeservice.findByAttributeValueId(id);
	}

	@GetMapping(value = "/attributes/inProduct/{id}")
	public JSONArray attributeProduct(@PathVariable("id") int id) {
		return attributeservice.AttributeValueProduct(id);
	}
}
