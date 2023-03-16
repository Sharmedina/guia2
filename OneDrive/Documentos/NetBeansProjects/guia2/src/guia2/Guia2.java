/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sharl
 */
public class Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los numeros es: "+suma);
       
    }
    
}
