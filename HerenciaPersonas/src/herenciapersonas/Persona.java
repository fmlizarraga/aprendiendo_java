package herenciapersonas;

/**
 *
 * @file Persona
 * @author Franco Matias Lizarraga
 */
public class Persona {
    
    // variables miembro protected
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructor sin parametros
    public Persona() {
        this.nombre = "<Nombre>";
        this.genero = 'X';
        this.edad = 18;
        this.direccion = "<Calle 123>";
    }

    //Constructor con 1 argumento
    public Persona(String nombre) {
        // inicializar variable nombre
        this();
        this.nombre = nombre;
    }

    //Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion) {
        // asignar valores a todas las variables
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + getNombre() + ", genero=" + getGenero() + ", edad=" + getEdad() + ", direccion=" + getDireccion() + '}';
    }

}