package seleccion;

/**
 *
 * @file Integrante
 * @author Franco Matias Lizarraga
 */
public class Integrante {
    protected int id;
    protected String nom;
    protected String ape;
    protected int edad;

    public Integrante(int id, String nom, String ape, int edad) {
        this.id = id;
        this.nom = nom;
        this.ape = ape;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void viajar() {
        System.out.println("=== Viaje ===");
        System.out.println("Integrante del equipo: " + getNom() + " " + getApe());
    }
    
    public void concentrarse() {
        System.out.println("=== Concentracion ===");
        System.out.println("Integrante: " + getNom() + " " + getApe() + " " + getEdad());
    }

    @Override
    public String toString() {
        return "Integrante{" + "id=" + id + ", nom=" + nom + ", ape=" + ape + ", edad=" + edad + '}';
    }
    
}
