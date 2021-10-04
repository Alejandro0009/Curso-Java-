/*
Pedir numero N y pedir N sueldos y mostar el sueldo maximo.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class problema20 {
    
    public static void main(String[]args){
        int numero;
        double sueldo;
        double mayor=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));
        
        for(int i=1;i<=numero;i++){
            sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo numero:"+i));
           
            
            
            if(sueldo>mayor){
                mayor=sueldo;

            }
           
        
        }
         JOptionPane.showMessageDialog(null, mayor);
        
    
    }
    
}
