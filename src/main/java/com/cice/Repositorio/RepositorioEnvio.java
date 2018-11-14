package com.cice.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cice.entity.EntityEnvio;
import com.cice.envioDto.EnvioDto;

@Repository
public interface RepositorioEnvio extends JpaRepository<EntityEnvio, Long> {



}
