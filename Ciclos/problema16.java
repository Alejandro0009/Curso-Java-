/*
Pedir un numero del 0 al 10 y mostrar la tabla de multiplicar del numero 
 */
package Ciclos;

import javax.swing.JOptionPane;

public class problema16 {
    
    public static void main(String []args){
        int numero,res=0; 
        int contador=1;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingresa numero:"));
        
        for(int i=1;i<=10;i++){
            res=numero*i;
            JOptionPane.showMessageDialog(null, res);
           
             
    
    }
      
   
}}
