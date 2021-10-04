/*
Dadas 6 notas escriba la cantidad de alumnos aprobados y los que no 
para pasar necesitas 4

 */
package Ciclos;

import javax.swing.JOptionPane;


public class problema19 {
    
    public static void main(String []args){
        double calificacion;
        int contador=0;
        
        for(int i =1;i<=6;i++){
            
            calificacion=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion numero "+i));
            if((calificacion>=0)&&(calificacion<=10)){
                if (calificacion>4){
                contador++;
            
            }
            
            }else{
                calificacion=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion numero "+i));
                while(calificacion>=10){
                     if (calificacion>4){
                contador++;
            
            }
                
                }
            
            }
            System.out.println("La calificacion del alumno:"+i+"\n Es de:"+calificacion);
            
            
            
        
        }
        
        JOptionPane.showMessageDialog(null, "El numero de alumnos aprobados es de;"+contador);
    
    
    }
    
}
