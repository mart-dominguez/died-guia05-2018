package frsf.died2018.guia05;

import frsf.died2018.guia05.proyecto.Proyecto;
import frsf.died2018.guia05.proyecto.Tarea;
import frsf.died2018.guia05.rrhh.Contratado;
import frsf.died2018.guia05.rrhh.Empleado;
import frsf.died2018.guia05.rrhh.Permanente;

public class TestApp {

	public static void main(String[] args) {
		Empleado e1 = new Contratado("contrato1",100.0);
		Empleado e2 = new Permanente("contrato1",5,20000.0,30);
		
		Tarea t1 = new Tarea("tarea 1",e1,8);
		Tarea t2 = new Tarea("tarea 2",e2,18);		
		Tarea t3 = new Tarea("tarea 3",e1,12);		
		Tarea t4 = new Tarea("tarea 4",e2,8);		
		Tarea t5 = new Tarea("tarea 5",e1,4);		
		Tarea t6 = new Tarea("tarea 6",e2,6);		
		Tarea t7 = new Tarea("tarea 7",e1,8);		
		
		Proyecto p1 = new Proyecto("proyecto1", 50000.0);
		p1.agregarTarea(t1);
		p1.agregarTarea(t2);
		p1.agregarTarea(t3);
		p1.agregarTarea(t4);
		p1.agregarTarea(t5);
		p1.agregarTarea(t6);
		p1.agregarTarea(t7);		
		
	}
}
