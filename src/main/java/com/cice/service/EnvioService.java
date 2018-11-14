package com.cice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cice.Repositorio.RepositorioEnvio;
import com.cice.convertitore.ConverterEnvio;
import com.cice.entity.EntityEnvio;

import com.cice.envioDto.EnvioDto;


@Service
public class EnvioService {

	@Autowired
	private RepositorioEnvio repositorioEnvio;
	
	@Autowired
	private ConverterEnvio converterEnvio;
	
	public Long crearEnvio(EntityEnvio entita){ // POST POST
		Long idPedido=null;
		EntityEnvio save=repositorioEnvio.save(entita);
	idPedido=save.getId();
		return idPedido;
	}
	
	public List<EnvioDto> findAllEnvio() {//GET GET
		List<EnvioDto> envioDtoList=null;		
List<EntityEnvio> envioEntityList=repositorioEnvio.findAll();
envioDtoList=new ArrayList<EnvioDto>();		
	for(EntityEnvio entityEnvio: envioEntityList) {
		envioDtoList.add(converterEnvio.convertEntityToTdo(entityEnvio));
	}		
		return envioDtoList;
	}
	
	public Optional<EnvioDto> findEnvioById(Long idEnvio){//GETID GETID GETID
	Optional<EnvioDto> envioDtoOptional=Optional.empty();
	Optional<EntityEnvio> entityOptional=repositorioEnvio.findById(idEnvio);
	if(entityOptional.isPresent()) {
		envioDtoOptional=Optional.of(converterEnvio.convertEntityToTdo(entityOptional.get()));
	}
		return envioDtoOptional;
	}
	
	public void actualizarEnvio(EntityEnvio entityEnvio) {
		repositorioEnvio.save(entityEnvio);		
	}
	
	public Long eliminar(Long id) {
		repositorioEnvio.deleteById(id);
		return id;
	}
}
