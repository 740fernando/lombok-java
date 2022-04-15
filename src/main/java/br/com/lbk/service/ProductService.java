package br.com.lbk.service;

import java.util.List;

import br.com.lbk.model.Product;

public interface ProductService {

	List<Product> findAll();
	
	Product save(Product request);
}
