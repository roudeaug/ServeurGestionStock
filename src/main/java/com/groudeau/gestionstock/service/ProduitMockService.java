package com.groudeau.gestionstock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.groudeau.gestionstock.entity.Product;

@Service
public class ProduitMockService implements IProductService {

	// Class attributes
	private List<Product> products;
	
	//Default constructor
	public ProduitMockService() {
		products = new ArrayList<Product>();
		products.add(new Product("Livre", 50, 20));
		products.add(new Product("Cahier", 200, 5.25f));
		products.add(new Product("Stylot", 500, 2.10f));
	}

	
	// IProductService methods
	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		products.remove(product);
		products.add(product);
	}

	@Override
	public void deleteProduct(String ref) {
		Product product = new Product();
		product.setRef(ref);
		products.remove(product);
	}

}
