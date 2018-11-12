package com.cice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cice.Repositorio.RepositorioPedido;
import com.cice.convertitore.ConverterEnvio;
import com.cice.entity.EntityEnvio;
import com.cice.entity.EnvioEntity;
import com.cice.envioDto.EnvioDto;
import com.cice.gestionusuarios.web.dto.UsuarioDTO;

@Service
public class EnvioService {

	@Autowired
	RepositorioPedido repositorioPedido;
	
	@Autowired
	ConverterEnvio converterEnvio;
	
	public Long crearEnvio(EntityEnvio entita){ // POST POST
		Long idPedido=null;
		EntityEnvio save=	repositorioPedido.save(entita);
	idPedido=save.getId();
		return idPedido;
	}
	
	public List<EnvioDto> findAllEnvio() {
		List<EnvioDto> envioDtoList=null;
		
List<EntityEnvio> envioEntityList=repositorioPedido.findAll();
envioDtoList=new ArrayList<EnvioDto>();
		
	for(EntityEnvio entityEnvio: envioEntityList) {
		envioDtoList.add(converterEnvio.convertEntityToTdo(entityEnvio));
	}		
		return envioDtoList;
	}
	
	public Optional<EnvioDto> findEnvioById(Long idEnvio){
	Optional<EnvioDto> envioDtoOptional=Optional.empty();
	Optional<EntityEnvio> entityOptional=repositorioPedido.findById(idEnvio);
	if(entityOptional.isPresent()) {
		envioDtoOptional=Optional.of(converterEnvio.convertEntityToTdo(entityOptional.get()));
	}
		return envioDtoOptional;
	}
}
