/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner reader = new Scanner (System.in);
      
      int numero1=0;
      int numero2=0;
      float numero3;
      double suma;
      
      
      System.out.println("introduce el primer numero entero");
      numero1=reader.nextInt();
      System.out.println("introduce el segundo numero entero");
      numero2=reader.nextInt();
      System.out.println("introduce un numero decimal");
      numero3=reader.nextFloat();
      
      suma= numero1+numero2;
      System.out.println("La suma es " +suma);
      
      Scanner sc;
      sc=new Scanner(System.in);  
      String nombre;
      System.out.println("introduce tu nombre");
      nombre=sc.nextLine();
      String apellido;
      System.out.println("introduce tu apellido");
      apellido=sc.nextLine();
      System.out.println(nombre + apellido);
      
    }
    
}
