package com.sunil__parcha.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.attribute;
import com.sunil__parcha.Repositories.AttributeRepo;


@RestController
public class AttributeController {
	
	@Autowired
	AttributeRepo AttributeRepository;

	@GetMapping(value="/attributes")
	public List<attribute> attribute(){
		return AttributeRepository.findAll();
	}
	
	@GetMapping(value="/attributes/{id}")
	public Optional<attribute> attributeById(@PathVariable("id") int id){
		return AttributeRepository.findById(id);
	}
}
