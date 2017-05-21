package general;

public class Principal {

	public static void main(String[] args) {
		Clase01 o=new Clase01("Pepe");
		
		o.leerDatos();
		System.out.println(o);
		
		Clase02 p=new Clase02(true);
		p.leerDatos();
	}

}
