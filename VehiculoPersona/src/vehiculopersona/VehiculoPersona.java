package vehiculopersona;

/**
 *
 * @file VehiculoPersona
 * @author Franco Matias Lizarraga
 */
public class VehiculoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo un nuevo registro de una persona, que posee un vehiculo
        Persona persona1 = new Persona();
        // Ingreso los datos de esa persona
        persona1.leerDatos();
        // Muestro los datos de esa persona
        persona1.mostrarDatos();
        // Muestro el impuesto del auto
        persona1.mostrarImpuestoVehiculo();
    }
    
}
