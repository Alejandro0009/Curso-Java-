/*
pedir numeros hasta que se introduzca uno negativo, y calcular la media; 
*/
package Ciclos;

import javax.swing.JOptionPane;


public class problema7 {
    
    public static void main(String[] args){
        int suma=0, numero=0;
        int media; 
        int i=0; 
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(numero>0){
            
            suma+=numero; 
             numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
             i++;
             
        
        }
        media=suma/i;
        /*JOptionPane.showMessageDialog(null, 
                + i);*/
        
        JOptionPane.showMessageDialog(null, "La media de los numero es: \n"
                + media);
        
        
    
    }
    
}
