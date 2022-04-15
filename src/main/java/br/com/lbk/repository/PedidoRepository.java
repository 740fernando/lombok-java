package br.com.lbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lbk.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, String> {

}
