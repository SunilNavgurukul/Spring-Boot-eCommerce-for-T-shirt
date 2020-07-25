package com.sunil__parcha.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil__parcha.Modals.Customer;
import com.sunil__parcha.Repositories.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerepo;

	public List<Customer> findAll() {
		return customerepo.findAll();
	}

	public Customer add(Customer customer) {
		return customerepo.save(customer);
	}

	public Optional<Customer> login(Customer customer) {
		return customerepo.findByName(customer.getName());
	}

	public Customer CustomerUpdate(Customer customer, int id) {
		Customer customerOne = customerepo.findById(id).get();

		customerOne.setName(customer.getName());
		customerOne.setEmail(customer.getEmail());
		customerOne.setPassword(customer.getPassword());
		customerOne.setDay_phone(customer.getDay_phone());
		customerOne.setEve_phone(customer.getEve_phone());
		customerOne.setMob_phone(customer.getMob_phone());

		return customerepo.save(customerOne);
	}

	public Customer AddressUpdate(Customer customer, int id) {
		Customer customerOne = customerepo.findById(id).get();

		customerOne.setAddress_1(customer.getAddress_1());
		customerOne.setAddress_2(customer.getAddress_2());
		customerOne.setCity(customer.getCity());
		customerOne.setRegion(customer.getRegion());
		customerOne.setPostal_code(customer.getPostal_code());
		customerOne.setCountry(customer.getCountry());
		customerOne.setShipping_region_id(customer.getShipping_region_id());

		return customerepo.save(customerOne);
	}

	public Customer CreditUpdate(Customer customer, int id) {
		Customer customerOne = customerepo.findById(id).get();

		customerOne.setCredit_card(customer.getCredit_card());
		return customerepo.save(customerOne);
	}
}
