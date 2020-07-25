package com.sunil__parcha.Modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
	private int customer_id;

	private String name;

	private String email;

	private String address_1;

	private String address_2;

	private String city;

	private String region;

	private String postal_code;

	private String country;

	private int shipping_region_id;

	private String day_phone;

	private String eve_phone;

	private String mob_phone;

	private String credit_card;

	private String Password;

	public Customer() {

	}

	public Customer(Customer customer) {
		this.customer_id = customer.customer_id;
		this.name = customer.name;
		this.email = customer.email;
		this.address_1 = customer.address_1;
		this.address_2 = customer.address_2;
		this.city = customer.city;
		this.region = customer.region;
		this.postal_code = customer.postal_code;
		this.country = customer.country;
		this.shipping_region_id = customer.shipping_region_id;
		this.day_phone = customer.day_phone;
		this.eve_phone = customer.eve_phone;
		this.mob_phone = customer.mob_phone;
		this.credit_card = customer.credit_card;
		this.Password = customer.Password;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getShipping_region_id() {
		return shipping_region_id;
	}

	public void setShipping_region_id(int shipping_region_id) {
		this.shipping_region_id = shipping_region_id;
	}

	public String getDay_phone() {
		return day_phone;
	}

	public void setDay_phone(String day_phone) {
		this.day_phone = day_phone;
	}

	public String getEve_phone() {
		return eve_phone;
	}

	public void setEve_phone(String eve_phone) {
		this.eve_phone = eve_phone;
	}

	public String getMob_phone() {
		return mob_phone;
	}

	public void setMob_phone(String mob_phone) {
		this.mob_phone = mob_phone;
	}

	public String getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
