package seleccion;

import java.util.ArrayList;

/**
 *
 * @file Seleccion
 * @author Franco Matias Lizarraga
 */
public class Seleccion {
    ArrayList<Integrante> equipo;

    public static void main(String[] args) {
        Seleccion s = new Seleccion();
        s.mostrar();
    }

    public Seleccion() {
        this.equipo = new ArrayList<>();
    }
    
    public ArrayList<Integrante> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Integrante> equipo) {
        this.equipo = equipo;
    }
    
    public void mostrar() {
        Jugador j = new Jugador(2, "Luis", "Perez", 25, 10, "mediocampista");
        getEquipo().add(j);
        Masajista m = new Masajista(3, "Pedro", "Juarez", 45, "Kinesiologo", 10);
        getEquipo().add(m);
        Entrenador e = new Entrenador(4, "Lionel", "Scaloni", 45, "Int");
        getEquipo().add(e);
        Integrante i1 = new Jugador(5, "Juan", "Lopez", 24, 9, "volante");
        getEquipo().add(i1);
        // TODO falta terminar
        for (Integrante integrante : getEquipo()) {
            System.out.println(integrante.toString());
        }
    }
}
