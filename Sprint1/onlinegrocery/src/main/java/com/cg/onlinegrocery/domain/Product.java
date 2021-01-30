<<<<<<< HEAD
package com.cg.onlinegrocery.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This Product class will store all the details of the product
 * 
 * @author Rishita.
 */
@Entity

public class Product {
	
	@Id
	private String productId;
	private String productName;
	private Integer productAmount;
	private Double price;
	private String description;
	
	//Generate Getters and setters
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Integer productAmount) {
		this.productAmount = productAmount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
=======
package com.cg.onlinegrocery.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This Product class will store all the details of the product
 * 
 * @author Rishita.
 */
@Entity

public class Product {
	
	@Id
	private String productId;
	private String productName;
	private Integer productAmount;
	private Double price;
	private String description;
	
	//Generate Getters and setters
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Integer productAmount) {
		this.productAmount = productAmount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
>>>>>>> 2c0e3db (test)
