/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sharl
 */
public class Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese una frase");
        Scanner leer= new Scanner (System.in);
        String frase= leer.nextLine();
        System.out.println("La frase en Mayuscula es: "+frase.toUpperCase());
        System.out.println("La frase en minuscula es: "+frase.toLowerCase());  
    }
    
}
