package Principal;
/**
 * Representa un punto en el plano
 * 
 * @author usuario
 *
 */
public class Punto {
	
	public static final int MIN_X=0;
	public static final int MAX_X=300;
	public static final int MIN_Y=0;
	public static final int MAX_Y=300;
	
	/**
	 * Numero de puntos que hay creados en el sistema
	 */
	private static int numeroPuntos=0;
	
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
	
	/**
	 * True si las coordenadas estan dentro de los limites y false si no
	 */
	private boolean correcto=false;
	
	public Punto(){
		x=0.0;
		y=0.0;
		numeroPuntos++;
		correcto=true;
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
		numeroPuntos++;
		correcto=esCorrecto();
	}
	
	public Punto(Punto p){
		x=p.x;
		y=p.y;
		numeroPuntos++;
		correcto=esCorrecto();
	}
	
	public void pintar(){
		System.out.println("("+x+";"+y+")"); //esto imprime (x,y) con el parentesis
	}
	
	/**
	 * Devuelve el numero de puntos creados hasta ese momento
	 * @return numero de puntos
	 */
	public static int getNumeroPuntos(){
		return numeroPuntos;
	}
	
	/**
	 * Devuelve si las coordenadas del punto estan en el rango permitido
	 * @return true=estan en el rango, false no
	 */
	private boolean esCorrecto(){
		return x>=MIN_X && x<=MAX_X && y>=MIN_Y && y<=MAX_Y;
	}
	
	/**
	 * Devuelve si las coordenadas del punto estan en el rango permitido
	 * @return true=estan en el rango, false no
	 */
	public boolean esValido(){
		return correcto;
	}
	
	public void moverPunto(int dx,int dy){
		this.x=dx;
		this.y=dy;
		if(x>MAX_X) x=MAX_X; //x=x>MAX_X ? MAX_X : x;
		if(x<MIN_X) x=MIN_X;
		if(y>MAX_Y) y=MAX_Y;
		if(y<MIN_Y) y=MIN_Y;
	}
	
	public void moverPunto(int d){
		this.x=x+d;
		this.y=y+d;
		if(x>MAX_X) x=MAX_X;
		if(x<MIN_X) x=MIN_X;
		if(y>MAX_Y) y=MAX_Y;
		if(y<MIN_Y) y=MIN_Y;
	}
	
	public void moverPunto(){
		x=0;
		y=0;
	}
	
	
	
	
	
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		if(x<450){
			this.x = x;
		}
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return +x+" "+y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Punto p=(Punto)obj;
		return x==p.x && y==p.y;
	}
	
	
	
}
