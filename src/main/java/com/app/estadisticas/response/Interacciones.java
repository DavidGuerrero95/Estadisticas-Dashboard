package com.app.estadisticas.response;

public class Interacciones {

	private String nombre;
	private Integer estado;
	private Integer numeroEncuesta;
	private Integer numeroComentarios;
	private Integer numeroLikes;
	private Integer numeroSuscritos;
	private Integer numeroDislikes;
	private Integer numeroVisualizaciones;

	public Interacciones() {
	}

	public Interacciones(String nombre, Integer estado, Integer numeroEncuesta, Integer numeroComentarios,
			Integer numeroLikes, Integer numeroSuscritos, Integer numeroDislikes, Integer numeroVisualizaciones) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.numeroEncuesta = numeroEncuesta;
		this.numeroComentarios = numeroComentarios;
		this.numeroLikes = numeroLikes;
		this.numeroSuscritos = numeroSuscritos;
		this.numeroDislikes = numeroDislikes;
		this.numeroVisualizaciones = numeroVisualizaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getNumeroEncuesta() {
		return numeroEncuesta;
	}

	public void setNumeroEncuesta(Integer numeroEncuesta) {
		this.numeroEncuesta = numeroEncuesta;
	}

	public Integer getNumeroComentarios() {
		return numeroComentarios;
	}

	public void setNumeroComentarios(Integer numeroComentarios) {
		this.numeroComentarios = numeroComentarios;
	}

	public Integer getNumeroLikes() {
		return numeroLikes;
	}

	public void setNumeroLikes(Integer numeroLikes) {
		this.numeroLikes = numeroLikes;
	}

	public Integer getNumeroSuscritos() {
		return numeroSuscritos;
	}

	public void setNumeroSuscritos(Integer numeroSuscritos) {
		this.numeroSuscritos = numeroSuscritos;
	}

	public Integer getNumeroDislikes() {
		return numeroDislikes;
	}

	public void setNumeroDislikes(Integer numeroDislikes) {
		this.numeroDislikes = numeroDislikes;
	}

	public Integer getNumeroVisualizaciones() {
		return numeroVisualizaciones;
	}

	public void setNumeroVisualizaciones(Integer numeroVisualizaciones) {
		this.numeroVisualizaciones = numeroVisualizaciones;
	}

}
