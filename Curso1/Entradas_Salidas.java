
package Curso1;

import java.util.Scanner;

public class Entradas_Salidas {
    
    public static void main(String []args){
     Scanner entrada =new  Scanner(System.in);
     
     //Ejemplo de un numero entero.
     int numero; 
    
     
        System.out.println("digite un numero"); // forma de escribir en consola.
        numero = entrada.nextInt();  // forma de leer un numero.
        System.out.println("el numero que ingresaste es: "+numero);  // forma de mostrar resultados. 
        
        //Ejemplo de tipo de dato flotante.
         float numero1 ; 
         
         System.out.println("digite un numero de tipo float: ");
         numero1 = entrada.nextFloat();
         System.out.println("el numero que ingresaste es: "+numero1);
         
         //Ejemplo de tipo double 
         double numero2 ; 
         System.out.println("digite un numero de tipo double. ");
         numero2 = entrada.nextDouble();
         System.out.println("el numero de tipo double  que digitaste es: "+numero2);
         
         //ejemplo de cadena
         String cadena; 
         System.out.println("digite una cadena");
         cadena=entrada.nextLine();
         System.out.println("la cadena que ingreso es: "+cadena);
         
         //ejemplo de caracter
         char caracter; 
         System.out.println("ingrese un caracter");
         caracter= entrada.next().charAt(0);
         System.out.println("el caracter que ingreso es:"+caracter);
         
        
        
    
    
    }
    
}
