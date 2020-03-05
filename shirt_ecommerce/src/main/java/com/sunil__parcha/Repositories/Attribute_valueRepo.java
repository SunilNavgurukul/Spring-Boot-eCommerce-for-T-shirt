package com.sunil__parcha.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.Attributes_values;


@Repository
public interface Attribute_valueRepo extends JpaRepository<Attributes_values, Integer> {

	@Query(value="select v.attribute_id, v.value from attribute_value v where v.attribute_id = :id" , nativeQuery = true)
	public List<Object[]> findByAttributeValueId(@Param("id") int id);

	@Query (value="select attribute_value_id, value, if(attribute_id=2, \"Color\", \"Size\") from attribute_value;", nativeQuery = true)
	public List<Object[]> findByAttributeValueProduct();
}

