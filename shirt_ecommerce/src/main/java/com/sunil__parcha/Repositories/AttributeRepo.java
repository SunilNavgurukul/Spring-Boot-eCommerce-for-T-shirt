package com.sunil__parcha.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.attribute;


@Repository
public interface AttributeRepo extends JpaRepository<attribute, Integer> {
	
	@Query(	value="select av.attribute_value_id, av.value from attribute a inner join attribute_value av where a.attribute_id = av.attribute_id and av.attribute_id= :id", nativeQuery = true)
	List<Object[]> findByAttributeValueId(int id);
	
	@Query (value="select a.name, av.attribute_value_id, av.value from attribute a inner join attribute_value av inner join product_attribute pa where a.attribute_id = av.attribute_id and pa.attribute_value_id = av.attribute_value_id and pa.product_id = :id", nativeQuery = true)
	public List<Object[]> findByAttributeValueProduct(int id);

}
