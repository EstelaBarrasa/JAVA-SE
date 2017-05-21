package general;

public class Clase02 extends Clase01{ //hija de Clase01, 
									 //si la clase esta en otro paquete
									//se pone elnombredelotropaquete.Clase01
	boolean disponible=true;
	
	public Clase02(boolean disponible,String nom){
		super(nom);
		this.disponible=disponible;
	}
	
	public Clase02(boolean d){
		super("Restituta");
		disponible=d;
	}
	
	public void hablar(){
		boolean disponible=false;
		saludar();
		System.out.println("AAA"+this.disponible);
		definirDatos();
	}

}
