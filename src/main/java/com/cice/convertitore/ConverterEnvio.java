package com.cice.convertitore;

import org.springframework.stereotype.Component;

import com.cice.entity.EntityEnvio;
import com.cice.envioDto.EnvioDto;

@Component
public class ConverterEnvio {
	
	public EnvioDto convertEntityToTdo(EntityEnvio ee) {
		
EnvioDto envioDTO=new EnvioDto(ee.getId(),  ee.getNombreUsuario(), ee.getNombrePedido(),ee.getPesoPedido(), ee.getDescriPedido(), ee.getCantidadPedido());
		
		return envioDTO;
	}

	
}
