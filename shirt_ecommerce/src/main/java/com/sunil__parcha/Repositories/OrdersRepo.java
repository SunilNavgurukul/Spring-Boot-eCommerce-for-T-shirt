package com.sunil__parcha.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sunil__parcha.Modals.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {

	@Query(value = "select * from orders o inner join customer c where c.customer_id = o.customer_id", nativeQuery = true)
	Optional<Orders> GetOrderByCustomerId();

}
