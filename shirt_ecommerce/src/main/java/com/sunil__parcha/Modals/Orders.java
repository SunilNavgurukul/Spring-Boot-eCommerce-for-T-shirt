package com.sunil__parcha.Modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue
	private int order_id;
	private String total_amoun;
	private String created_on;
	private String shipped_on;
	private String status;
	private String comments;
	private String customer_id;
	private String auth_code;
	private String reference;
	private String shipping_id;
	private String tax_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getTotal_amoun() {
		return total_amoun;
	}
	public void setTotal_amoun(String total_amoun) {
		this.total_amoun = total_amoun;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getShipped_on() {
		return shipped_on;
	}
	public void setShipped_on(String shipped_on) {
		this.shipped_on = shipped_on;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getAuth_code() {
		return auth_code;
	}
	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getShipping_id() {
		return shipping_id;
	}
	public void setShipping_id(String shipping_id) {
		this.shipping_id = shipping_id;
	}
	public String getTax_id() {
		return tax_id;
	}
	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}
	
	
	
	

}
