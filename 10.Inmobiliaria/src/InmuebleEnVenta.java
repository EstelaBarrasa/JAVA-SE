
public class InmuebleEnVenta extends Inmueble {
	
	//atributo
	private double precioVenta;
	
	//redefinir los metodos abstractos de la clase padre para usarlos aqui
	@Override
	public double getTipoIva() {
		return 10;
	}

	@Override
	public double getPrecio() {
		return precioVenta;
	}

	//getter and setter
	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	//constructores
	public InmuebleEnVenta(){	//el constructor vacio
	}
	
	public InmuebleEnVenta(double Superficie, boolean Edificable, String Direccion, double precioVenta){
		super(Superficie,Edificable,Direccion);//hereda de la clase padre(inmueble)
		this.precioVenta=precioVenta;
	}
	
	public InmuebleEnVenta(InmuebleEnVenta enV){   //el constructor de copia
		super(enV);
		precioVenta=enV.precioVenta;
	}

	//redefinir metodo toString
	@Override
	public String toString() {
		return super.toString()+"\nEl precio es:\n"+precioVenta;
	}
	
	@Override
	public void setPrecio(double p){
		precioVenta=p;
	}
	
}
