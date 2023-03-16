/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sharl
 */
public class Ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = leer.next();
        System.out.println("EL nombre ingreado es: "+ nombre); 
        
    }
    
}
