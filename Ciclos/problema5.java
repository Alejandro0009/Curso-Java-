/*
realizar un juego para adivinar un numero:
para ello debes generar un numero aleatoreo entre 0-100 luego ir pidiendo numeros 
indicando si es mayor o menor, y mostar el numero de intentos. 

el juego termina cuando el usuario acierta con el numero establecido. 
 */
package Ciclos;

import java.util.Scanner;

public class problema5 {
    
    public static void main(String[]args){
        Scanner entrada=new Scanner (System.in);
        int intentos=1; 
        int n;
        int n1;
        n=(int)(Math.random()*100);
        int suma=1;
        
        System.out.println("El numero random es: "+n);
        System.out.println("ingrese numero:");
        n1=entrada.nextInt();
        
        while(n!=n1){
            if (n>n1){
                intentos++;
                System.out.println("El numero es mayor:");
                System.out.println("ingrese otro numero:");
        n1=entrada.nextInt();
        suma++;
            
            }else{
                intentos++;
                System.out.println("El numero es menor: ");
                System.out.println("ingrese otro numero:");
        n1=entrada.nextInt();
        suma++;
            
            }
            
            
        
        }
        
        System.out.println("Felicidades encontraste el numero random: \n"
                +n);
        System.out.println("Numero de intentos:\n"
                + suma);
       
    
    }
    
}
