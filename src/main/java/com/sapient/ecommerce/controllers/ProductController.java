package com.sapient.ecommerce.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.ecommerce.dto.ProductDto;
import com.sapient.ecommerce.service.ProductService;

@RestController("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/find-products/{brand}")
	public ResponseEntity findProductsByBrand(@PathParam("brand") String brandName) {
		List<ProductDto> list = productService.findProductsByBrand(brandName);
		return ResponseEntity.ok(list);
				
	}
	
	
	// Similary we can implement other rest api's 

}
