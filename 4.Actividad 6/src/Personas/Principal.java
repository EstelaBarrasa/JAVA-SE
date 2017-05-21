package Personas;

public class Principal {

	public static void main(String[] args) {
		Persona p1=new Persona();
		Persona p2=new Persona("Estela",(byte)27,'M',"03911548s",false);
		Persona p3=new Persona(p2);
		/* 
		 * esto no vale porque en la clase empleado la hemos puesto como abstracta
		Empleado emp1=new Empleado();
		Empleado emp2=new Empleado("Nacho",(byte)26,'V',"03544815l",true,"prod1",1500);
		Empleado emp3=new Empleado(p2,"admin1",2000);
		Empleado emp4=new Empleado(emp2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		if(p1.equals(p2)){
			System.out.println("Las personas son iguales");
		}
		else{
			System.out.println("Las personas son distintas");
		}
		
		if(emp2.equals(emp4)){
			System.out.println("Los empleados son iguales");
		}
		else{
			System.out.println("Los empleados son distintos");
		}
		
		Corredor c=new Corredor(p3,20000);
		c.pintar();
		*/
		
		Empleado emp1=new Tecnico("Nacho",(byte)26,'V',"03544815l",true,"prod1",1500,2,(byte)2);
		//Persona emp2=new Obrero("Andrea",(byte)50,'M',"03655484F",true,"ob1",1800,'M',(byte)2);
		Empleado emp2=new Obrero("Andrea",(byte)50,'M',"03655484F",true,"ob1",1800,'M',(byte)2);
		
		System.out.println(emp1.getSueldo());
		System.out.println(emp1.calcularSueldoBrutoMensual());
		//System.out.println(emp2.getSueldo());no te deja por que a sido declarado persona
		//arriba y persona no tiene sueldo.
		System.out.println(emp2.getSueldo());
		System.out.println(emp2.calcularSueldoBrutoMensual());
		
	}

}
