package com.sunil__parcha.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil__parcha.Modals.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	Optional<Customer> findByName(String username);

}
