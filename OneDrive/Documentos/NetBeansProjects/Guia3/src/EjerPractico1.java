
import java.util.Scanner;

/*
 * Crear un programa que dado un número determine si es par o impar.

 */

/**
 *
 * @author Sharl
 */
public class EjerPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1; 
        System.out.println("Ingrese un numero para determinar si es par o impar");
        num1=leer.nextInt();
        if (num1%2==0){
            System.out.println("El numero es par");
            }
        else 
            System.out.println("El numero es impar"); 
        
        
    }
    
}
