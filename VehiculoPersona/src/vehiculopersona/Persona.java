package vehiculopersona;

import java.util.Scanner;

/**
 *
 * @file Persona
 * @author Franco Matias Lizarraga
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Vehiculo auto;

    public Persona() {
        this.dni = 0;
        this.nombre = "";
        this.apellido = "";
        this.auto = new Vehiculo();
    }

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

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }
    
    public void leerDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el DNI:");
        setDni(entrada.nextInt());
        
        System.out.println("Ingrese el nombre:");
        setNombre(entrada.next());
        
        System.out.println("Ingrese el apellido:");
        setApellido(entrada.next());
        
        System.out.println("Ahora ingrese los datos del auto:");
        getAuto().leerDatos();
    }
    public void mostrarDatos() {
        System.out.println("=== DATOS DE LA PERSONA ===");
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        getAuto().mostrarDatos();
    }
    public void mostrarImpuestoVehiculo() {
        System.out.println("Impuesto anual sobre el vehiculo: $" + getAuto().calcularImpuesto());
    }
}
