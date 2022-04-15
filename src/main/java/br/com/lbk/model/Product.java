package br.com.lbk.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="product")
public class Product {

	@Id
	private Integer id;
	
	private String descricao;
	
	private BigDecimal valor; // Para controlar de forma mais precisas as casas decimais, eh utilizado BigDecimal
}
