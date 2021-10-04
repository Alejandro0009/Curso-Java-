/*
simular una calculadora con las operaciones basicas que son las siguientes:
suma
resta 
multiplicacion
division 

el usuario debe especificar con las iniciales de los nombres de las operaciones basicas, la operacion a realizar_:


*/
package Condicionales;

import javax.swing.JOptionPane;


public class problema11 {
    
    public static void main(String[]args){
        
        int n1,n2,S,R,M,D;
        char letra;
        JOptionPane.showMessageDialog(null, "Vamos a realizar operaciones basicas,"
                + "tu eliges que operacion hacer escribiendo las iniciales,"
                + "empecemos:");
        
       n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1: "));
       n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2: "));
       letra=JOptionPane.showInputDialog("Ingrese la inicial EN MAYUSCULAS de la operacion que va a realizar:").charAt(0);
       
       if(letra=='S'){
           S=n1+n2;
           JOptionPane.showMessageDialog(null, "El resultado de tu suma es : "+S);
    
       } if(letra=='R'){
           R=n1-n2;
           JOptionPane.showMessageDialog(null, "El resultado de tu suma es : "+R);
    
       } if(letra=='M'){
           M=n1*n2;
           JOptionPane.showMessageDialog(null, "El resultado de tu suma es : "+M);
    
       } if(letra=='D'){
           D=n1/n2;
           JOptionPane.showMessageDialog(null, "El resultado de tu suma es : "+D);
    
       }
       
    
    }
    
}
