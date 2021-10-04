/*
una compañia de carros paga a sus empleados un salario de 1000 pesos al mes.
mas una comision de 150 por cada carro vendido mas el 5 porciento del valor de la venta por carro 

 */
package Curso1;

import java.util.Scanner;

public class problema4 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int gamaAlta=1000000;
        int gamaMedia=500000;
        int gamaBaja=150000;
        double salario= 1000.0; 
        double porce1;
        double porce2;
        double porce3;
        int numeroCar1;
        int numeroCar2;
        int numeroCar3;
        int comisionf;
        int CarVendidos;
        double resultado1;
        double resultado2;
        double resultado3;
        double resultadofin;
        double resultadofin1;
                 

        
        
        System.out.println("Cuanto carros vendiste de gama alta:");  
        numeroCar1=entrada.nextInt();
        porce1=gamaAlta*0.05;
        System.out.println("el porcentaje 1 es de: "+porce1);
        resultado1=numeroCar1*porce1;
        
        
        System.out.println("Cuanto carros vendiste de gama media:");  
        numeroCar2=entrada.nextInt();
        porce2= gamaMedia*0.05;
         System.out.println("el porcentaje 2 es de: "+porce2);
        resultado2=numeroCar2*porce2;
        
        System.out.println("Cuanto carros vendiste de gama baja:");  
        numeroCar3=entrada.nextInt();
         porce3= gamaBaja*0.05;
          System.out.println("el porcentaje 3 es de: "+porce3);
         resultado3=numeroCar3*porce3;
        
        CarVendidos=numeroCar1+numeroCar2+numeroCar3;
        comisionf=CarVendidos*150;
        
        resultadofin=resultado1+resultado2+resultado3+comisionf;
         resultadofin1=resultadofin+salario;
         
        System.out.println("su ganancia es de: "+ resultadofin1);
        
        
        
        
        
        
        
        
    
    }
    
}
