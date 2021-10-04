/*
Dada las edades y alturas de 5 alumnos, mostar la edad y estatura media, la cantidad de alumnos mayores a 18
y la cantidad de alumnos que miden mas de 1.75
 */
package Ciclos;

import javax.swing.JOptionPane;


public class problema15 {
    
    public static void main(String []args){
        int edad;
        double Mestatura;
        double Estatura; 
        double sumaedad=0;
        double sumaestatura=0;
        double res,res1;
        int contador=0,contador1=0;
        
        for(int i=1;i<=5;i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog("Alumno numero: "+i+"\nIngresar edad: "+i));
            Estatura=Double.parseDouble(JOptionPane.showInputDialog("Alumno numero:"+i+"\nIngresar estatura: "+i));
            
            sumaedad+=edad;
            sumaestatura+=Estatura;
            
  
            if (edad>=18){
                contador++;
   
            }if(Estatura>1.75){
                contador1++;
            
            }
        
        }
        
        res=sumaedad/5;
        res1=sumaestatura/5;
            
            
            
            JOptionPane.showMessageDialog(null, "La media de las edades es de:\n"
                    + res);
             JOptionPane.showMessageDialog(null, "La media de las estaturas es de:\n"
                    + res1);
              JOptionPane.showMessageDialog(null, "El total de personas que son mayores de edad es de; :\n"
                    + contador);
        
        }
    
    }
    

