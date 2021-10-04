/*
pedir 10 numeros y escribir la suma total: 
*/
package Ciclos;

import javax.swing.JOptionPane;


public class problema10 {
    
    public static void main(String []args){
        int numeros;
        int suma=0;
          
       
        
        for(int i=0; i<10;i++){
             numeros=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numeros: "));
             suma+=numeros;
            
        
        }
        JOptionPane.showMessageDialog(null, suma);
        
    
           
            
        
        
    
    }
    
}
