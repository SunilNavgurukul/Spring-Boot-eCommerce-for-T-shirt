package com.sunil__parcha.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.Orders;
import com.sunil__parcha.Service.OrdersService;

@RestController
public class OrderController {
	
	@Autowired
	private OrdersService orderservice;
	
	@PostMapping(value = "/oders")
	public Orders PostOrder(@RequestBody Orders orders) {
		return orderservice.add(orders);
	}
	
	@GetMapping(value = "/oders/{id}")
	public Optional<Orders> GetOrderById(@PathVariable("id") int id) {
		return orderservice.GetOrderById(id);
	}
	
	@GetMapping(value = "/oders/inCustomer")
	public Optional<Orders> GetOrderByCustomerId(@PathVariable("id") int id) {
		return orderservice.GetOrderByCustomerId();
	}
	
	

}
