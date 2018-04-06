package frsf.died2018.guia05.rrhh;

import frsf.died2018.guia05.proyecto.Tarea;

public class Contratado extends Empleado{

	private Double precioHoraBase;

	public Contratado() {
		super();
	}

	public Contratado(String nombre) {
		super(nombre);
	}

	public Contratado(String nombre,Double precio) {
		super(nombre);
		this.precioHoraBase=precio;
	}

	/**
	 * El costo hora de un empleado depende de la cantidad de horas asignadas que tiene.
	 * Si tiene tareas asignadas hasta por 10 horas, se cobra por cada hora, el precio base más un 25%.
	 * Si tiene entre 10 y 20 horas se cobra por cada hora el precio base.
	 * Si tiene mas de 20 horas se cobra por cada hora un descuento del 20% sobre el precio base. 
	 */
	@Override
	public Double costoHora() {
			Double costo = 0.0;
			if(this.horasAsignadas()<=10) costo = precioHoraBase*1.25;
			if(this.horasAsignadas()<10 && this.horasAsignadas()>=20) costo = precioHoraBase;
			if(this.horasAsignadas()>20 ) costo = precioHoraBase*0.8;
			return costo;
	}

	/**
	 * Un empleado contratado, solo puede tener asignadas hasta 3 tareas en estado PENDIENTE.
	 */
	@Override
	public void asignarTarea(Tarea t) {
		if(this.tareasPendientes()<3) {
			this.tareasAsignadas.add(t);		
			System.out.println("Tarea "+t.getNombre()+" asignada a empleado "+this.nombre+" por un costo de "+t.costo());
		}else {
			System.out.println("Tarea "+t.getNombre()+" NO FUE asignada a empleado "+this.nombre+" porque tiene pendientes de finalizar "+this.tareasPendientes()+" tareas");
			
		}
	}
	
	public Integer tareasPendientes() {
		Integer pendientes = 0;
		for(Tarea t:this.tareasAsignadas) {
			if(!t.isFinalizada()) pendientes++;
		}
		return pendientes;
	}
	
	
}