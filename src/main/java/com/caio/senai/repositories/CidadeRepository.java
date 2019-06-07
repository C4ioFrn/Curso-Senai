package com.caio.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caio.senai.domain.Cliente;

@Repository
public interface CidadeRepository extends JpaRepository<Cliente, Integer>  {

}
