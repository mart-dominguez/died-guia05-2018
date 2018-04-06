package frsf.died2018.guia05.modelo;

import java.util.ArrayList;

public abstract class Empleado {

	protected String nombre;
	protected ArrayList<Tarea> tareasAsignadas;
	
	public abstract Double costoHora();
	
	public abstract void asignarTarea(Tarea t);
}
