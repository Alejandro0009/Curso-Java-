/*
Leer 10 numeros enteros, guradarlos en un arreglo. Debemos mostrarlo en 
el siguiente orden:  el primero, el ultimo, el segundo, el penultimo, etc.

 */
package Arreglos;

import java.util.Scanner;


public class problema4 {
    
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        int []numeros=new int [10];
        System.out.println("Vas a ingresar los valores del array. ");
        for (int i =0; i<10;i++){
            System.out.print((i+1)+".  Ingresa un numero:");
            numeros[i]=entrada.nextInt();
        
        }
        System.out.println("Valor del numero: "+numeros[0]);
        System.out.println("Valor del numero: "+numeros[9]);
        System.out.println("Valor del numero: "+numeros[1]);
        System.out.println("Valor del numero: "+numeros[8]);
        System.out.println("Valor del numero: "+numeros[2]);
        System.out.println("Valor del numero: "+numeros[7]);
        System.out.println("Valor del numero: "+numeros[3]);
        System.out.println("Valor del numero: "+numeros[6]);
        System.out.println("Valor del numero: "+numeros[4]);
        System.out.println("Valor del numero: "+numeros[5]);
        
        
    
    }
    
}
