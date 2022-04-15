package br.com.lbk.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lbk.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
