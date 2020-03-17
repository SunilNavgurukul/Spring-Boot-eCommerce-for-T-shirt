package com.sunil__parcha.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sunil__parcha.Modals.ProductEntity;
import com.sunil__parcha.Modals.Products;


@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{
	
	@Query(value = "select p.product_id, p.name, p.description, p.price, p.discounted_price, p.thumbnail from product p", nativeQuery = true)
	public List<Object[]> findAll_product();
	
	
	@Query(value = "select * from product p" + 
			"INNER JOIN product_category pc on p.product_id = pc.product_id where pc.category_id = :id", nativeQuery = true)
	public List<ProductEntity> findByCatogery(@Param("id") int id);
}
