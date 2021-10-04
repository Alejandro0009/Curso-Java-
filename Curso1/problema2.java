
package Curso1;

import java.util.Scanner;

/*
hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajadas y de su salario por hora.
 
 */
public class problema2 {
    
    public static void main (String[]args){
        Scanner entrada= new Scanner (System.in);
        
        int horas; 
        int dias; 
        double salario ;
        int horaSemanales;
        double paga; 
        double pagaq;
        
        System.out.println("Por favor digite su ganancia por hora en la empresa. ");
        salario=entrada.nextDouble();
        
        System.out.println("Por favor digite el numero de dias que trabaja en la empresa a la semana. ");
        dias= entrada.nextInt();
        
        System.out.println("Por favor digete el numero de horas que trabaja en la empresa al dia. ");
        horas= entrada.nextInt();
        
        horaSemanales= dias*horas;
        
        System.out.println("las horas que trabaja a la semana es: "+ horaSemanales);
        
        paga=salario*horaSemanales;
        
        System.out.println("su sueldo por semana es de: "+paga);
        pagaq= paga*2;
        System.out.println("su sueldo por quincena es de: "+ pagaq);
        
        
    
    }
    
}
