package Personas;

/**
 * @author usuario
 *
 */
public class Persona {

	protected String nombre;
	protected byte edad;
	protected char sexo;
	protected String dni;
	protected boolean bCasado;
	
	
	public Persona(){
	}
	
	
	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.dni=dni;
		this.bCasado=bCasado;
	}

	
	public Persona(Persona p){
		nombre=p.nombre;
		edad=p.edad;
		sexo=p.sexo;
		dni=p.dni;
		bCasado=p.bCasado;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isbCasado() {
		return bCasado;
	}
	public void setBcasado(boolean bcasado) {
		this.bCasado = bCasado;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		else if(!(obj instanceof Persona)){
			return false;
		}
		else{
			Persona p=(Persona)obj;
			return nombre.equals(p.nombre)&& edad==p.edad && sexo==p.sexo && p.dni.equals(p.dni) && bCasado==p.bCasado;
		}
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Edad=" + edad + ", Sexo=" + sexo + ", DNI=" + dni + ", Casado="
				+ bCasado +"]";
	}


	public void pintar(){
		System.out.println(this);
	}
	
}

