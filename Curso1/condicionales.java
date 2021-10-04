
package Curso1;

import javax.swing.JOptionPane;

public class condicionales {
    /*la sentencia 
    
    if (condicion 1){
    instrunccion 1;
    
    }else{
    istrunccion2;
    
    }
    
    nota: siempre se ejecuta una, puede ser el if, o el , else. 
    pero jamas se ejecutan las dos. 
    
    */
    
    public static void main(String [] args){
        
        int numero, dato= 5; 
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de numero: "));
        
        
        // este es el signo de desigualdad !=
        
        if (numero !=dato){
            JOptionPane.showMessageDialog(null, "el numero es diferente de: "+dato);
            
        
        }else{
            JOptionPane.showMessageDialog(null, "El numero tiene el mismo numero de dato: "+numero );
            
           
        
        }
        

}
    
}
