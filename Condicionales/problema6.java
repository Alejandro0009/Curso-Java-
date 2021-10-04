/*Hacer un programa que tome dos numeros y diga si son  parse o impares; 

*/
package Condicionales;

import java.util.Scanner;

public class problema6 {
    
    public static void main (String []args){
        Scanner entrada=new Scanner (System.in);
        int num1,num2;
        System.out.println("ingresa dos numeros: ");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        
        if(num1%2==0){
            System.out.println("El numero ingresado por primera vez es par: "
            +num1);
        
        }else{
            System.out.println("El numero ingresado por primera vez no es par: "
            +num1);
        
        }if(num2%2==0){
             System.out.println("El numero ingresado por primera vez es par: "
            +num2);
        
        }else{
             System.out.println("El numero ingresado por primera vez no es par: "
            +num2);
        
        }
        
        
    
    }
    
}
