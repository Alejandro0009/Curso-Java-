
package Ciclos;

import javax.swing.JOptionPane;

/*Leer un numero e indicar si es positivo o negativo el proceso se repetira hasta que se intruduzca el valor de 0
*/
public class problema2 {
    
    public static void main (String []args){
        double n; 
        
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor: "));
        
        while(n!=0){
            if (n>0){
                 JOptionPane.showMessageDialog(null, "El valor es positivo: ");
                
            
            }else{
                JOptionPane.showMessageDialog(null, "El valor es negativo: ");
            
            }
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor: "));
            
        
        }
        
    
    }
    
}
