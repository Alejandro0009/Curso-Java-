
package Ciclos;

import java.util.Scanner;

/*
for(inicializacion; condicion;aumento o decremento){
instruccion

}

*/


public class ciclo_for {
    
    public static void main(String[]args){
        Scanner entrada=new Scanner (System.in);
        int contador ;
        System.out.println("digite la cantidad de terminos:");
        contador=entrada.nextInt();
        
        for(int i=1; i<=contador;i++){
            System.out.println(i);
        
        }
        
        /*for(int i=1; i<=10;i++){
            System.out.println(i);
        
        }
        
        for(int a=10; a>=1;a--){
            System.out.println(a);
        
        }*/
    
    }
    
}
