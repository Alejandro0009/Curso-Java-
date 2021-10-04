/*
Leer los datos correspondientes a dos tablas de 12 
elementos numericos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la tabla B. etc.
 */
package Arreglos;

import java.util.Scanner;


public class problema6 {
    
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        int a[],b[],c[];
        
        a= new int [12];
        b= new int[12];
        c= new int [24];
        
        System.out.println("Vamos a ingresa los valores del array numero 1:");
        for(int i=0; i<12;i++){
            System.out.print((i+1)+". Ingresa un numero:");
            a[i]=entrada.nextInt();
        
        }
        // valores del array numero dos. 
         System.out.println("\nVamos a ingresa los valores del array numero 1:");
        for(int i=0; i<12;i++){
            System.out.print((i+1)+". Ingresa un numero:");
            b[i]=entrada.nextInt();
        
        }
        int j=0;
        for( int i=0;i<12;i++){
            c[j]=a[i];
            j++;
           
           
            c[j]=b[i];
            j++;
            
        
        }
        System.out.println("\n El tecer arreglo es:");
        for(int i=0; i<24;i++){
            System.out.println(c[i]+" ");
        
        }
        System.out.println(" ");
    }
    
}
