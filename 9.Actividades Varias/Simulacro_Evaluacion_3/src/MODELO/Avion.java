package MODELO;

public class Avion {
	
	private int idavion;
	private String descripcion;
	private Double peso;
	
	
	public Avion(){
	}
	
	public Avion (int idavion, String descripcion, double peso){
		this.idavion=idavion;
		this.descripcion=descripcion;
		this.peso=peso;
	}
	
	public Avion(Avion p){
		idavion=p.idavion;
		descripcion=p.descripcion;
		peso=p.peso;	
	}

	public int getIdavion() {
		return idavion;
	}

	public void setIdavion(int idavion) {
		this.idavion = idavion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString(){
		return "IDAvion: " +idavion+ "Descripcion: " +descripcion+ " peso: " +peso+"\n";
	}
	
	
}
