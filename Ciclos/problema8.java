/*
pedir n numeros y mostrar en pantalla todos los numeros: 
 */
package Ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class problema8 {
    
    public static void main (String[]args){
        Scanner entrada= new Scanner (System.in);
        
        int numero;
        String almacenamiento="";
        
        
        numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        
        while(numero>0){
            String transformacion=numero+"\n"
                    + "";
            almacenamiento+=transformacion;
            numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
            
            
            
        
        }
        System.out.println(almacenamiento);
    
    }
    
}
