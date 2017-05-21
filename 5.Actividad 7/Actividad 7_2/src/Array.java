import java.util.Arrays;

public class Array {
	
	int[]miembro=new int[6];
	
	public void rellenar(int i){
		miembro[0]=5;
		miembro[1]=2;
		miembro[2]=8;
		miembro[3]=7;
		miembro[4]=6;
		miembro[5]=1;
	}
	
	public void rellenar(){
		for(int i=0;i<miembro.length;i++){
			miembro[i]=(int)(Math.random()*48+1);
		}
	}
	
	
	public void ordenar(){
		Arrays.sort(miembro);
	}
	
	
	public void visualizar(){
		for(int i : miembro){
			System.out.println(i + ",");
		}
	}
}
