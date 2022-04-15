package br.com.lbk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.lbk.model.Client;
import br.com.lbk.repository.ClientRepository;
import br.com.lbk.service.ClientService;

public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository repo;
	@Override
	public List<Client> findAll() {
		return null;
	}

}
