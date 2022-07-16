package com.app.estadisticas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.estadisticas.clients.EstadisticasFeignClient;
import com.app.estadisticas.clients.ProyectosFeignClient;
import com.app.estadisticas.models.Estadisticas;
import com.app.estadisticas.models.Proyectos;
import com.app.estadisticas.response.Interacciones;

@RestController
public class EstadisticasController {

	@Autowired
	ProyectosFeignClient pfClient;

	@Autowired
	EstadisticasFeignClient efClient;

	@GetMapping("/estadisticas/dashboard/numero-proyectos/")
	@ResponseStatus(code = HttpStatus.OK)
	public Integer verNumeroProyectos() {
		return pfClient.getProyectos().size();
	}

	@GetMapping("/estadisticas/dashboard/interacciones-proyectos/{formulario}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Interacciones> verInteraccionesProyecto(@PathVariable("formulario") Integer formulario) {
		List<Interacciones> listaInteracciones = new ArrayList<Interacciones>();
		List<Proyectos> listaProyectos = pfClient.getProyectos();
		if (!listaProyectos.isEmpty()) {
			listaProyectos.forEach(n -> {
				Interacciones interaccion = new Interacciones();
				interaccion.setNombre(n.getNombre());
				interaccion.setEstado(n.getEstadoProyecto());
				Estadisticas est = efClient.verEstadistica(n.getCodigoProyecto(), formulario);
				interaccion.setNumeroEncuesta(est.getNumeroCuestionario());
				interaccion.setNumeroComentarios(est.getNumeroComentarios());
				interaccion.setNumeroSuscritos(est.getNumeroSuscritas());
				interaccion.setNumeroLikes(est.getLikes());
				interaccion.setNumeroDislikes(est.getDislikes());
				interaccion.setNumeroVisualizaciones(est.getVisualizaciones());
				listaInteracciones.add(interaccion);
			});
		}
		return listaInteracciones;
	}

}
