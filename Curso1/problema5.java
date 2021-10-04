/*
la calificacion final de un estudiante de informatica se calcula con base a las calificaciones
de cuatro aspectos de su rendimiento academico:
participacion= 10%
primer examen parcial= 25% 
segundo examen parcial=25%
examen final =40%
*/
package Curso1;

import java.util.Scanner;


public class problema5 {
    
    public static void main (String []args){
        
        Scanner entrada= new Scanner (System.in);
        
        float  part;
        float exam1;
        float  exam2;
        float  examf, notafinal;
        
        //pedir los datos necesarios. 
        
        System.out.println("Digite la nota de participacion: ");
        part= entrada.nextFloat();
        System.out.println("Digite la  nota del primer examen parcial.");
        exam1 = entrada.nextFloat();
        System.out.println("Digite la nota del segundo  examen parcial.");
        exam2= entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen final. ");
        examf= entrada.nextFloat();
        
        part*=0.10f;
        exam1*=0.25f;
        exam2*=0.25f;
        examf*=0.40f;
        
        //sumanos las notas.
        notafinal= part+exam1+exam2+examf;
        
        //imprimir en pantalla
        
        System.out.println("la nota final es de: "+ notafinal);
        
        
    
    }
               
    
    }
    

