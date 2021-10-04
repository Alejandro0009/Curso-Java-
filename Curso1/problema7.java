
package Curso1;

import java.util.Scanner;

/*construir un programa que dado el numero total de  horas,
devuelve el numero de semanas, dias y horas equivalentes
*/

public class problema7 {
    
    public static void main (String[ ]args){
        Scanner entrada= new Scanner(System.in);
        
        int horaUsuario,año, mes, semana, hora, dia;
        
        System.out.println("cuantas horas quiere calcular. ");
        horaUsuario= entrada.nextInt();
        
         if(horaUsuario<8760){
            System.out.println("total de años:"+"0");
        
        }else{
            año=horaUsuario/8760;
            System.out.println("Numero de años: "+año);
        
        }
        
        if(horaUsuario<720){
            System.out.println("total de meses:"+"0");
        
        }else{
            mes=horaUsuario/720;
            System.out.println("Numero de meses: "+mes);
        
        } if(horaUsuario<168){
            System.out.println("total de semanas:"+"0");
        
        }else{
            semana=horaUsuario/168;
            System.out.println("Numero de semana: "+semana);
        
        } if(horaUsuario<24){
            System.out.println("total de dias:"+"0");
        
        }else{
            dia=horaUsuario/24;
            System.out.println("Numero de dias: "+dia);
        
        }
        System.out.println("Numero totales de horas: "+horaUsuario);
                
        
        
    
    }
    
}
