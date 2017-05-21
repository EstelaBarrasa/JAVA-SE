
public class Inmobiliaria {

	//atributos
	private Inmueble[] inmuebles=new Inmueble[500];//hasta 500 posiciones
	private int siguientePosicion=0; //se inicia en 0 y se van añadiendo inmuebles
	
	//metodos
	public void add(Inmueble Inm){ //añadir inmuebles en el array
			inmuebles[siguientePosicion]=Inm;
			siguientePosicion++;
	}

	public Inmueble get(int i){ 
		return inmuebles[i];
	}
	
	public int size(){
		return siguientePosicion;
	}
	
	public boolean estaLleno(){
		return siguientePosicion==500;
	}

	@Override
	public String toString() {
		String s="Esta inmobiliaria tiene "+size()+" inmuebles."; 
		for(int i=0;i<siguientePosicion;i++){	
			s=s+inmuebles[i].toString(); //te dice si es en venta o alguiler por que piya el toString de la clase
		}								
		return s;
	}
		

}
