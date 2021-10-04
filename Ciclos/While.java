
package Ciclos;

import java.util.Scanner;

/*
ciclos o bucles: 
un ciclo es aquella secuencia de instrucciones que se van a repetir siempre que se cumpla una determinada condicion: 

empecemso con: 

while(condicion){
instruccion;

}
*/

public class While {
    
    public static void main(String []args){
        
        Scanner entrada= new Scanner(System.in);
        int i=1 , contador;
       /* int i= 1; 
        int a=10;
        
        while(i<=10){
            System.out.println(i);
            i++;
        
        }
        while(a>=1){
            System.out.println(a);
            a--;
        
        }*/
        System.out.println("ingrese numero:");
        contador= entrada.nextInt();
        while(i<=contador){
            System.out.println(i);
            i++;
        //EL BUCLE WHILE SOLO SE VA A CUMPLIR SI LA CONDICION ES VERDADERA A DIFERENCIA DEL DO WHILE, QUE ESTE SI SE CUMPLE AUNQUE SEA UNA VEZ
        }
            
    
    }
    
}
