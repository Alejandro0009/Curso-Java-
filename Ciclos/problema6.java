/*
Pedir numeros hasta que se tecle el numero 0 
mostrar la suma de todos los numeros introducidos; 
*/
package Ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;




public class problema6 {
    
    public static void main (String []args){
        Scanner entrada=new Scanner(System.in);
       
        int suma=0,numero=0; 
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(numero!=0){
            suma=suma+numero;
            //tambien se puede escribir de la siguiente manera:
            //suma+=numero
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros es de :\n"
                + suma);
        
      
        
      
        
       
        
    
    }
    
}
