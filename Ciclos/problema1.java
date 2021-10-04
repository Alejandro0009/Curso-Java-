/*
leer un numero y mostrar su cuadrado, repetir el procesos hasta que se introduzca un numero negativo:
 */
package Ciclos;

import javax.swing.JOptionPane;


public class problema1 {
    
    public static void main (String []args){
        double n;
        double c;
         n=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero, para determinar su cuadrado: "));
        
        
        do{
            
            c=Math.pow(n, 2);
            JOptionPane.showMessageDialog(null, +c);
            n=Double.parseDouble(JOptionPane.showInputDialog("ingrese otro numero, para determinar su cuadrado: "));
        
            
        
        }while(n>=0);
    
    
        
        
            
        
        }
    
    }
    

