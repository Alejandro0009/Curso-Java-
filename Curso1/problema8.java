
package Curso1;

import java.util.Scanner;

/*construir un programa que calcule y muestre por pantalla las raices
de la ecuacion de segundo grado de coeficientes reales.

ax^2+bx+c=0

x=-b+- (raiz de  b^2-4ac)/2a
*/


public class problema8 {
    
    
    public static void main(String[] args){
        Scanner entrada= new Scanner( System.in);
        
        double a,b,c;
        double op1,op2,op3,op4,op5,op6,op7, opA,opB, ope1, ope2,ope3; 
        
        System.out.println("ingrese el valor de a: ");
        a= entrada.nextDouble();
        System.out.println("ingrese el valor de b: ");
        b= entrada.nextDouble();
        System.out.println("ingrese el valor de c: ");
        c= entrada.nextDouble();
        
        // a=2  b=8  c=2
        
        //(raiz de  b^2-4ac)
        
        op1=Math.pow(b,2);
        //System.out.println(op1);
        op2=-4*(a*c);
        //System.out.println(op2);
        op3=op1+op2;
        System.out.println(op3);
        
       /* if(op3==0){
            ope1=(-b+0);
            ope2=2*a;
            ope3=ope1/ope2;
            
            System.out.println("El resultado de la x1= ");
        System.out.println(ope3);
        
        System.out.println("El resultado de la x2= ");
        System.out.println(op3);
            
            
        
        }else{*/
        
       
        op4=Math.sqrt(op3);
        //System.out.println(op4);
        
        //-b+- (raiz de  b^2-4ac)
        
        op5=(-b+op4);
       // System.out.println(op5);
       
       opA=(-b-op4);
        
        
        op6=2*a;
        //System.out.println(op6);
        
        opB=opA/op6;
        
        op7=op5/op6;
        System.out.println("El resultado de la x1= ");
        System.out.println(op7);
        
        System.out.println("Elresultado de la x2=");
        System.out.println(opB);
        
        
        
        
        
            
            
        
       
        
        
       
        
        
    
    
    }
    
}
