package workers;

public class T1 extends Thread{

	@Override
	public void run(){
		for(int i=2000000;i<3000000;i++){
			System.out.println(i);
			try{
				sleep(2000);
			}
			catch(InterruptedException ie){
				System.out.println("T1 ¡Me han despertado a malas!");
			}
		}
	}
	
}
