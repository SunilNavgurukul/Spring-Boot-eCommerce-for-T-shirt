package com.sunil__parcha.Modals;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private int product_id;
	private String name;
	private String description;
	private Double price;
	private Double discounted_price;
	private String thumbnail;
	
	@OneToOne
    @JoinColumn(name="product_category")
    private Category category;
	
//	public int getProduct_id() {
//		return product_id;
//	}
//
//	public void setProduct_id(int product_id) {
//		this.product_id = product_id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Double getPrice() {
//		return price;
//	}
//
//	public void setPrice(Double price) {
//		this.price = price;
//	}
//
//	public Double getDiscounted_price() {
//		return discounted_price;
//	}
//
//	public void setDiscounted_price(Double discounted_price) {
//		this.discounted_price = discounted_price;
//	}
//
//	public String getThumbnail() {
//		return thumbnail;
//	}
//
//	public void setThumbnail(String thumbnail) {
//		this.thumbnail = thumbnail;
//	}
	
	

}
