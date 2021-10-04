/*Pedir numeros hasta que se teclee uno negativo, y mostar cuantos numeros se introdujeron:

 */
package Ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class problema4 {
    
    public static void main(String[]args){
         int contador;
         int numerodeveces=1;
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingresa un numero");
        contador=entrada.nextInt();
        
        while(contador>=0){
            numerodeveces++;
            System.out.println("ingrese otro numero");
            contador=entrada.nextInt();
        
        }
        System.out.println("numero de veces agregando numeros: \n"
        +numerodeveces);
            
            

            
    
    }}
    

