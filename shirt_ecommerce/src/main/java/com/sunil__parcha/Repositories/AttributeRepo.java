package com.sunil__parcha.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.attribute;


@Repository
public interface AttributeRepo extends JpaRepository<attribute, Integer> {

}
