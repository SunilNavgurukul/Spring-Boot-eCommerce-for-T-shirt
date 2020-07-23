package com.sunil__parcha.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {

	@Query(value = "select p.product_id, p.name, p.description, p.price, p.discounted_price, p.thumbnail from product p", nativeQuery = true)
	public List<Object[]> findAll_product();

	@Query(value = "select p.product_id, p.name, p.description, p.price, p.discounted_price, p.thumbnail from product p"
			+ " INNER JOIN product_category pc on p.product_id = pc.product_id where pc.category_id = :id", nativeQuery = true)
	public List<Object[]> findByCatogery(@Param("id") int id);

	@Query(value = "select p.product_id, p.name, p.description, p.price, p.discounted_price, p.thumbnail, pc.category_id from product p "
			+ "INNER JOIN product_category pc on p.product_id = pc.product_id "
			+ "INNER JOIN category c on pc.category_id = c.category_id where c.department_id = :id", nativeQuery = true)
	public List<Object[]> findByDepartment(@Param("id") int id);

	@Query(value = "select product_id, name, description, price, discounted_price, image, image_2, display from product where product_id = :id", nativeQuery = true)
	public List<Object[]> findByProductId(int id);
	
	@Query(value = "select p.name, r.review, r.rating, r.created_on from product p inner join review r where p.product_id = r.product_id and p.product_id = :id", nativeQuery = true)
	public List<Object[]> findReviewByProductId(int id);

	
//	Not Able to do
//	@Query(value = "select * from product_category e inner join category c inner join department d where e.category_id = c.category_id and d.department_id = c.department_id and"
//			+ " e.product_id = :id", nativeQuery = true)

//	@Query(value = "select c.category_id, c.name, d.department_id, d.name from product p \n"
//			+ "inner join product_category e inner join category c inner join department d \n"
//			+ "where p.product_id = e.product_id and c.category_id = e.category_id and d.department_id = c.department_id and \n"
//			+ "p.product_id = :id", nativeQuery = true)
//	@Query(value = "select * from product p \n" + 
//			"inner join product_category pc inner join category c inner join department d \n" + 
//			"where p.product_id = pc.product_id and c.category_id = pc.category_id and d.department_id = c.department_id and\n" + 
//			"p.product_id=:id", nativeQuery = true)
//	public List<Object[]> findByLocationId(int id);
	
}
