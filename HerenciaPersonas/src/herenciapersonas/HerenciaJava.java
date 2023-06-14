package herenciapersonas;

import java.util.Date;

/**
 *
 * @file HerenciaJava
 * @author Franco Matias Lizarraga
 */
public class HerenciaJava {

    public static void main(String[] args) {
        // crear una instancia de Empleado
        // asignar valores a sus variables miembro
        // es posible asignar valores a las variables heredadas de Persona?
        // mostrar el resultado de las asignaciones

        // repetir la tarea creando una instancia de Cliente
        
        Persona e1 = new Empleado("Juan Perez", 90000);
        System.out.println(e1.toString());
        e1.setEdad(30);
        e1.setGenero('M');
        e1.setDireccion("Arerica 1234");
        System.out.println(e1.toString());
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        Persona c1 = new Cliente(new Date(), true);
        System.out.println(c1.toString());
        c1.setEdad(25);
        c1.setNombre("Ana Juarez");
        c1.setGenero('F');
        c1.setDireccion("Sarmiento 785");
        System.out.println(c1.toString());
        
        // Si es posible asignar valores las variables heredadas
        // el objeto de la clase hija contiene todas las variables miembro
        // y responde a todos los metodos de la clase padre
        // esto solo es posible por que en la clase padre definimos las
        // variables y metodos como public o protected, no private
        // las variables private solo son accesibles para esa clase y nada mas
        // ni siquiera las clases que hereden de esta podrian acceder
    }
}
