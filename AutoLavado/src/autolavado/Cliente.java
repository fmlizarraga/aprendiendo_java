package autolavado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @file Cliente
 * @author Franco Matias Lizarraga
 */
public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private List<Vehiculo> vehiculos;
    private List<Comprobante> tickets;
    private Vehiculo vehiculoActual;
    Scanner entrada = new Scanner(System.in);

    public Cliente() {
        this.dni = 1;
        this.nombre = "";
        this.apellido = "";
        this.vehiculos = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.vehiculoActual = null;
    }
    
//    public Cliente(int dni, String nombre, String apellido, Vehiculo vehiculo) {
//        this();
//        this.dni = dni;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.vehiculos.add(vehiculo);
//    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Comprobante> getTickets() {
        return tickets;
    }

    public void setTickets(List<Comprobante> tickets) {
        this.tickets = tickets;
    }

    public Vehiculo getVehiculoActual() {
        return vehiculoActual;
    }

    public void setVehiculoActual(Vehiculo vehiculoActual) {
        this.vehiculoActual = vehiculoActual;
    }
    
    

    public void ingresarDatos() {
        Vehiculo miAuto = new Vehiculo();
        System.out.println("=== DATOS DEL CLIENTE ===");
        System.out.print("DNI: ");
        this.setDni(entrada.nextInt());
        System.out.print("Nombre: ");
        this.setNombre(entrada.next());
        System.out.print("Apellido: ");
        this.setApellido(entrada.next());
        // vehiculo
        miAuto.ingresarDatos();
        this.getVehiculos().add(miAuto);
        this.setVehiculoActual(this.getVehiculos().get(0));
    }
    
    public void mostrar() {
        System.out.println("=== Cliente ===");
        System.out.println(
                "DNI: " + this.getDni() +
                "\nApellido y Nombre: " + this.getApellido() + ", " + this.getNombre() +
                "\nVehiculos registrados: " + this.getVehiculos().size()
        );
        if(this.getVehiculoActual() != null) this.getVehiculoActual().mostrar();
    }
    
    public void agregarVehiculo() {
        Vehiculo nuevoV = new Vehiculo();
        nuevoV.ingresarDatos();
        this.getVehiculos().add(nuevoV);
        this.setVehiculoActual(nuevoV);
    }
    
}
