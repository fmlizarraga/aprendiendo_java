package registroestudiantes;

import java.util.Scanner;

/**
 *
 * @file RegistroEstudiantes
 * @author Franco Matias Lizarraga
 */
public class RegistroEstudiantes {
    
    Estudiante[] estudiantes;
    boolean ingresado = false;
    Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        RegistroEstudiantes reg1 = new RegistroEstudiantes();
        int opcion = 0;
        do{
            System.out.println("=== REGISTRO DE ESTUDIANTES ===");
            System.out.println("1. Cargar estudiantes\n2. Mostrar estudiantes\n3. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            reg1.menu(opcion);
        } while( opcion != 3 );
    }

    public RegistroEstudiantes() {
        System.out.println("Ingrese el numero de estudiantes");
        int num = entrada.nextInt();
        this.estudiantes = new Estudiante[num];
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public boolean haIngresado() {
        return ingresado;
    }

    public void setIngresado(boolean ingresado) {
        this.ingresado = ingresado;
    }
    
    public Estudiante cargarEstudiante() {
        String nombre;
        int edad;
        int numNotas = 0;
        float[] notas;
        
        System.out.println("\n=== Ingresando datos del estudiante ===");
        System.out.print("Nombre: ");
        nombre = entrada.next();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        System.out.print("Numero de calificaciones : ");
        numNotas = entrada.nextInt();
        notas = new float[numNotas];
        System.out.println("Ingrese las calificaciones de " + nombre + ":");
        for(int i = 0; i<numNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextFloat();
        }
        return new Estudiante(nombre, edad, notas);
    }
    
    public void mostrarEstudiantes() {
        System.out.println("=== LISTADO DE ESTUDIANTES ===");
        for (Estudiante estudiante : getEstudiantes()) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.print("Calificaciones: ");
            for (int i = 0; i < estudiante.getCalificaciones().length; i++) {
                System.out.print(estudiante.getCalificaciones()[i] + ", ");
            }
            System.out.println("\nPromedio: " + estudiante.calcularPromedio());
            if(estudiante.estaAprobado()) System.out.println("Esta aprobado");
            else System.out.println("Esta desaprobado");
            System.out.println("---------------------");
        }
    }
    
    public void menu(int opcion) {
        switch (opcion) {
            case 1:
                for (int i = 0; i < getEstudiantes().length; i++) {
                    getEstudiantes()[i] = cargarEstudiante();
                }
                this.setIngresado(true);
                break;
            case 2:
                if(this.haIngresado()) this.mostrarEstudiantes();
                else System.out.println("Primero debe ingresar los datos!");
            break;
            case 3: break;
            default:
                System.out.println("Opcion desconocida, no se hace nada.");
        }
    }

}
