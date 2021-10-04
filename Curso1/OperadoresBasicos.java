
package Curso1;

import java.util.Scanner;


public class OperadoresBasicos {
    
    public static void main ( String []args){
        
        Scanner entrada= new Scanner(System.in); // primero llamo para almacenar datos 
        int numero1; 
        int numero2; 
        
        int suma; 
        int resta; 
        int division; 
        int multiplicacion; 
        int resto; 
        
        System.out.println("digita el numero uno: ");
        numero1 = entrada.nextInt();
        System.out.println("digite el numero dos: ");
        numero2 = entrada.nextInt(); 
        
        suma= numero1+numero2; 
        resta= numero1 - numero2;
        division = numero1 / numero2 ; 
        multiplicacion= numero1* numero2; 
        resto = numero1 % numero2; 
        
        System.out.println("el resultado de la suma es: "+suma );
        System.out.println("el resultado de la resta es: "+resta );
        System.out.println("el resultado de la division es: "+division );
        System.out.println("el resultado de la multiplicacion  es: "+multiplicacion);
        System.out.println("el resto de la division es: "+resto );
        
        
        
    
    }
    
}
