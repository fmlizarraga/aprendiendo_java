package seleccion;

/**
 *
 * @file Entrenador
 * @author Franco Matias Lizarraga
 */
public class Entrenador extends Integrante {
    private String idFederacion;

    public Entrenador(int id, String nom, String ape, int edad, String idFederacion) {
        super(id, nom, ape, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirEntrenamiento() {
        System.out.println("=== Etrenamiento ===");
        System.out.println(getNom() + " " + getApe() + " prueba diferentes tacticas en el entrenamiento.");
    }
    
    public void dirigirPartido() {
        System.out.println("=== Partido ===");
        System.out.println(getNom() + " " + getApe() + " da indicaciones y realiza cambios.");
    }

    @Override
    public String toString() {
        return super.toString() + " => Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
}
