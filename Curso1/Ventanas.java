
package Curso1;

import javax.swing.JOptionPane;

public class Ventanas {
    
    
    public static void main (String []args ){
        String cadena; 
        int numero; 
        char caracter; 
        double decimal; 
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero."));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero double"));
        caracter= JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
        JOptionPane.showMessageDialog(null, "el numero entero es"+ numero );
        JOptionPane.showMessageDialog(null, "la cadena es "+ cadena);
        JOptionPane.showMessageDialog(null, "el decimal es: "+decimal );
        JOptionPane.showMessageDialog(null, "el caracter es:  "+ caracter);
        
              
    
    }
    
    
}
