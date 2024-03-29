package com.caio.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caio.senai.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, String> {

}
