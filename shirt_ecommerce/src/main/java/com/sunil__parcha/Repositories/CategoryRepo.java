package com.sunil__parcha.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

	@Query(value = "select * from category LIMIT 20", nativeQuery = true)
	public List<Category> findByLimit();

	@Query(value = "select c.name, c.category_id, c.department_id from category c join product_category p where p.category_id = c.category_id and p.product_id = :id", nativeQuery = true)
	public List<Object[]> findProductById(@Param("id") int id);

	@Query(value = "select * from category where department_id = :id", nativeQuery = true)
	public List<Category> findByDepartment_id(@Param("id") int id);
}
