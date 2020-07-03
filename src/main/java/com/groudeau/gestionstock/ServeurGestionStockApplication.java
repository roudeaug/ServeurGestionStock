package com.groudeau.gestionstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.groudeau.gestionstock.entity.Product;
import com.groudeau.gestionstock.repository.IProductRepository;

@SpringBootApplication
public class ServeurGestionStockApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ServeurGestionStockApplication.class, args);
		
		// Création du repository MySQL
		IProductRepository productRepository = context.getBean(IProductRepository.class);
		
		//Initialisation de la base de donnée avec 3 valeurs
		productRepository.save(new Product("Livre", 50, 20));
		productRepository.save(new Product("Cahier", 200, 5.25f));
		productRepository.save(new Product("Stylo", 500, 2.10f));
	}
}
