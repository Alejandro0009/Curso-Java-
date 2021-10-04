/*
Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene:
 */
package Condicionales;

import java.util.Scanner;


public class problema8 {
    public static void main (String []args){
        
        Scanner entrada= new Scanner (System.in);
        int n1; 
        
        System.out.println("Ingrese un numero que tenga un valor entre: 0 y 99 999");
        System.out.println("Te dire cuantas cifras tiene: ");
        n1=entrada.nextInt();
        
        if((n1>=0)&&(n1<10)){
            System.out.println("tiene una cifra.");
        }
        if((n1>=10)&&(n1<100)){
            System.out.println("tiene dos cifras.");
        }
        if((n1>=100)&&(n1<1000)){
            System.out.println("tiene tres cifras.");
        }
        if((n1>=1000)&(n1<10000)){
            System.out.println("tiene cuatro cifras.");
        
        }
        if((n1>=10000)&&(n1<100000)){
            System.out.println("tiene cinco cifras.");
        
        }
        
        
        
        
    
    }}
    

