package com.cice.risorse;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cice.entity.EntityEnvio;
import com.cice.envioDto.EnvioDto;
import com.cice.service.EnvioService;

@RestController
public class EnvioRisorse {
	
	@Autowired
	EnvioService envioService;
	
	@RequestMapping(method=RequestMethod.POST, path="/envios")
	public Long insertaPedidos(@RequestBody EntityEnvio entityEnvio) {
		Long envio=null;
		envio=envioService.crearEnvio(entityEnvio);
		return envio;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/envios")
	public List<EnvioDto> getAllPedidos() {
		List<EnvioDto> listaEnvios=null;
		envioService.findAllEnvio();
		return listaEnvios;
	}
	@RequestMapping(method=RequestMethod.GET, path="/envios/{id}")
	public EnvioDto getOnePedido(@PathVariable(name="id") Long id) {
		EnvioDto envioDto=null;
		Optional<EnvioDto> envio=envioService.findEnvioById(id);
		if(envio.isPresent()) {
			envioDto=envio.get();
		}
		return envioDto;
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="/envios/{id}")
	public void upDatePedidos() {
		
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/envios/{id}")
	public void deletePedidos() {
		
	}
}
