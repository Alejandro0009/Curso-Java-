/*En Mega Plaza se hace un 20% de descuento a los clientes
cuya compra supere los 300pesos ¿cuanto pagara una persona por su compra? 

 */
package Condicionales;

import java.util.Scanner;


public class problema4 {
    
    public static void main ( String []args){
        
        Scanner entrada= new Scanner( System.in);
        
        double montoPagar,rebaja,operacion ; 
        System.out.println("¿Cuanto vas a pagar? calcularemos tu descuento: ");
        montoPagar=entrada.nextDouble();
        
        if (montoPagar>=300){
            operacion=montoPagar*0.20;
            rebaja=montoPagar-operacion;
            System.out.println("EL monto a pagar va a ser de: "
            +rebaja);
        
        }else {
            System.out.println("No tendras descuento: "+montoPagar);
        
        }
        
    
    
    }
    
}
