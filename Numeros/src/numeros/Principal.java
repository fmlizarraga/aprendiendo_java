package numeros;

import java.util.Scanner;

/**
 *
 * @file Principal
 * @author Franco Matias Lizarraga
 */
public class Principal {
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Principal p = new Principal();
        System.out.println("CASO 1");
        p.sumaCaso1();
        
        System.out.println("\nCASO 2");
        p.sumaCaso2();
    }

    public Principal() {
    }
    
    public void sumaCaso1() {
        Numero num1;
        Numero num2;
        System.out.println("Ingrese el valor del primer número");
        num1 = new Numero(entrada.nextInt());
        System.out.println("Ingrese el valor del segundo número");
        num2 = new Numero(entrada.nextInt());
        System.out.println("El resultado de la suma de los números es = " +
                            num1.sumar(num2.getValor())
        );
    }
    
    public void sumaCaso2() {
        Numero num1;
        Numero num2;
        System.out.println("Ingrese el valor del primer número");
        num1 = new Numero(entrada.nextInt());
        System.out.println("Ingrese el valor del segundo número");
        num2 = new Numero(entrada.nextInt());
        System.out.print("El resultado de la suma de los números es = ");
        num1.setValor(num1.sumar(num2));
        num1.mostrar();
    }
}
