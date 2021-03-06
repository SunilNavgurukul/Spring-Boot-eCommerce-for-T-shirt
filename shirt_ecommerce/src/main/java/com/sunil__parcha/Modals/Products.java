package com.sunil__parcha.Modals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "product")
public class Products {
	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private int product_id;

	@NotEmpty
	@Column(name = "name")
	private String name;

	@NotEmpty
	@Column(name = "description")
	private String description;

	@NotEmpty
	@Column(name = "price")
	private Double price;

	@NotEmpty
	@Column(name = "discounted_price")
	private Double discounted_price;

	@NotEmpty
	@Column(name = "image")
	private String image;

	@NotEmpty
	@Column(name = "image_2")
	private String image_2;

	@NotEmpty
	@Column(name = "display")
	private String display;
	@NotEmpty
	@Column(name = "thumbnail")
	private String thumbnail;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscounted_price() {
		return discounted_price;
	}

	public void setDiscounted_price(Double discounted_price) {
		this.discounted_price = discounted_price;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage_2() {
		return image_2;
	}

	public void setImage_2(String image_2) {
		this.image_2 = image_2;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

}
