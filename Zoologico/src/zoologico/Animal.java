package zoologico;

public abstract class Animal {

    private String nombre;
    private String nombreCientífico;
    private boolean enPeligro;
    private int edad;
    private String habitat;
    
    // el constructor por default es provisto por Java

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientífico() {
        return nombreCientífico;
    }

    public void setNombreCientífico(String nombreCientífico) {
        this.nombreCientífico = nombreCientífico;
    }

    public boolean isEnPeligro() {
        return enPeligro;
    }

    public void setEnPeligro(boolean enPeligro) {
        this.enPeligro = enPeligro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", nombreCient\u00edfico=" + nombreCientífico + ", enPeligro=" + enPeligro + ", edad=" + edad + ", habitat=" + habitat + '}';
    }
    
}
