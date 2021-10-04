/*
Arreglos o vectores o Arrays, que son sinonimos.

es una estructura de datos que permite almacenar un conjunto de datos del mismo tipos.
su tamaño se declara y no puede estar cambiando despues.

puedes almacenar muchos datos.

arreglos unidimencional:

sintaxis

Tipo_de_variable[] Nombre_del_array = new tipo_de_variable [dimension]

ejemplos:
int[] edad= new int[4];

en arreglos las pocisiones siempre comienzan desde 0
 */
package Arreglos;


public class Arreglos {

    
    public static void main(String[]args){
        
          int [] numeros =new int[3];
          
          numeros[0]=2;
           numeros[1]=7;
            numeros[2]=4;
            
            for(int i=0;i<3;i++){
                
                System.out.println(numeros[i]);
            
            }
    
    }
    
}
