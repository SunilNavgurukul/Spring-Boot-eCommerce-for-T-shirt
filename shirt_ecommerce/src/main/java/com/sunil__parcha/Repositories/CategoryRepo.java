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

	@Query(value = "select p.category_id, p.department_id, p.name from category p where p.category_id = :id", nativeQuery = true)
	public List<Object[]> findProductById(@Param("id") int id);

	@Query(value = "select p.category_id, p.name, p.description from category p where department_id = :id", nativeQuery = true)
	public List<Object[]> findDepartmentById(@Param("id") int id);
}
