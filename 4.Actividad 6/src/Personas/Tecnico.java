package Personas;

public class Tecnico extends Empleado {

	private float complemento;
	private byte quinquenios;
	
	
	public Tecnico(){	
	}
	
	public Tecnico(String nombre, byte edad, char sexo, String dni, 
			boolean bCasado, String idpersonal, float sueldo, float complemento, byte quinquenios){
		
		super(nombre,edad,sexo,dni,bCasado,idpersonal,sueldo);
		this.complemento=complemento;
		this.quinquenios=quinquenios;
	}
	
	@Override
	public float calcularAntiguedadMensual(){
		return 0.05f*quinquenios;
	}
	
	@Override
	public float calcularComplementosMensuales(){
		return 0.01f*getSueldo()*complemento;
	}
	
	@Override
	public float calcularSueldoBrutoMensual(){
		return getSueldo()+calcularAntiguedadMensual()+calcularComplementosMensuales();
	}
	
	
	public void inctoSueldo(float inc){
		float s=getSueldo();
		s=s*inc/100;
		setSueldo(s);
	}

	@Override
	public String toString(){
		return super.toString()+"\nEs un tecnico\n"
				+ " Su sueldo bruto es: "+calcularSueldoBrutoMensual();
	}
	
	
	
}
