package com.sapient.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.ecommerce.domain.Product;
import com.sapient.ecommerce.dto.ProductDto;
import com.sapient.ecommerce.repositories.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRespository;

	public List<ProductDto> findProductsByBrand(String brandName) {
		List<Product> findProductsByBrand = productRespository.findProductsByBrand(brandName);
		
		// Convert findProductsByBrand list to ProductDto using suitable mappers and return;
		return  new ArrayList<ProductDto>();
	}

}
