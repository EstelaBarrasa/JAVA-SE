
public class Principal {

	public static void main(String[] args) {
		
		//instanciar
		InmuebleEnVenta Inm1= new InmuebleEnVenta(80,true,"Toledo",40000);
		InmuebleEnVenta Inm2= new InmuebleEnVenta(95,true,"Mocejon",38000);
		InmuebleEnVenta Inm3= new InmuebleEnVenta(70,false,"Santa Maria de Benquerencia",32000);

		InmuebleEnAlquiler Inm4= new InmuebleEnAlquiler(80,true,"Bargas",300);
		InmuebleEnAlquiler Inm5= new InmuebleEnAlquiler(95,true,"Magan",150);
		InmuebleEnAlquiler Inm6= new InmuebleEnAlquiler(70,false,"Toledo",450);
		
		Inmobiliaria Inmo1=new Inmobiliaria();
		Inmo1.add(Inm1);
		Inmo1.add(Inm2);
		Inmo1.add(Inm3);
		Inmo1.add(Inm4);
		Inmo1.add(Inm5);
		Inmo1.add(Inm6);
		
		//imprimir
		System.out.println(Inmo1);
	
		for(int i=0;i<Inmo1.size();i++){
			Inmueble inm=Inmo1.get(i);
			double p=inm.getPrecio()*1.1;
			inm.setPrecio(p);
		}
		
		//imprimir
		System.out.println(Inmo1);
	}

}
