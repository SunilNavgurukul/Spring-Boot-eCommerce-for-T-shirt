package com.sunil__parcha.Modals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "category_id")
	private int category_id;

	@NotEmpty
	@Column(name = "department_id")
	private int department_id;

	@NotEmpty
	@Column(name = "name")
	private String name;

	@NotEmpty
	@Column(name = "description")
	private String description;

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category() {

	}

	public Category(int category_id, @NotEmpty int department_id, @NotEmpty String name) {

		this.category_id = category_id;
		this.department_id = department_id;
		this.name = name;
	}

//	

}
