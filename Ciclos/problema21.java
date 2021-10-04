/*
solicitar 10 numero e indicar cuantos negativos se solicitaron.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class problema21 {
    
    public static void main (String []args){
        int numero;
        int contador=0;
        
        for( int i=1;i<=2;i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog(+i+"-Ingresa un numero:"));
            
            if(numero<0){
                contador++;
            
            }
            
        
        }
        JOptionPane.showMessageDialog(null, "El total de numeros negativos es de:"+contador);
    
    }
    
}
