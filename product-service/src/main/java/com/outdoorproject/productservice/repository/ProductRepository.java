package com.outdoorproject.productservice.repository;

import com.outdoorproject.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
