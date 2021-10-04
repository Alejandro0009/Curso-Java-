/*
Hacer un programa que pase de kg a otra unidad de medida de masa, mostar un menu, para elegir:
 */
package Condicionales;

import javax.swing.JOptionPane;


public class problema15 {
    
    public static void main (String[]args){
        double kg;
        int option; 
        double A=10.0;
        double B=100.0;
        double C=1000.0;
        double D=10000.0;
        double E=100000.0;
        double F=1000000.0;
        
        // option 1:  8 kilos es igual a 80 hectagramo
        double HE,D1,GR,DE2,CE,MI;
       
        
        
        option= Integer.parseInt(JOptionPane.showInputDialog("Un programa que puede transformar de kilogramos a otra unidad de masa\n"
        +"seleccione a que unidad quiere transformar:\n"
        +"1. Hectagramo\n"
        +"2. Decagramo\n"
        +"3. Gramo\n"
                + "4. Decigramo\n"
                + "5. Centigramo\n"
                + "6. Miligramo\n"));
        
        kg= Double.parseDouble(JOptionPane.showInputDialog("cuantos Kg quiere converti:"));
        
        switch (option){
            case 1: 
                HE= kg*A;
                JOptionPane.showMessageDialog(null, "El resultado es: \n"
                +HE);
 break;
                case 2: 
                    D1= kg*B;
                    JOptionPane.showMessageDialog(null, "El resultado es: \n" 
                            +D1);
 break;
                case 3: 
                    GR= kg*C;
                    JOptionPane.showMessageDialog(null, "El resultado es: \n"
                +GR);
break;
                case 4: 
                    DE2= kg*D;
                    JOptionPane.showMessageDialog(null, "El resultado es: \n"
                +DE2);
break;

                case 5: 
                    CE= kg*E;
                    JOptionPane.showMessageDialog(null, "El resultado es: \n"
                +CE);
 break;
 
                case 6: 
                    MI= kg*F;
                    JOptionPane.showMessageDialog(null, "El resultado es: \n"
                +MI);
break;

                default: 
                    JOptionPane.showMessageDialog(null, "Seleccion invalida: \n");
              
                    break;
   
        }
    
    }
    
}
