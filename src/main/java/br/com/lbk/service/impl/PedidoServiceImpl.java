package br.com.lbk.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.lbk.model.Pedido;
import br.com.lbk.repository.PedidoRepository;
import br.com.lbk.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	private final PedidoRepository repo;
	
	public PedidoServiceImpl(PedidoRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public List<Pedido> findAll() {
		return repo.findAll();
	}

	@Override
	public Pedido save(Pedido request) {
		boolean test = validationId(request);
		if(test) {
			request.setId(UUID.randomUUID().toString());
		}
		return repo.save(request);
	}

	private boolean validationId(Pedido request) {
		boolean test = request.getId().equals(null)|| request.getId().isEmpty();
		return test;
	}

}
