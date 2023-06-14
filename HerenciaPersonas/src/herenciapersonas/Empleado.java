package herenciapersonas;

/**
 *
 * @file Empleado
 * @author Franco Matias Lizarraga
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        // convocar al constructor con un parametro del Padre
        // inicializar variables
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++contadorEmpleado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Empleado{" + "idEmpleado=" + getIdEmpleado() + ", sueldo=" + getSueldo() + '}';
    }

}