package com.caio.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caio.senai.domain.Cliente;
import com.caio.senai.domain.Estado;
import com.caio.senai.domain.enuns.TipoCliente;
import com.caio.senai.repositories.ClienteRepository;
import com.caio.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{

	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
	
	Cliente cli1 = new Cliente(null, "Caio Martins Franco", "67887654312", "CaioFrn@hotmail.com ", TipoCliente.PESSOAFISICA);
	
	Cliente cli2 = new Cliente(null, "Guilherme", "98767654312", "Frn@hotmail.com ", TipoCliente.PESSOAFISICA);
	
	
	
	}
}
