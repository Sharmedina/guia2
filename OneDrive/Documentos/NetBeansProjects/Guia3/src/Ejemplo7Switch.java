
import java.util.Scanner;

/*
 Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
 */

/**
 *
 * @author Sharl
 */
public class Ejemplo7Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	Scanner leer = new Scanner(System.in);

    	int opcion;

    	System.out.println("Ingrese una opción");

    	opcion = leer.nextInt();

    	switch (opcion) {
        	case 1:
           System.out.println("La bomba es una bomba de Agua");
           break;

        	case 2:
           System.out.println("La bomba es de Gasolina");
            break;
                case 3:
           System.out.println("La bomba es de Hormigón");
            break;
            case 4:
           System.out.println("La bomba es de Pasta");
            break;
        	default:
           System.out.println("No existe un valor valido de bomba");
        }
        }
}