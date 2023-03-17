
import java.util.Scanner;

/*
 Implementar un programa que le pida dos números enteros al usuario 
y determine si ambos o alguno de ellos es mayor a 25.

 */

/**
 *
 * @author Sharl
 */
public class Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Verificar si ambos o alguno de ellos es mayor a 25
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Al menos uno de los números es mayor a 25.");
        } else {
            System.out.println("Ninguno de los números es mayor a 25."); 
         
        }
    }
}
