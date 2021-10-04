/*
hacer un programa que calcule el cuadrado de una suma

(a+b)^2= a^2+b^2+2ab
 */
package Curso1;

import java.util.Scanner;


public class Problema6 {
    
    public static void main (String [] args){
        //meneter el metodo Scanner 
        Scanner entrada= new Scanner (System.in);
        //metemos variables de tipo double para las variables a, b; 
        
        double a,b;
        double res1,res2,res3, suma;
        
        // pedimos al usuario el valor de las variables. 
        System.out.println("Por favor ingrese el valor de 'a" );
        a= entrada.nextDouble();
        System.out.println("Por favor ingrese el valor de 'b");
        b=entrada.nextDouble();
        
        // hacemos los calculos, con los valores del usuario.
        
        res1=Math.pow(a, 2);
         res2=Math.pow(b, 2);
          res3=2*(a*b);
          
          // se realiza una suma.
          
          suma= res1+res2+res3;
          
          // se muestra en pantalla el resultado; 
          System.out.println("La formula es: "
                  + "(a+b)^2= a^2+b^2+2ab");
          System.out.println("El resultado de tu operacion es: "+res1+"+"+res2+"+"+res3);
          System.out.println("La suma es de: "+suma);
          
        
        
    
    
    } 
    
}
