
package Curso1;

import java.util.Scanner;

/*
gillermo tiene N dolares. Luis tiene la mitad de lo que posee gillermo.
Juan tiene la mitad de lo que poseen luis y gillermo juntos.
hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3

*/
public class problema3 {
    
    public static void main(String[]args){
        
        Scanner entrada= new Scanner(System.in);
        double dollarG;
        double dollarL;
        double dollarJ;
        double dollarJ1;
        double suma;
        
        System.out.println("Digite cuantos dollares quiere que tenga Gillermo: ");
        dollarG=entrada.nextDouble();
        dollarL=dollarG/2;
        dollarJ=dollarG+dollarL;
        
        dollarJ1=dollarJ/2;
        
        System.out.println("la cantidad de dinero que posee Gillermo es de: "+ dollarG);
        System.out.println("la cantidad de dinero que posee Luis es de: "+dollarL);
        System.out.println("la cantidad de dinero que posee Juan es de: "+dollarJ1);
        
        suma=dollarG+dollarL+dollarJ1;
        System.out.println("la suma de dineor que tienen es:  "+suma);
        
        
        
        
        
    
    
    }
    
}
