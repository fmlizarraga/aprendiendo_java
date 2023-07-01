package zoologico;

public class Jaguar extends Mamifero {

    //private String nombre;

    public Jaguar(String nombre,String tipoPelaje, boolean enCelo) {
        super(tipoPelaje,enCelo);
        //this.nombre = nombre;
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Jaguar: " + getNombre();
    }
}


