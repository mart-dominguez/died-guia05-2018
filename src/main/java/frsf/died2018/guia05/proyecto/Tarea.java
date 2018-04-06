package frsf.died2018.guia05.proyecto;

import frsf.died2018.guia05.rrhh.Empleado;

public class Tarea {

	public Tarea() {
		this.finalizada=false;
	}

	
	public Tarea(String nombre, Empleado empleadoAsigando, Integer horasEstimadas) {
		this();
		this.nombre = nombre;
		this.empleadoAsigando = empleadoAsigando;
		this.horasEstimadas = horasEstimadas;
	}

	/**
	 * Descripcion de la tarea
	 */
	private String nombre;
	/**
	 * Empleado que tiene asignada la tarea.
	 * 
	 * @see Empleado
	 */
	private Empleado empleadoAsigando;
	/**
	 * Horas estimadas de trabajo para realizar esta tarea.
	 */
	private Integer horasEstimadas;
	/**
	 * Bandera que indica si la tarea está finalizada o no.
	 */
	private Boolean finalizada;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getEmpleadoAsigando() {
		return empleadoAsigando;
	}

	public void setEmpleadoAsigando(Empleado empleadoAsigando) {
		this.empleadoAsigando = empleadoAsigando;
	}

	public Integer getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(Integer horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void finalizar() {
		this.finalizada = true;
	}

	public void reabrir() {
		this.finalizada = false;
	}
	
	public boolean isFinalizada() {
		return this.finalizada;
	}
	
	public Double costo() {
		return this.empleadoAsigando.costoHora() * this.horasEstimadas;
	}

}
