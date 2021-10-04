/*
Un obrero necesita calcular su salario semanal.
se obtiene de la siguiente manera: 
si tabaja 40 horas o menos le pagaran por hora 16 pesos por las primeras 40 horas, despues de las 40 primeras horas el
recibe 20 pesos por hora extras: 
 */
package Condicionales;

import java.util.Scanner;


public class problema5 {
    
    public static void main(String [] args){
        Scanner entrada= new Scanner (System.in);
        int Htrabaj, IniH;
        int dife;
        int PrimerH;
        int horaE;
        int suma;
        
        
        System.out.println("¿Cuantas horas trabajaste esta semana?"
                + "Te voy a ayudar acalcular tu salario.");
        Htrabaj=entrada.nextInt();
        
        if(Htrabaj>40){
            dife=Htrabaj-40;
            PrimerH=40*16;
            horaE=dife*20;
            suma=PrimerH+horaE;
            System.out.println("Tu salario es de: "+suma);
            
                       
        
        }else {
            IniH=Htrabaj*16;
            System.out.println("Tu salario es de:"+IniH);
            
        
        }
        
    
    }
    
}
