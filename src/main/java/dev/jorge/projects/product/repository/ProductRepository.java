package dev.jorge.projects.product.repository;

import dev.jorge.projects.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {}
