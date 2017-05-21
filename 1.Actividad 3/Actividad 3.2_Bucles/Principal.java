
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Random rnd;
		rnd=new Random();
		
		int a=rnd.nextInt(20);
		
		for(int i=0; i<a; i++){
			int b=rnd.nextInt(48)+18;
			System.out.println(b);
		}
	
	}

}






//sysout+cntl+barra_espaciadora=para poner System.out.println()