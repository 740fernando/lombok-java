package br.com.lbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lbk.model.Pedido;
import br.com.lbk.service.PedidoService;

@RestController
@RequestMapping("api/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService service;

	@GetMapping("/listar/todos")
	public ResponseEntity<List<Pedido>> ListarTodos() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("/salvar")
	public ResponseEntity<Pedido> salvar(@RequestBody Pedido request) {
		return ResponseEntity.ok(service.save(request));
	}

}
