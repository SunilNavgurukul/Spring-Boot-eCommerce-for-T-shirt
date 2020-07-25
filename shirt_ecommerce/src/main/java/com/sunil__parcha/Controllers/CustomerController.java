package com.sunil__parcha.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.Customer;
import com.sunil__parcha.Service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/customer")
	public List<Customer> GetCustmor() {
		return customerService.findAll();
	}

	@PostMapping(value = "/customer")
	public Customer PostCustmor(@RequestBody Customer customer) {
		return customerService.add(customer);
	}

	@PutMapping(value = "/customer")
	public Customer PutCustmor(@RequestBody Customer customer, @RequestParam(required = false) int id) {
		return customerService.CustomerUpdate(customer, id);
	}

//	========LogIn========

//	@GetMapping(value = "/customer/login")
//	public Optional<Customer> signIn(@RequestBody Customer customer) {
//		return customerService.login(customer);
//	}

//	=========End=========

	@PutMapping(value = "/customer/address")
	public Customer Putaddress(@RequestBody Customer customer, @RequestParam(required = false) int id) {
		return customerService.AddressUpdate(customer, id);
	}

	@PutMapping(value = "/customer/creditCard")
	public Customer PutcreditCard(@RequestBody Customer customer, @RequestParam(required = false) int id) {
		return customerService.CreditUpdate(customer, id);
	}
}
