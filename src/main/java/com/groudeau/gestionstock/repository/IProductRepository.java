package com.groudeau.gestionstock.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groudeau.gestionstock.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

}
