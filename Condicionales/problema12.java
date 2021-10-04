
package Condicionales;

import javax.swing.JOptionPane;

/* Realizar un programa solicitando una fecha en especifico.
utilizando 
switch
*/

public class problema12 {
    
   
    
    public static void main(String []args){
        String mes ;
        int dia; 
        int año; 
        
        mes= JOptionPane.showInputDialog("ingrese el mes: ");
        dia= Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia:"));
        año=Integer.parseInt(JOptionPane.showInputDialog("ingrese el año; "));
        
        
        
        switch(mes){
            case"enero": 
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
      break;
      
            case"febrero": 
            if((dia<=0)&&(dia>=28)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"marzo":
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"abril":
            if((dia<=0)&&(dia>=30)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"mayo": 
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"junio": 
            if((dia<=0)&&(dia>=30)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"julio": 
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"agosto": 
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"septiembre":
            if((dia<=0)&&(dia>=30)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"octubre": 
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"noviembre": 
            if((dia<=0)&&(dia>=30)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
            
            case"diciembre": 
            if((dia<=0)&&(dia>=31)){
                JOptionPane.showMessageDialog(null, "El dia es correcto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }else{
                JOptionPane.showMessageDialog(null, "El dia es incorrecto: "+dia);
                JOptionPane.showMessageDialog(null, "El mes es correcto: "+mes);
                JOptionPane.showMessageDialog(null, "El año es correcto: "+año);
            }
            break;
    
    }
        
    }
    
}
