package com.groudeau.gestionstock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groudeau.gestionstock.entity.Product;
import com.groudeau.gestionstock.service.IProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
}
