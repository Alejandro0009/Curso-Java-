/*
Una empresa que se dedica a la venta de desinfectantes, necesita un programa para gestionar las facturas:
En cada factura figura. El codigo del articulo, la cantidad vendida en litros y el precio por litro:
se pide de 5 facturas introducidas 

facturacion total:
cantidad en litros vendido del articulo 1:
cuantas facturas se emitieron mayor a 600;

 */
package Ciclos;

import javax.swing.JOptionPane;


public class problema17 {
    
    public static void main (String []args){
        int codigo;//
        double CantidadVendidaLitros=0;
        int PrecioxLitro;//
        int FacturacionTotal=0;//
        int Cantidad_Litros_Vendidos;//
        int contador=0;
        int multiplicacion;
        int suma=0;
        
        for(int i=1;i<=2;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo numero\n"+i));
             PrecioxLitro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por litro del articulo numero\n"+i));
              Cantidad_Litros_Vendidos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos del  articulo numero\n"+i));
              
              CantidadVendidaLitros=CantidadVendidaLitros+Cantidad_Litros_Vendidos;
              multiplicacion=PrecioxLitro*Cantidad_Litros_Vendidos;
              suma=suma+multiplicacion;
              FacturacionTotal=suma;
              
               
              
              
              
              
              if (FacturacionTotal>600){
                  contador++;
                  
              
              }
              System.out.println("El codigo de la factura es:"+i+"\n"+codigo);
              


        }
        
     
             
              System.out.println("Total de litros vendidos:"+CantidadVendidaLitros);
               System.out.println("La factura total es de: "+FacturacionTotal);
               System.out.println("El numero de veces que la factura se elevo mas de 600 es: \n"
               +contador);
            
    }
    
}
