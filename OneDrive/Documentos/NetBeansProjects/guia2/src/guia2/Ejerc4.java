/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sharl
 */
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        /* Otra manera es*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el valor de grados centigrados");
        double gradosC = leer.nextDouble();
        double gradosF = 32 + (9*gradosC/5);
        System.out.println("El equivalente en grados Fahrenheit es: " + gradosF );
        
    }
    
}
