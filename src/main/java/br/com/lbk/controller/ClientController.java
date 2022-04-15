package br.com.lbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lbk.model.Client;
import br.com.lbk.service.ClientService;

@RestController
@RequestMapping("/api/client")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>>ListarTodos(){
		return ResponseEntity.ok(service.findAll());
	}
	@PostMapping
	public ResponseEntity<Client>salvar(@RequestBody Client request){
		return ResponseEntity.ok(service.save(request));
	}

}
