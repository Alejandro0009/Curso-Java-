
package Curso1;

//hacer un programa que pueda calcular e imprima la  suma 3 calificaciones.

import java.util.Scanner;



public class problema1 {
    
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        
        
        float calificacion1,  calificacion2,  calificacion3; 
        float suma; 
        
        
        System.out.println("Digite 3 calificaciones: ");
        
        
        calificacion1 =entrada.nextFloat();
        calificacion2 =entrada.nextFloat();
        calificacion3 =entrada.nextFloat();
        
        suma= calificacion1+calificacion2+calificacion3;
        
        System.out.println("la suma es: "+suma );
        
        
        
        
    
    }
    
}
