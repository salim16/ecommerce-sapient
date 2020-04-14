package com.sapient.ecommerce.domain;

public class Brand {
	
	private Long id;
	
	private String brandName;
	
	private String brandPopularity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandPopularity() {
		return brandPopularity;
	}

	public void setBrandPopularity(String brandPopularity) {
		this.brandPopularity = brandPopularity;
	}
	
	

}
