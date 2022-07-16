package com.app.estadisticas.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.estadisticas.models.Estadisticas;

@FeignClient(name = "app-estadistica")
public interface EstadisticasFeignClient {

	@GetMapping("/estadisticas/proyecto/{idProyecto}/formulario/{formulario}")
	public Estadisticas verEstadistica(@PathVariable("idProyecto") Integer idProyecto,
			@PathVariable("formulario") Integer formulario);

}
