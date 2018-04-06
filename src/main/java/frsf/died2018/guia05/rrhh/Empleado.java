package frsf.died2018.guia05.rrhh;

import java.util.ArrayList;

import frsf.died2018.guia05.proyecto.Tarea;

public abstract class Empleado {

	protected String nombre;
	protected ArrayList<Tarea> tareasAsignadas;
	
	public Empleado() {
		this.tareasAsignadas = new ArrayList<Tarea>();
	}

	public Empleado(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected Integer horasAsignadas() {
		Integer horas = 0;
		for(Tarea t: this.tareasAsignadas) {
			horas += t.getHorasEstimadas();
		}
		return horas;
	}

	public abstract Double costoHora();
	
	public abstract void asignarTarea(Tarea t);
}
