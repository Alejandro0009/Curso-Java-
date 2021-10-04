
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Arreglos1 {
    
    public static void main(String []args){
        Scanner entrada= new Scanner (System.in);
        int nElementos;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo:"));
        
        JOptionPane.showMessageDialog(null, "digite los elementos de la matriz");
        
        char[] letras= new char [nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.println("Digite los elementos del arreglo: ");
            letras[i]=entrada.next().charAt(0);

        }
        System.out.println("Los caracteres del arreglo son:");
        for(int i=0;i<nElementos;i++){
            System.out.println(letras[i]+"");
        
        }
        
    
    }
    
}
