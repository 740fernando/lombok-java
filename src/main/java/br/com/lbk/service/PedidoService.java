package br.com.lbk.service;

import java.util.List;

import br.com.lbk.model.Pedido;
import br.com.lbk.model.Product;

public interface PedidoService {

	List<Pedido> findAll();
	
	Pedido save(Pedido request);
}
