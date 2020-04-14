package com.sapient.ecommerce.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapient.ecommerce.domain.Product;

@Repository
public class ProductRepository{
	// We can use spring data jpa repository to execute simple queries like below related to search, 
	// by extending JPA repository
	
	@Autowired
	private EntityManager entityManager;

	public List<Product> findProductsByBrand(String brandName) {
		
		CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Product> query = builder.createQuery(Product.class);
		Root<Product> productRoot = query.from(Product.class);
		
		// Inner Join on Brand Table
		productRoot.join("brand", JoinType.INNER);
		
		List<Predicate> predicates = new ArrayList<>();
		ParameterExpression<String> queryBrandNameParameter = null;
		
		if (brandName != null) {
			queryBrandNameParameter = builder.parameter(String.class);
			predicates.add(builder.equal(queryBrandNameParameter, productRoot.get("brand").get("brandName")));
		}
		
		query.where(predicates.toArray(new Predicate[predicates.size()]));

		TypedQuery<Product> finalQuery = this.entityManager.createQuery(query);
		
		if (brandName != null) {
			finalQuery.setParameter(queryBrandNameParameter, brandName);
		}
		
		return finalQuery.getResultList();
	}
	

}
