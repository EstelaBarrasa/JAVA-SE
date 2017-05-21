package ui;

import workers.Reloj;
import workers.T1;
import workers.T2;

public class Principal {

	public static void main(String[] args) {
		
		//T1 t1=new T1();
		//T2 t2=new T2();
		
		//t1.start();
		//t2.start();
		
		Reloj c=new Reloj();
		c.start();
		Reloj c2=new Reloj();
		c2.start();
		Reloj c3=new Reloj();
		c3.start();
		
		try{
			c.join();
			c2.join();
			c3.join();
		}
		catch(InterruptedException ie){
			System.out.println("Algo ha pasado y me han despertado sin que teminen los cronometros");
		}
		System.out.println("Los tres relojes han parado");
		
	}

}
