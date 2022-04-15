package br.com.lbk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.lbk.model.Product;
import br.com.lbk.repository.ProductRepository;
import br.com.lbk.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository repo;
	
	public ProductServiceImpl(ProductRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public Product save(Product request) {
		return repo.save(request);
	}

}
