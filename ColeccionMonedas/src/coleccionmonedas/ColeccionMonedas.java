package coleccionmonedas;

import java.util.Scanner;

/**
 *
 * @file ColeccionMonedas
 * @author Franco Matias Lizarraga
 */
public class ColeccionMonedas {
    
    Coleccion miColeccion;
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        ColeccionMonedas misMonedas = new ColeccionMonedas();
        misMonedas.menu();
    }

    public ColeccionMonedas() {
        this.miColeccion = new Coleccion();
    }

    public Coleccion getMiColeccion() {
        return miColeccion;
    }
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n=== COLECCION DE MONEDAS ===");
            System.out.println("""
                           1. Mostrar coleccion
                           2. Agregar moneda
                           3. Contar por pais
                           4. Contar por año de acuñacion
                           5. salir
                           """);
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    this.miColeccion.mostrarColeccion();
                    break;
                case 2:
                    this.miColeccion.agregarMoneda();
                    break;
                case 3:
                    this.contarPais();
                    break;
                case 4:
                    this.contarAnio();
                    break;
                case 5: break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while(opcion != 5);
        
    }
    
    public void contarPais() {
        String pais;
        int num;
        System.out.println("=== Cuenta por pais ===");
        System.out.print("Ingrese el pais: ");
        pais = entrada.next();
        num = this.getMiColeccion().contarPorPais(pais);
        System.out.println("\nTiene " + num + " monedas de " + pais);
    }
    
    public void contarAnio() {
        int anio;
        int num;
        System.out.println("=== Cuenta por año de acuñacion ===");
        System.out.print("Ingrese el año: ");
        anio = entrada.nextInt();
        num = this.getMiColeccion().contarPorAnio(anio);
        System.out.println("\nTiene " + num + " monedas acuñadas en " + anio);
    }
    
}
