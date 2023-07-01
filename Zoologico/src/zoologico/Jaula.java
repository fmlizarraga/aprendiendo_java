package zoologico;

import java.util.ArrayList;
import java.util.List;

class Jaula<T> {

    // indique variable miembro
    private List<T> animales;

    public Jaula() {
        // inicialice variable miembro
        animales = new ArrayList<T>();
    }

    public List<T> getAnimales() {
        return animales;
    }

    public void setAnimales(List<T> animales) {
        this.animales = animales;
    }
    
    public void asignarAnimal(T animal) {
        // agregue el animal al almacenamiento
        getAnimales().add(animal);
    }

    public void eliminarAnimal(T animal) {
        // elimine un animal del almacenamiento
        boolean seBorro = getAnimales().remove(animal);
        if(!seBorro) System.out.println("No se encontró ese animal");
    }

    public void mostrarAnimales() {
        // recorra el almacenamiento mostrando cada animal
        System.out.println("=== Jaula ===");
        for (T animal : animales) {
            System.out.println(animal.toString());
            System.out.println("------------------------");
        }
    }

    @Override
    public String toString() {
        String res = "Jaula: {animales=";
        for (T animal : getAnimales()) {
            res = res + animal.toString() + "\n------------------------\n";
        }
        return res + '}';
    }
    
}
