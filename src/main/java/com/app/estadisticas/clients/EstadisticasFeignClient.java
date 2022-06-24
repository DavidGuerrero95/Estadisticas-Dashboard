package com.app.estadisticas.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.estadisticas.models.Estadisticas;

@FeignClient(name = "app-estadistica")
public interface EstadisticasFeignClient {

	@GetMapping("/estadistica/ver/estadisticas/{nombre}")
	public Estadisticas verEstadistica(@PathVariable("nombre") String nombre);
	
}
