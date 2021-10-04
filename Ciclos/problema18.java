/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class problema18 {
    
    public static void main (String []args){
        Scanner entrada=new Scanner(System.in);
        int codigo;//
        double FacturacionTotal=0;//
        double Cantidad_Litros_Vendidos;//
        double opcion1=0.6;
        int opcion2=3;
        double opcion3=1.25;
        int numero;
        double multiplicacion;
        double suma=0;
        int contador=0;
        double transformacion;
        double res;
        
        JOptionPane.showMessageDialog(null, "El siguiente programa te ayudara a calcular tus ventas por litro.");
        
        
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero de las siguientes opciones :\n"
                    + "1-  0.6 dolares el Litro\n"
                    + "2- 3 Dolares el Litro\n"
                    + "3- 1.25 Euros el Litro"));

        }while(numero>=4);
        for(int i=1;i<=2;i++){
             codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo del producto numero:"+i));
                 Cantidad_Litros_Vendidos=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos litros vendiste del producto numero?"+i));
            if(numero==1){
                
                
                 multiplicacion= Cantidad_Litros_Vendidos*opcion1;
                 suma=suma+multiplicacion;
                 FacturacionTotal=suma;
                 
            
            }if(numero==2){
                 
                  multiplicacion= Cantidad_Litros_Vendidos*opcion2;
                   suma=suma+multiplicacion;
                   FacturacionTotal=suma;
                   
            
            }if(numero==3){
                 
                  multiplicacion= Cantidad_Litros_Vendidos*opcion3;
                   suma=suma+multiplicacion;
                   res=suma;
                   transformacion=res/0.85;
                   FacturacionTotal=transformacion;
                    JOptionPane.showMessageDialog(null, "El valor de la suma de los euros a dolares en el producto numero:"+i+"es de: \n"+transformacion);
    
            }
              if (FacturacionTotal>600){
                  contador++;
              }
              JOptionPane.showMessageDialog(null, "Total de litros vendidos del producto numero"+i+"es de: \n"+Cantidad_Litros_Vendidos);
               JOptionPane.showMessageDialog(null, "La factura total del producto numero"+i+"es de: \n"+FacturacionTotal);
                JOptionPane.showMessageDialog(null, "El numero de veces que la factura se elevo mas de 600 en el numero del producto numero"+i+" es de:\n"+contador);
               
             
    
        }
        
      
             
        }
        
     
          
    
}


