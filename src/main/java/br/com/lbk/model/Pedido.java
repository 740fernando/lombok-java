package br.com.lbk.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name="pedido")
public class Pedido {

	@Id
	private String id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Client client;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PedidoItem> itens; // Para controlar de forma mais precisas as casas decimais, eh utilizado BigDecimal
}
