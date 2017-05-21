
public class InmuebleEnAlquiler extends Inmueble {

	//atributo
	private double precioAlquiler;
	
	//redefinir los metodos abstractos de la clase padre para usarlos aqui
	@Override
	public double getTipoIva() {
		return 0;
	}

	@Override
	public double getPrecio() {
		return precioAlquiler;
	}
	
	//getter and setter
	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	//constructores
	public InmuebleEnAlquiler(){	//el constructor vacio
	}
		
	public InmuebleEnAlquiler(double Superficie, boolean Edificable, String Direccion, double precioAlquiler){
		super(Superficie,Edificable,Direccion);//hereda de la clase padre(inmueble)
		this.precioAlquiler=precioAlquiler;
	}
		
	public InmuebleEnAlquiler(InmuebleEnAlquiler enA){   //el constructor de copia
		super(enA);
		precioAlquiler=enA.precioAlquiler;
	}

	//redefinir metodo toString
	@Override
	public String toString() {
		return super.toString()+"\nEl precio es:\n"+precioAlquiler;
	}

	@Override
	public void setPrecio(double p){
		precioAlquiler=p;
	}
}
