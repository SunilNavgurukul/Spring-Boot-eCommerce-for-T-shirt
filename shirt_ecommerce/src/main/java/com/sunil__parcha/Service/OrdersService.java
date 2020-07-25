package com.sunil__parcha.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.Orders;
import com.sunil__parcha.Repositories.OrdersRepo;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepo orderrepo;
	
	public Orders add(Orders orders) {
		return orderrepo.save(orders);
	}

	public Optional<Orders> GetOrderById(int id) {
		return orderrepo.findById(id);
	}

	public Optional<Orders> GetOrderByCustomerId() {
		return orderrepo.GetOrderByCustomerId();
	}
	

}
