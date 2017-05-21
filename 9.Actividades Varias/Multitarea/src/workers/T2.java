package workers;

public class T2 extends Thread {//Cualquier clase que extienda Thread se puede utilizar para implementar multitarea

	@Override
	public void run(){
		for(int i=0;i<1000000;i++){
			System.out.println(i);
			try{
				sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println(" T2¡Me han despertado a malas!");
			}
		}
	}
	
}
