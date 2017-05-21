package Personas;

import excepciones.PersonalNumberException;

public final class Obrero extends Empleado {
	
	private char turno;
	private byte trienios;
	
	public Obrero(){
		
	}
	
	public Obrero(String nombre, byte edad, char sexo, String dni, 
			boolean bCasado, String idpersonal, float sueldo, char turno, byte trienios)
					throws PersonalNumberException{
		
		super(nombre,edad,sexo,dni,bCasado,idpersonal,sueldo);
		this.turno=turno;
		this.trienios=trienios;
	}
	
	@Override
	public float calcularAntiguedadMensual(){
		return 0.03f*trienios;
	}
	
	@Override
	public float calcularComplementosMensuales(){
		float plus;
		switch(turno){
		case 'D':plus=3; break;
		case 'M':plus=5; break;
		case 'T':plus=10; break;
		case 'N':plus=15; break;
		default: plus=1;
		}
		return 0.01f*getSueldo()*plus;
	}
	
	@Override
	public float calcularSueldoBrutoMensual(){
		return getSueldo()+calcularAntiguedadMensual()+calcularComplementosMensuales();
	}
	
	@Override
	public void inctoSueldo(float inc){
		float s=getSueldo();
		s=s*inc/100;
		setSueldo(s);
	}

	@Override
	public String toString(){
		return super.toString()+"\nEs un obrero\n"
				+ " Su sueldo bruto es: "+calcularSueldoBrutoMensual();
	}
	
}



