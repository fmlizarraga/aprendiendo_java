package calculofraccion;

import java.util.Scanner;

/**
 *
 * @file CalculoFraccion
 * @author Franco Matias Lizarraga
 */
public class CalculoFraccion {
    
    Racional a, b;

    Scanner entrada = new Scanner(System.in);

    public CalculoFraccion() {
        // si no se ingresa ningun dato, estos objetos estan
        // inicializaos con el valor 1/1
        // para que la multiplicacion y division no dispare un error
        this.a = new Racional();
        this.b = new Racional();
    }
    
    public static void main(String[] args) {
        CalculoFraccion c = new CalculoFraccion();
        c.menu();
    }
    
    public void menu() {
        int opcion = 9;
        do{
            mostrarOpciones();
            System.out.println("ingrese su opcion:");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarDatos();
                    break;
                case 2:
                    multiplicar();
                    break;
                case 3:
                    dividir();
                    break;
                case 0: break;
                default:
                    System.out.println("Opcion incorrecta o desconocida");
            }
        } while (opcion != 0);
    }
    
    public void mostrarOpciones(){
        System.out.println("\n=== CALCULO RACIONAL ===");
        System.out.println("1- Ingresar racionales\n2- Operar multiplicacion\n3- Operar division\n0- Salir");
    };
    
    public void ingresarDatos() {
        a.ingresarFraccion();
        b.ingresarFraccion();
        System.out.println("Datos ingresados!");
    }
    
    public void multiplicar() {
        Racional producto = a.multiplicacion(b);
        producto.mostrar();
    }
    
    public void dividir() {
        Racional division = a.division(b);
        division.mostrar();
    }

}
