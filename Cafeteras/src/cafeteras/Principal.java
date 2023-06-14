package cafeteras;

import java.util.Scanner;

/**
 *
 * @file Principal
 * @author Franco Matias Lizarraga
 */
public class Principal {

    public static void main(String[] args) {
        Principal p = new Principal();
        p.menu();
    }
    
    Cafetera miCafetera;
    int cuentaTazas;
    int miTaza = 140;
    Scanner entrada = new Scanner(System.in);

    public Principal() {
        miCafetera = new Cafetera();
        cuentaTazas = 0;
    }

    public Cafetera getMiCafetera() {
        return miCafetera;
    }

    public void setMiCafetera(Cafetera miCafetera) {
        this.miCafetera = miCafetera;
    }

    public int getCuentaTazas() {
        return cuentaTazas;
    }

    public void setCuentaTazas(int cuentaTazas) {
        this.cuentaTazas = cuentaTazas;
    }

    public int getMiTaza() {
        return miTaza;
    }

    public void setMiTaza(int miTaza) {
        this.miTaza = miTaza;
    }
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               
                               === CAFETERIA ===
                               
                               Opciones:
                               1. Mostrar la cafetera actual
                               2. Servir taza de cafe
                               3. Servir todas las tazas de cafe posibles
                               4. Cargar cafetera
                               5. Nueva cafetera
                               6. Salir
                               """);
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    this.mostrarEstado();
                    break;
                case 2:
                    this.servirCafe();
                    break;
                case 3:
                    this.servirTodo();
                    break;
                case 4:
                    this.cargarCafetera();
                    break;
                case 5:
                    this.crearCafetera();
                    break;
                case 6: break;
                default:
                    System.out.println("ERROR: Opcion desconocida");
            }
        } while(opcion != 6);
    }
    
    public void crearCafetera() {
        int opcion;
        System.out.println("\n--- Nueva caferta ---");
        System.out.println("""
                           Elija una ocion
                           1. Cafetera predeterminada (1000cc)
                           2. Cafetera vacia
                           3. Cafetera llena
                           4. Cancelar
                           """);
        System.out.print("Opcion: ");
        opcion = entrada.nextInt();
        entrada.nextLine();
        switch (opcion) {
            case 1:
                this.setMiCafetera(new Cafetera());
                break;
            case 2:
                System.out.print("Capacidad: ");
                this.setMiCafetera(new Cafetera(entrada.nextInt()));
                entrada.nextLine();
                break;
            case 3:
                System.out.print("Capacidad: ");
                int cap = entrada.nextInt();
                System.out.print("Cantidad: ");
                this.setMiCafetera(new Cafetera(cap, entrada.nextInt()));
                break;
            case 4: break;
            default:
                System.out.println("Opcion desconocida, operacion cancelada.");
        }
    }
    
    public void cargarCafetera() {
        String res;
        System.out.println("--- Cargar cafe en la cafetera ---");
        System.out.print("¿Llena? SI/no: ");
        res = entrada.nextLine().trim().toLowerCase();
        if(res.contains("s") || res.equals("") ) this.getMiCafetera().llenarCafetera();
        else {
            System.out.print("Ingrese la cantidad: ");
            this.getMiCafetera().agregarCafe(entrada.nextInt());
            entrada.nextLine();
        }
    }
    
    public void servirCafe() {
        int miCafe;
        System.out.println("--- Servir café ---");
        miCafe = this.getMiCafetera().servirTaza(miTaza);
        if(miCafe == miTaza) {
            System.out.println("Se ha servido un taza de " + miCafe + "cc de cafe");
            this.contarTazas();
        }
    }
    
    public void servirTodo() {}
    
    public void contarTazas() {
        this.setCuentaTazas(this.getCuentaTazas() + 1);
    }
    
    public void reiniciarCuenta() {}
    
    public void mostrarEstado() {
        System.out.println("\n--- Mi cafetera ---");
        System.out.println(this.getMiCafetera().toString());
        System.out.println(
                "Se sirvieron " + 
                this.getCuentaTazas() + 
                " tazas de café desde que se cargó la cafetera"
        );
    }

}
