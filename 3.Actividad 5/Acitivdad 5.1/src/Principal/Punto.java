package Principal;
/**
 * Representa un punto en el plano
 * 
 * @author usuario
 *
 */
public class Punto {
	
	/**
	 * Coordenada x del punto
	 */
	private double x;
	/**
	 * Coordenada y del punto
	 */
	private double y;
	/**
	 * Construye un punto con coordenadas(0,0)
	 */
	public Punto(){
		x=0.0;
		y=0.0;
	}
	/**
	 * Contruye un punto con las coordenadas dadas
	 * 
	 * @param x coordenada x
	 * @param y coordenada y
	 */
	public Punto(double x, double y){ //si nombro los paramentros de otro modo
		this.x=x;					 // no hara falta utilizar this
		this.y=y;
	}
	
	public Punto(Punto p){
		x=p.x;
		y=p.y;
	}
	
	public void pintar(){
		System.out.println("("+x+";"+y+")"); //esto imprime (x,y) con el parentesis
	}
	
	
	
	
}
