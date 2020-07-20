package com.sunil__parcha.Modals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "attribute_value")
public class AttributesValues {

	@Id
	@GeneratedValue
	@Column(name = "attribute_value_id")
	private int attribute_value_id;

	@NotEmpty
	@Column(name = "attribute_id")
	private int attribute_id;

	@NotEmpty
	@Column(name = "value")
	private String value;

	public int getAttribute_value_id() {
		return attribute_value_id;
	}

	public void setAttribute_value_id(int attribute_value_id) {
		this.attribute_value_id = attribute_value_id;
	}

	public int getAttribute_id() {
		return attribute_id;
	}

	public void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
