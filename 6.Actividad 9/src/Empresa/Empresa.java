package Empresa;

import java.util.Random;

import Personas.Empleado;
import Personas.Obrero;
import Personas.Tecnico;

public class Empresa {

	
	
	public static void main(String[] args) {
		Empleado[] empleados;
		Random rnd=new Random(System.currentTimeMillis());
		
		int l=rnd.nextInt(20);
		empleados=new Empleado[1];
		crearEmpleados(empleados);
		visualizarEmpleados(empleados);
	}

	public static void crearEmpleados(Empleado[] empleados){
		Random rnd=new Random(System.currentTimeMillis());
		
		for(int i=0;i<empleados.length;i++){
			int n=rnd.nextInt(4);
			if(n==3){
				empleados[i]=new Tecnico();
			}
			else{
				empleados[i]=new Obrero();
			}
		}
	}
	
	public static void visualizarEmpleados(Empleado[] empleados){
		for(Empleado emp: empleados){
			emp.pintar();
			System.out.println();
			System.out.println();
		}
	}
	
	public static void subirSueldos(Empleado[] empleados){
		Random rnd=new Random(System.currentTimeMillis());
		for(Empleado emp: empleados){
			float n=rnd.nextFloat()*10;
			emp.inctoSueldo(n);
		}
	}
}
