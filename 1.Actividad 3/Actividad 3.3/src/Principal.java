import java.util.Random;
import java.util.Scanner;

public class Principal {
	
	static int aleatorio;
	
	public static void main(String[] args) {
		
		aleatorio=generarNumero(1,100);
		
		boolean seguir=true;
		int intentosRestantes=5;
		do{
			boolean r=jugarPartida(1,100);
			intentosRestantes--;
			if(r){
				seguir=false;
			}
			else{
				seguir=seguirJugando();
			}
			System.out.println("Te quedan "+intentosRestantes+" intentos restantes");
		}while(seguir && intentosRestantes>0);
		
	}
	
	static int generarNumero(int menor, int mayor){
		int l=mayor-menor+1;
		Random rnd=new Random(System.currentTimeMillis());
		int n=rnd.nextInt(l)+menor;
		return n;
	}
	
	static int decirNumero(int menor, int mayor){
		Scanner sc=new Scanner(System.in);
		int n=0;
		do{
			System.out.println("Introduce un numero del 1 al 100 : ");
			n=sc.nextInt();
			sc.nextLine();
		}while(n<menor && n>mayor);
		return n;
	}
	
	static boolean seguirJugando(){
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Desea seguir jugando? (S=si, otra tecla = no)");
		String r="";
		r=sc.nextLine();
		return r.equals("S") || r.equals("s");
	}
	
	static int resultadoJugada(int num_oculto, int num_jugada){
		int r=0;
		
		if(num_jugada<num_oculto){
			r=-1;
		}
		else if(num_jugada>num_oculto){
			r=1;
		}
		return r;
	}
	
	static boolean jugarPartida(int menor, int mayor){
		int numeroUsuario=decirNumero(menor,mayor);
		int r=resultadoJugada(aleatorio,numeroUsuario);
		if(r<0){
			System.out.println("El numero secreto es mayor");
		}
		else if(r>0){
			System.out.println("El numero secreto es menor");
		}
		else{
			System.out.println("Acertaste");
		}
		return r==0;
	}
	
}
