
public abstract class Inmueble {
	
	//atributos
	private double Superficie;
	private boolean Edificable;
	private String Direccion;
	
	//constructores
	public Inmueble(){ //constructor vacio
	}
	
	public Inmueble(double Superficie, boolean Edificable, String Direccion){
		this.Superficie=Superficie;
		this.Edificable=Edificable;
		this.Direccion=Direccion;
	}
	
	public Inmueble(Inmueble Inm){ //constructor de copia
		Superficie=Inm.Superficie;
		Edificable=Inm.Edificable;
		Direccion=Inm.Direccion;
	}

	//getter and setter
	public double getSuperficie() {
		return Superficie;
	}

	public void setSuperficie(double superficie) {
		Superficie = superficie;
	}

	public boolean isEdificable() {
		return Edificable;
	}

	public void setEdificable(boolean edificable) {
		Edificable = edificable;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	//redefinir toString
	@Override
	public String toString() {
		String e="";
		if (Edificable){
			e="Si";
		}
		else{
			e="No";
		}
		return  " \n"
				+"Inmueble:\n"
				+"Superficie: " + Superficie + "m2\n"
				+"Edificable: " + e + "\n"
				+"Direccion: " + Direccion;
	}

	//metodos
	public abstract double getTipoIva();
	
	public abstract double getPrecio();
	
	public double getPrecioTotal() {
		return getTipoIva()*getPrecio()/100+getPrecio(); //iva+precio
	}
	
	public abstract void setPrecio(double p);
		
}
