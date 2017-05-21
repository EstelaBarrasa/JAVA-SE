import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',	'D', 'X', 'B', 'N', 'J', 'Z', 'S',
				'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce solo el numero del DNI");
		int numero=sc.nextInt();
		sc.nextLine();
		char letra=letras[numero%letras.length];
		System.out.println("La letra es : " +letra);

	}

}
