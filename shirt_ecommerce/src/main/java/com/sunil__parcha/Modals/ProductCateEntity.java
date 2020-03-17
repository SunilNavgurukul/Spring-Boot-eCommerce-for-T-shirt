package com.sunil__parcha.Modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "product_category")
public class ProductCateEntity {
	@Id
	@GeneratedValue
	private int product_id;
	private int category_id;

}
