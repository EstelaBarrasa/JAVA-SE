package Principal;

import java.util.ArrayList;
import java.util.Random;

import Personas.Obrero;
import Personas.Persona;
import Personas.Tecnico;

public class ProgramaPersona {

	public static void main(String[] args) {
		
		ArrayList<Persona> personas= new ArrayList<Persona>();
		
		Random rnd=new Random();
		
		int numeroPersonas=rnd.nextInt(20);
		for(int i=0;i<numeroPersonas;i++){
			
			int n=rnd.nextInt(4)+1;
			Persona p=null;
			switch(n){
			case 1:
				p=new Persona();
				break;
			case 2:
			case 4:
				p=new Obrero();
				break;
			case 3:
				p=new Tecnico();
			}
			personas.add(p);
		}
		
		for (Persona q: personas){
			System.out.println(q);
		}
	}
}
