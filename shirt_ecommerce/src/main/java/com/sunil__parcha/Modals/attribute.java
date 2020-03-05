package com.sunil__parcha.Modals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="attribute")
public class attribute {
	
	@Id
	@GeneratedValue
	@Column(name="attribute_id")
	private int attribute_id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	
	public int getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
