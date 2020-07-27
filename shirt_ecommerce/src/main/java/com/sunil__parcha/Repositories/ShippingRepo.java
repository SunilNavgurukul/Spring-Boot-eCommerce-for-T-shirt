package com.sunil__parcha.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sunil__parcha.Modals.Shopping_cart;

@Repository
public interface ShippingRepo extends JpaRepository<Shopping_cart, Integer> {

	@Query(value = "select * from shopping_cart s inner join product p where p.product_id = s.product_id and s.product_id = :id", nativeQuery = true)
	Optional<Shopping_cart> MoveToCart(int id);

	@Query(value = "select count(p.price) from shopping_cart s inner join product p where p.product_id = s.product_id and s.product_id= :id", nativeQuery = true)
	Shopping_cart TotalAmount(int id);

}
