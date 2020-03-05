package com.sunil__parcha.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.Products;


@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
