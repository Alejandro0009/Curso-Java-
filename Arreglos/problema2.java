/*
problema 2. 
 */
package Arreglos;

import java.util.Scanner;

public class problema2 {
    
    public static void main ( String[] args){
        
        Scanner entrada= new Scanner ( System.in);
        int[]numeros= new int [5];
        System.out.println("Ingresa los numeros del arreglo: ");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+".  Ingresa numero: ");
            numeros[i]= entrada.nextInt();
            
        }
        System.out.println("\n imprimir los numeros del arreglo: ");
        
            for ( int i=numeros.length-1;i>=0;i--){
                System.out.println("Indice   "+(i+1)+" ="+ numeros[i]);
        
        
        
        
        }
        
    
    }
    
}
