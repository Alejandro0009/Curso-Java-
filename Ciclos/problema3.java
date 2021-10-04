/*
Leer numeros hasta que se introduzca 0, para cada uno indicar si es par o impar:
 */
package Ciclos;

import javax.swing.JOptionPane;


public class problema3 {
    
    public static void main (String[]args){
        double valor,n;
        valor=Double.parseDouble(JOptionPane.showInputDialog("ingresa un numero:"));
        n=valor%2;
        
        while(valor!=0){
            if(n==0){
                JOptionPane.showMessageDialog(null, "El valor es multiplo de 2\n"
                );
                
            }else{
                JOptionPane.showMessageDialog(null, "El valor no es multiplo de 2\n"
                );
            
            }
            valor=Double.parseDouble(JOptionPane.showInputDialog("ingresa otro numero:"));
            
      
        }
    
    }
    
}
