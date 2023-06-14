
import java.util.Scanner;

/**
 * Mi clase en Java
 *
 * @author Franco Matias Lizarraga
 */
public class HolaMundo {

    public static void main(String args[]) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var numero = Double.parseDouble(consola.nextLine());
        if (numero >= 0 && numero < 6 ) {
            System.out.println("F");
        }
        else if (numero >= 6 && numero < 7 ) {
            System.out.println("D");
        }
        else if (numero >= 7 && numero < 8 ) {
            System.out.println("C");
        }
        else if (numero >= 8 && numero < 9 ) {
            System.out.println("B");
        }
        else if (numero >= 9 && numero <= 10 ) {
            System.out.println("A");
        }
        else {
            System.out.println("Valor desconocido");
        }
    }
}
