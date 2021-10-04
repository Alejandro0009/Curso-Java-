/*Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta:
suponiendo que todos los meses son de 30 dias:

*/

package Condicionales;

import java.util.Scanner;


public class problema9 {
    
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        int dia; 
        int mes; 
        int año; 
        
        
        
        
        System.out.println("ingrese un dia del mes:");
        dia=entrada.nextInt();
        System.out.println("Ingrese un mes del año:");
        mes=entrada.nextInt();
        System.out.println("Ingrese un año:");
        año=entrada.nextInt();
        
        if((dia>=0)&&(dia<=30)){
            System.out.println("Tu dia ingresado es correcto:");
            System.out.println(dia);
            
       }else{
            System.out.println("Tu numero no entra en el rango de dias existentes:");
        
        }
        if((mes>=1)&&(mes<=12)){
            System.out.println("Tu mes ingresado es correcto");
            System.out.println(mes);
        
        }else{
            System.out.println("Tu numero de mes, NO existe:");
        
        }
        System.out.println("Año correcto:");
        System.out.println(año);
     
        
        
        
        
    
    }}
    

