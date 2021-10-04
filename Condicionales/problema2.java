/*
pedir dos numeros y decir cual es el mayor o si son iguales.
 */
package Condicionales;

import java.util.Scanner;


public class problema2 {
    
    public static void main (String []args){
        
        //Metemos el metodo Scanner para poder pedir datos al usuario.
        Scanner entrada= new Scanner( System.in);
        
        //Metemos las variables que se van a  utilizar. 
        int num2,num1; 
        
        // solicitamos los numeros: 
        System.out.println("Por favor ingrese dos numero, para poder compararlos: ");
        num1= entrada.nextInt();
        num2=entrada.nextInt();
        
        // usamos condicional para determinar parametros: 
        
        if(num1!=num2){
            
            if(num1<num2){
                System.out.println("El numero que se ingreso en segundo lugar es el que tiene denominacion mas alta: ");
                System.out.println("El numero es el siguiente: "
                +num2);
            
            }else{
                System.out.println("El numero que se ingreso en primer lugar es el que tiene denominacion mas alta:");
                System.out.println("El numero es el sigiente:"
                        + num1);
            
            }
        
        }else {
            System.out.println("Los numeros son iguales. ");
            System.out.println("El numero que se repite es : "
                    + num1);
        
        }
        
        }
        
        }
        
    
    
    

