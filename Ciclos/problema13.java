/*
Pedir 10 numeros mostrar la media de los numeros
numeros negativos y la cantidad de ceros;
 */
package Ciclos;

import java.util.Scanner;


public class problema13 {
    public static void main (String []args){
        Scanner entrada= new Scanner (System.in);
        int numero,acumulador=0,media,cero=1; 
        
        System.out.println("ingresa numero ");
            numero= entrada.nextInt();
        
        if (numero!=0){ 
           
            for(int i=0; i<9;i++){
            System.out.println("ingresa numero ");
            numero= entrada.nextInt();
            acumulador=acumulador+numero;
             
            
        
        }}else{
             for(int i=0; i<9;i++){
            System.out.println("ingresa numero ");
            numero= entrada.nextInt();
            acumulador=acumulador+numero;
            cero++;
                
                }
             
             
        
           
  
        }
        media=acumulador/10;
             System.out.println("la media es de :\n"
                     + media);
             System.out.println("numero de ceros:\n"
                     + cero );
        
        
        
        

    }
    
}
