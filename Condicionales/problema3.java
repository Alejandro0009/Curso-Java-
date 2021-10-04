
package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula: 
*/

public class problema3 {
    
    public static void main (String[] args){
        
    Scanner entrada= new Scanner (System.in);
    
    char letra; 
    
    letra= JOptionPane.showInputDialog("ingrese una letra:").charAt(0);
    
    if (Character.isUpperCase(letra)){
        JOptionPane.showMessageDialog(null, "Esta es una letra mayuscula: "+letra);
    
    }else {
        JOptionPane.showMessageDialog(null, "Esta no es una letra mayuscula¨:"
                +letra);
    
    }
    
     
    
    }
    
}
