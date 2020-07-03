package com.groudeau.gestionstock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.groudeau.gestionstock.entity.Product;
import com.groudeau.gestionstock.repository.IProductRepository;

@Service
// @Primary rend le service prioritaire par rapport au MockService
@Primary
public class ProductService implements IProductService{

	@Autowired private IProductRepository productRepository;
	
	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		Product product = new Product();
		product.setId(id);
		productRepository.delete(product);
	}

}
