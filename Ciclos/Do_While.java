

package Ciclos;

import java.util.Scanner;

public class Do_While {
    
    public static void main(String []args){
        Scanner entrada= new Scanner( System.in);
        int i=1, contador;
        
        /*
        en el ciclo do while. 
        primero ejecuta la condicion de do 
        y despues comprueba si se cumple la condicion en el while.
        si se cumple empieca de nuevo y si no se cumple, entonces solo ejecuta una sola vez 
        que seria lo que dice en las instrucciones de do.
        */
        
         System.out.println("digite un numero");
            contador=entrada.nextInt();
        do{
           
            System.out.println(i);
            i++;
            
        }while(i<=contador);
    
    
    
    }
    
}
