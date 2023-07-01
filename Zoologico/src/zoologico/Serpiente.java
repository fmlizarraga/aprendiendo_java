package zoologico;

public class Serpiente extends Reptil {

    //private String nombre;

    public Serpiente(String nombre, boolean escamas, boolean carnivoro) {
        super(escamas, carnivoro);
        //this.nombre = nombre;
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Serpiente: " + getNombre();
    }
}
