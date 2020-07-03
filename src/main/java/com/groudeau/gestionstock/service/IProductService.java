package com.groudeau.gestionstock.service;

import java.util.List;
import com.groudeau.gestionstock.entity.Product;

public interface IProductService {
	
	List<Product> getProducts();
	
	void addProduct(Product product);
	
	void updateProduct(Product product);
	
	void deleteProduct(Long id);
}
