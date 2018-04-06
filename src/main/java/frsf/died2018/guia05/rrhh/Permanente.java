package frsf.died2018.guia05.rrhh;

import frsf.died2018.guia05.proyecto.Tarea;

public class Permanente extends Empleado {

	private Integer antiguedad;
	private Double sueldoMensual;
	private Integer horasMensuales;
	
	
	
	public Permanente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permanente(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	

	public Permanente(String nombre,Integer antiguedad, Double sueldoMensual, Integer horasMensuales) {
		super(nombre);
		this.antiguedad = antiguedad;
		this.sueldoMensual = sueldoMensual;
		this.horasMensuales = horasMensuales;
	}

	/**
	 * El costo hora de un empleado contratado depende de la antiguedad
	 * Hasta 3 años el costo hora es el cociente sueldoMensual/horasMensuales
	 * De 3 a 8 años es el cociente sueldoMensual/horasMensuales mas un 20%
	 * más de 8 años es el cociente sueldoMensual/horasMensuales mas un 40%
	 */
	@Override
	public Double costoHora() {
		Double costo = 0.0;
		if(this.antiguedad<=3) costo = this.sueldoMensual/this.horasMensuales;
		if(this.antiguedad>3 && this.antiguedad<=8) costo = (this.sueldoMensual/this.horasMensuales) *1.2;
		if(this.antiguedad>8 ) costo = (this.sueldoMensual/this.horasMensuales) *1.4;
		return costo;
	}
	
	/**
	 * A un empleado contratado se le pueden asignar tareas si y solo si
	 * la cantidad de horas mensuales es menor a la cantidad de tareas asignadas, 
	 * sin importar si la tarea está finalizada o no.
	 */
	@Override
	public void asignarTarea(Tarea t) {
		// TODO Auto-generated method stub
		if(horasAsignadas()<this.horasMensuales) {
			this.tareasAsignadas.add(t);
			System.out.println("Tarea "+t.getNombre()+" asignada a empleado "+this.nombre+" por un costo de "+t.costo());
		}else {
			System.out.println("Tarea "+t.getNombre()+" NO FUE asignada a empleado "+this.nombre+" porque tiene asignadas tareas por "+horasAsignadas()+" y supera sus horas mensuales "+this.horasMensuales);
			
		}
	}
	

}
