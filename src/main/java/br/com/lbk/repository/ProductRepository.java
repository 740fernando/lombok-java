package br.com.lbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lbk.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
