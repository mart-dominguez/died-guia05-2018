package frsf.died2018.guia05.proyecto;

import java.util.ArrayList;

public class Proyecto {

	private String nombre;
	private Double presupuesto;
	private ArrayList<Tarea> tareas;
	
	public Proyecto() {
		this.tareas=new ArrayList<Tarea>();
		this.presupuesto=0.0;
	}
	
	public Proyecto(String nombre,Double presupuesto) {
		this();
		this.presupuesto=presupuesto;
		this.nombre = nombre;
	}

	public void agregarTarea(Tarea t) {
		if(t.costo()+presupuestoConsumido()<this.presupuesto) {
			this.tareas.add(t);
			System.out.println("La tarea "+t.getNombre()+" FUE asignada a "+t.getEmpleadoAsigando().getNombre()+" dado que tienen un costo de " +t.costo()+". Pesupuesto restante "+(this.presupuesto-presupuestoConsumido()));			
		}else {
			System.out.println("La tarea "+t.getNombre()+" NO FUE asignada a "+t.getEmpleadoAsigando().getNombre()+" dado que tienen un costo de " +t.costo()+"que sobrepasa el presupuesto restante "+(this.presupuesto-presupuestoConsumido()));
		}
	}
	
	public Double presupuestoConsumido() {
		Double resultado = 0.0;
		for(Tarea t: tareas) {
			resultado += t.costo();
		}
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
}
