package Personas;

import excepciones.PersonalNumberException;

public  abstract class Empleado extends Persona{
	
	//atributos
	private String idpersonal;
	private float sueldo;
	
	//constructores
	public Empleado(){
	}
	
	
	public Empleado(String nombre, byte edad, char sexo, String dni, 
			boolean bCasado, String idpersonal, float sueldo) throws PersonalNumberException{
		super(nombre,edad,sexo,dni,bCasado);//(super)la llamada al constructor padre se hace desde un constructor hijo
		comprobarIdPersonal(idpersonal);									
		this.idpersonal=idpersonal;			
		this.sueldo=sueldo;
	}

	
	public Empleado(Persona p,String idpersonal, float sueldo)throws PersonalNumberException{
		super(p);
		comprobarIdPersonal(idpersonal);
		this.idpersonal=idpersonal;
		this.sueldo=sueldo;
	}
	
	public Empleado(Empleado emp)throws PersonalNumberException{
		super(emp); 
		comprobarIdPersonal(idpersonal);
		idpersonal=emp.idpersonal;
		sueldo=emp.sueldo;
	}

	//getter and setter
	public String getIdpersonal(){
		return idpersonal;
	}
	public void setIdpersonal(String idpersonal)throws PersonalNumberException{
		comprobarIdPersonal(idpersonal);
		this.idpersonal = idpersonal;
	}

	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	//redefinir
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
	
	
	//metodo de exception
	private void comprobarIdPersonal(String idPersonal) throws PersonalNumberException{
		boolean lanzar=false;
		String comentario="";
		if(idPersonal.length()!=8){
			comentario="El personal ID debe tener 8 caracteres";
			lanzar = true;
		}
		else{
			for(int i=0;i<3;i++){
				char c=idPersonal.charAt(i);
				if(c<'A' || c>'Z'){
					lanzar=true;
					comentario="Los tres primeros caracteres no son letras en mayusucla";
					break;
				}
			}
			if(!lanzar){
				for(int i=3;i<8;i++){
					char c=idPersonal.charAt(i);
					if(c<'0' || c>'9'){
						lanzar=true;
						comentario="Los 5 ultimos caracteres no son numeros";
						break;
					}
				}
			}
		}
		if(lanzar){
			PersonalNumberException pe=new PersonalNumberException(comentario);
			throw pe;
		}
	}

	
	//abstract es para que el padre utilice las funciones de sus hijos pero
	//arriba en clase tiene que estar puesto el abstract tambien para que esto de abajo 
	//funcione
	public abstract float calcularAntiguedadMensual();
		
	public abstract float calcularComplementosMensuales();
	
	public abstract float calcularSueldoBrutoMensual();
	
	public abstract void inctoSueldo(float inc);
		
	
	
}
