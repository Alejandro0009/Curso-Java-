/*
Leer por teclado dos tablas de 10 numeros enteros y  mezclar 
en una tercera de la forma: el primero de A, el primero de B,
el segundo de A, el segundo de B, etc.

 */
package Arreglos;

import java.util.Scanner;

public class problema5 {
    
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int a[],b[],c[];
        
        a= new int [10];// arreglo a con 10 elemetos
        b= new int [10];// arreglo b con 10 elementos 
        c= new int [20];// arreglo que contendra el arreglo a,b:
        
        // elementos del primer array
        System.out.println("\nDigite los elementos del primer arreglo: ");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero:");
            a[i]= entrada.nextInt();
        
        }
        // elementos del segundo array
        System.out.println("\nDigite los elementos del segundo arreglo:");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero:");
            b[i]= entrada.nextInt();
        
        }
        // ahora vamos a mezclar los dos arreglos en el arreglo c
        // vamos utilizar el iterador j para el arreglo c 
        // vamos a utilizar el iterador i para a y b.
        
        int j=0;
        for(int i =0;i<10;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
            
        
        }
        System.out.println("\n El tercer arreglo es: ");
        for(int i=0;i<20;i++){
            System.out.print(c[i]+ "  ");
            
            
            
        
        }
        System.out.println("");
        
    
    }
    
}
