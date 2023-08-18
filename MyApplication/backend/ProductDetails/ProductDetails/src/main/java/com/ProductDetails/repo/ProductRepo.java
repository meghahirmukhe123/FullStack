package com.ProductDetails.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ProductDetails.model.ProductDetails;

public interface ProductRepo extends MongoRepository<ProductDetails, String> {
	
	ProductDetails findByuserId(String userId);

}
