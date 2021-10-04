/*
 Pedir tres numero y ordenar de mayor a menor. 
 */
package Condicionales;

import java.util.Scanner;


public class problema7 {
    
    public static void main (String []args){
        
        Scanner entrada= new Scanner(System.in);
        
        int n1,n2,n3;
        
        System.out.println("Ingrese por favor 3 numeros: ");
        n1=entrada.nextInt();
        n2=entrada.nextInt();
        n3=entrada.nextInt();
        
        System.out.println("Te voy a ordenar tus numeros de mayor a menor:");
        
        
        if((n1>n2)&&(n1>n3)){
            if(n2>n3){
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            
            }}
        
        if((n2>n1)&&(n2>n3)){
           
            if(n1>n3){
                 System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
            
            }else{
                 System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1);}}
            
                    
            
            if((n3>n1)&&(n3>n2)){
                
                if(n1>n2){
                    System.out.println(n3);
                    System.out.println(n1);
                    System.out.println(n2);
                
                }else{
                    System.out.println(n3);
                    System.out.println(n2);
                    System.out.println(n1);}}
                
                }}
            
            
        
        
             
    
    

