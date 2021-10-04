/*
pedir un numero y sacar su factorial
 */
package Ciclos;

import java.util.Scanner;

public class problema12 {
    
    public static void main(String[]args){
        Scanner entrada=new Scanner (System.in);
        double factorial=1; 
        double n;
        System.out.println("ingresa numero; ");
        n=entrada.nextInt();
        
        while(n!=0){
            factorial=factorial*n;
            n--;
       
        }
        System.out.println(factorial);

    }
    
}
