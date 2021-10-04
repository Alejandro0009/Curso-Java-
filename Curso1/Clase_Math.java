
package Curso1;


public class Clase_Math {
    
    public static void main( String []args){
        /*vamos a utilizar la clase Math, es la clase matematicas y trigonometricas: 
        puedes hacer 
        - la raiz cuadrada 
        - elevar un numero 
        -sacar un numero random 
        -etc. 
        */
        
        // sacar la raiz 
        double raiz= Math.sqrt(9.0);
        
        System.out.println("la raiz cuadrada es: "+raiz);
        
        //para poder sacar un numero entero: 
        int resultado= (int) Math.sqrt(16.0);
        System.out.println("el resultado es: "+resultado);
        
        // elevar un numero a un exponente. 
        double base= 5, exponente = 2; 
        double resultado1= Math.pow( base, exponente);
        System.out.println("el resultado1 es:"+ resultado1) ;
        
        // redondiar un numero.
        double  numero1= 4.15;
        long resultado3=Math.round(numero1);
        System.out.println("el resultado3 es: "+resultado3 );
        
        // numero random
        double numero3 = Math.random(); 
        System.out.println("el numero random es : "+numero3 );
        
        
        
        
    
    }
    
    
    
}
