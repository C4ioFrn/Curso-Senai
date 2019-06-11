package com.caio.senai.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.caio.senai.domain.Cliente;
import com.caio.senai.repositories.ClienteRepository;

@Service
public class ClienteService {
private ClienteRepository repo;


public Cliente buscar(Integer IdCliente) {
	Optional<Cliente> obj = repo.findById(IdCliente);
	return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Número de id não encontrado. Id: " + IdCliente + ", tipo: " + Cliente.class.getName()));
}
}
