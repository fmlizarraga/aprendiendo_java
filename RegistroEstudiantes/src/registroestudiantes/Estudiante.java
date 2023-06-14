package registroestudiantes;

/**
 *
 * @file Estudiante
 * @author Franco Matias Lizarraga
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private float[] calificaciones;

    public Estudiante(String nombre, int edad, float[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public float calcularPromedio() {
        float suma = 0;
        for (float nota : getCalificaciones()) {
            suma += nota;
        }
        return (float)suma/getCalificaciones().length;
    }

    public boolean estaAprobado() {
        return this.calcularPromedio() >= 6;
    }
}
