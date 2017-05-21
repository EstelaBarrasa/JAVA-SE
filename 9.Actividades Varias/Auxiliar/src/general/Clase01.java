package general;

public class Clase01 {
	private int numero;
	private String nombre;
	
	public Clase01(String nom){
		numero=5;
		nombre=nom;
	}
	
	public void definirDatos(){
		
	}
	
	public void leerDatos(){
		System.out.println(nombre+" "+numero);
	}
	
	protected static void saludar(){
		System.out.println("Hola");
	}
}
