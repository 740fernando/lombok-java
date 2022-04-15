package br.com.lbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lbk.model.Product;
import br.com.lbk.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/listar/todos")
	public ResponseEntity<List<Product>> ListarTodos() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("/salvar")
	public ResponseEntity<Product> salvar(@RequestBody Product request) {
		return ResponseEntity.ok(service.save(request));
	}
}
