/*
Pedir una nota del 0 al 10 e indicar si la nota es: 
insuficiente 
suficiente
bien 
notable
sobresaliente
 */
package Condicionales;

import javax.swing.JOptionPane;


public class problema13 {
    
    public static void main(String[]args){
        int nota; 
        
        nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota"));
        
        if(nota<=10){
        
        switch (nota){
            case 10:
                JOptionPane.showMessageDialog(null , "sobresaliente: "+nota);
                
                break;
            case 9: 
                JOptionPane.showMessageDialog(null , "bien: "+nota);
                
                break;
            case 8: 
                JOptionPane.showMessageDialog(null , "bien: "+nota);
                
                break;
            case 7:
                JOptionPane.showMessageDialog(null , "suficiente: "+nota);
                
                break; 
            case 6: 
                JOptionPane.showMessageDialog(null , "insuficiente: "+nota);
                
                break;
                
            default: JOptionPane.showMessageDialog(null , "insuficiente"+nota);
            break;
                
        }
        
        }else{
            JOptionPane.showMessageDialog(null , "La nota ingresada no es un paramtero de calificacion: "+nota);
        
        }
    
    }
    
}
