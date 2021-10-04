/*
 Hacer un programa que lea un numero entero.
y muestre si es multiplo de diez. 

 */
package Condicionales;

import java.util.Scanner;


public class Problema1 {
    
    public static void main(String []args){
        
        Scanner entrada= new Scanner (System.in);
        
        int numero; 
              
        // pedir un numero entero 
        
        System.out.println("Por favor ingrese un numero entero: ");
        numero= entrada.nextInt();
        
        if( numero%10==0){
            System.out.println("El numero que ingreso es multiplo de 10." );
            System.out.println("El numero ingresado es: "+numero );
        
        }else{
            System.out.println("El numero no es multiplo de 10:");
             System.out.println("El numero ingresado es: "+numero );
        
        }
    
    }
    
}
