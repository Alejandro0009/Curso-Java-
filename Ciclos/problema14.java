/*pedir 10 sueldos mostrar sus sumas y cuantos hay mayores de 1000
*/
package Ciclos;

import javax.swing.JOptionPane;

public class problema14 {
    public static void main(String []args){
        int n;
        int suma=0;
        int contador=0;
        
        
        for(int i=0;i<10;i++){
            
             n=Integer.parseInt(JOptionPane.showInputDialog("ingrese otro sueldo"));
             suma=suma+n;
             
             if(n>1000){
            contador++;
        
        }
        
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los saldos es de:\n"
                + suma);
        JOptionPane.showMessageDialog(null, "Los numeros que son mayores a 1000 en total son:  \n"
                + contador);
    
    }
    
}
