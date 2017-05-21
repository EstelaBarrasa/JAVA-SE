package Personas;

public  abstract class Empleado extends Persona{

	private String idpersonal;
	private float sueldo;
	
	
	public Empleado(){
	}
	
	
	public Empleado(String nombre, byte edad, char sexo, String dni, 
			boolean bCasado, String idpersonal, float sueldo){
		super(nombre,edad,sexo,dni,bCasado); //(super)la llamada al constructor padre 
		this.idpersonal=idpersonal;			//se hace desde un constructor hijo
		this.sueldo=sueldo;
	}

	
	public Empleado(Persona p,String idpersonal, float sueldo){
		super(p);
		this.idpersonal=idpersonal;
		this.sueldo=sueldo;
	}
	
	public Empleado(Empleado emp){
		super(emp); 
		idpersonal=emp.idpersonal;
		sueldo=emp.sueldo;
	}


	public String getIdpersonal() {
		return idpersonal;
	}
	public void setIdpersonal(String idpersonal) {
		this.idpersonal = idpersonal;
	}

	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public String toString(){
		return super.toString()+"\n Es un empleado\n"
				+ "Identificador personal: "+idpersonal+"\n"
				+ "Sueldo: " +sueldo;
	}
	
	@Override
	public void pintar(){
		System.out.println(this);
	}
	
	
	//abstract es para que el padre utilice las funciones de sus hijos pero
	//arriba en clase tiene que estar puesto el abstract tambien para que esto de abajo 
	//funcione
	public abstract float calcularAntiguedadMensual();
		
	public abstract float calcularComplementosMensuales();
	
	public abstract float calcularSueldoBrutoMensual();
	
	public abstract void inctoSueldo(float inc);
		
	
	
}
