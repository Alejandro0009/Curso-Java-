/*
calcular el producto de los 10 primeros numeros inpares;
 */
package Ciclos;

import java.util.Scanner;

public class problema11 {
    public static void main (String []args){
        Scanner entrada= new Scanner (System.in);
        int numero;
        int m=1;
        for(int a=0;a<100;a++){
            System.out.println("ingrese numero:");
        numero= entrada.nextInt();
        if(numero%3==0){
            for(int i=0;i<9;i++){
                m=m*numero;
                System.out.println("ingrese otro numero: ");
                 numero= entrada.nextInt();
        
        }
            System.out.println(m);
        
        }else{
            
        
        }
        
        }
        
        
        
    
    }
    
    
    
}
