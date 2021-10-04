

package Arreglos;

import java.util.Scanner;

public class problema1 {
    
    public static void main (String []args){
        
        Scanner entrada= new Scanner(System.in);
        
        int nElementos;
        System.out.println("cuantos elementos, tendra su array: ");
        nElementos= entrada.nextInt();
        int []numeros= new int[nElementos];
        System.out.println("Digite los elemetos del array:");
        for(int i=0;i<nElementos;i++){
             
            System.out.println((i+1)+"\n Digite el numero:");
            numeros[i]=entrada.nextInt();
            
        
        }
        for(int i=0;i<nElementos;i++){
             System.out.println(numeros[i]);
        
        }
        
       
        
        
      
    
    }
    
}
