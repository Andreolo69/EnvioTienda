package com.cice.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cice.entity.EntityEnvio;

public interface RepositorioPedido extends JpaRepository<EntityEnvio, Long> {

}
