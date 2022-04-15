package br.com.lbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lbk.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
