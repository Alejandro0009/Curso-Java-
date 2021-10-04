/*
hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares, 
con el siguiente menu de opciones

ingresar dinero a cuenta 
Retirar dinero de la cuenta
salir
 */
package Condicionales;

import javax.swing.JOptionPane;


public class problema14 {
    
    public static void main(String[]args){
        final int SaldoIn=1000;
        int opcion;
        float ingreso, suma, resta,decremento;
        
        
        opcion= Integer.parseInt(JOptionPane.showInputDialog("bienvenido a su cajero automatico\n"
        +"1. Ingresar dinero\n"
        +"2. Retirar dinero\n"
        +"3.salir"));
        
        switch(opcion){
            case 1: 
                ingreso=Float.parseFloat(JOptionPane.showInputDialog("ingrese el saldo a guardar: "));
                suma=SaldoIn+ingreso;
                JOptionPane.showMessageDialog(null, "ingreso total:\n"
                +suma);
                
                
                break;
            
             case 2: 
                 decremento=Float.parseFloat(JOptionPane.showInputDialog("ingrese el saldo a guardar: "));
                 if(decremento<1000){
                resta=SaldoIn- decremento;
                JOptionPane.showMessageDialog(null, "ingreso total:\n"
                +resta);
                 }else{
                     JOptionPane.showMessageDialog(null, "ingreso total\n"
                     +"0");
                 
                 }
                 
                 break;
             
              case 3: 
                  
                  break;
              default: JOptionPane.showMessageDialog(null, "no existe la opcion:");
              break;
        
        }
    
    }
    
}
