package workers;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Reloj extends Thread {
	private static char siguienteId='A';
	
	
	private char id;
	private boolean seguir=true;
	
	public Reloj(){
		id=siguienteId;
		siguienteId++;
	}
	
	//La ejecución se para despues de una cantidad de segundos aleatoria
	public void run(){
		
		Random rnd=new Random();
		int s=rnd.nextInt(15); //segundos que se estar ejecutando el Thread
		System.out.println("El reloj "+id+" parará despues de "+s+" segundos.");
		long t0=System.currentTimeMillis();
		
		while(seguir){
			
			
			//Date d=new Date(System.currentTimeMillis());
			
			//System.out.println(d+" "+d.getHours()+":"+d.getMinutes()+":");
			
			GregorianCalendar c=new GregorianCalendar();
			System.out.println("Reloj "+id+" -> " 
					+c.get(Calendar.HOUR_OF_DAY)
					+":"+c.get(Calendar.MINUTE)
					+":"+c.get(Calendar.SECOND)
					+" "+c.get(Calendar.MILLISECOND));
			try{
				sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println(" T2¡Me han despertado a malas!");
			}
			
			long t1=System.currentTimeMillis();
			if(t1-t0>=s*1000) seguir=false; // si han pasado los s segundos señalo que hay que salir
			
		}
		
		System.out.println("Reloj "+id+" parando...");
	}
	
	public void parar(){
		seguir=false;
	}
	
}
