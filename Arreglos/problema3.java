
package Arreglos;

import java.util.Scanner;


public class problema3 {
    
    public static void main( String [] args){
        
        Scanner entrada= new Scanner ( System.in);
        int suma_positivos=0,suma_negativos=0,media_positivos,media_negativos;
        int conteo_positivos=0,conteo_negativos=0,conteo_ceros=0;
        int [] numero = new int [5];
        System.out.println("Ingresa los numeros del arreglo:");
        for( int i =0; i<5; i++){
            System.out.print((i+1)+".  Ingresa el valor del arreglo:");
            numero[i]= entrada.nextInt();
            
            if(numero[i]==0){
                conteo_ceros++;
            
            }else if (numero[i]>0){
                suma_positivos+=numero[i];
                conteo_positivos++;
            
            }else{
                suma_negativos+=numero[i];
                conteo_negativos++;
            
            }
        
        }
        //media de los numeros
        if(conteo_positivos==0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }else{
            media_positivos=suma_positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: \n"+media_positivos);
        
        }
        // media de los numeros negativos.
        
        if(conteo_negativos==0){
            System.out.println("No se puede sacar la media de los numeros negativos ");
        
        }
        else{
            media_negativos=suma_negativos/conteo_negativos;
            System.out.println("La media de los numeros negativos es: \n"+media_negativos);
        
        }
        System.out.println("La cantidad de ceros es de: \n"+conteo_ceros);
        
       
        
    
    }
    
}
