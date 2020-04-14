package com.sapient.ecommerce.domain;

import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
public class Seller {
	
	private Long id;
	private String sellerName;
	private String sellerDescription;
	private String sellerRatings;
	
	@OneToMany(mappedBy = "seller")
	private Set<Product> products;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerDescription() {
		return sellerDescription;
	}
	public void setSellerDescription(String sellerDescription) {
		this.sellerDescription = sellerDescription;
	}
	public String getSellerRatings() {
		return sellerRatings;
	}
	public void setSellerRatings(String sellerRatings) {
		this.sellerRatings = sellerRatings;
	}
	
	

}
