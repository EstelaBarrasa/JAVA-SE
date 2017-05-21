package Personas;

public class Corredor extends Persona {

	private float distancia;
	
	public Corredor(String nombre, byte edad, char sexo, String dni, boolean bCasado){
		super(nombre,edad,sexo,dni,bCasado);
		this.distancia=distancia;
	}
	
	public Corredor(Persona p, float distancia){
		super(p);
		this.distancia=distancia;
	}
	
	
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	@Override
	public void pintar(){
		String s="Corredor [Nombre=" + nombre + ", Edad=" + edad + ", Sexo=" + sexo + ", DNI=" + dni + ", Casado="
				+ bCasado +"Distancia="+distancia+"]";
				
		System.out.println(s);
	}
	
	
	public void  prueba(){
		System.out.println(nombre);
	}
}
