package gestorcontactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @file GestorContactos
 * @author Franco Matias Lizarraga
 */
public class GestorContactos {
// se define la lista de los contactos
    private List<Contacto> libretaContactos;
    static Scanner entrada = new Scanner(System.in);

// definir un constructor usando ArrayList para inicializar la libreta de contactos
    public GestorContactos() {
        this.libretaContactos = new ArrayList<>();
    }

    public List<Contacto> getLibretaContactos() {
        return libretaContactos;
    }
    
    public void agregarContacto(Contacto contacto) {
        this.getLibretaContactos().add(contacto);
    }

    public void eliminarContacto(String nombre) {
        Contacto contactoEliminado = null;

        for (Contacto contacto : this.getLibretaContactos()) {
            if(contacto.getNombre().equalsIgnoreCase(nombre)) {
                contactoEliminado = contacto;
                break;
            }
        }
        if(contactoEliminado != null) {
            this.getLibretaContactos().remove(contactoEliminado);
            System.out.println("\nContacto eliminado!");
        } else {
            System.out.println("\nContacto inexistente");
        }
    }

    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        // se busca el contacto y se muestra
        for (Contacto contacto : this.getLibretaContactos()) {
            if(contacto.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println("\nContacto encontrado!");
                System.out.println("Nombre: " + contacto.getNombre());
                System.out.println("Telefono: " + contacto.getTelefono());
            }
        }
        // si no se encuentra, se informa la situación
        if(!encontrado) System.out.println("\nContacto no encontrado!");
    }

    public static void main(String[] args) {
        GestorContactos gestor = new GestorContactos();

        while (true) {
            System.out.println("\n----- Menú Principal -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    gestor.agregarContacto(ingresarContacto());
                    break;
                case 2:
                    System.out.print("Ingrese el nombre: ");
                    gestor.eliminarContacto(entrada.nextLine());
                    break;
                case 3:
                    System.out.print("Ingrese el nombre: ");
                    gestor.buscarContacto(entrada.nextLine());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");

            }

        }
    }
    
    public static Contacto ingresarContacto() {
        String nombre;
        String telefono;
        System.out.println("\n### Creando contacto ###");
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Telefono: ");
        telefono = "+54" + entrada.next();
        entrada.nextLine();
        return new Contacto(nombre, telefono);
    }
}
