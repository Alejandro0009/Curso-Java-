/*
pedir calificaciones y decir cuantos reprobaron:
 */
package Ciclos;

import javax.swing.JOptionPane;

public class problena22 {
    
    public static void main(String[]args){
        int numero;
        double calificacion;
        int contador=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de alumos:"));
        
        for( int i=0;i<numero;i++){
            calificacion=Double.parseDouble(JOptionPane.showInputDialog(+i+"-Ingresa una calificacion:"));
            
            if ((calificacion<6)&&(calificacion<=10)){
                contador++;
                
                JOptionPane.showMessageDialog(null, +i+"-Alumno reprobado\n"
                +calificacion);
            
            }else{
                 JOptionPane.showMessageDialog(null, "NO existeel numero en el rango de calificacion; \n");
            
            }
            
            
        
        }
        JOptionPane.showMessageDialog(null, "-Numero de alumnos reprobados:"+contador);
    
    }
    
}
