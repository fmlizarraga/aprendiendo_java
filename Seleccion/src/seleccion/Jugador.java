package seleccion;

/**
 *
 * @file Jugador
 * @author Franco Matias Lizarraga
 */
public class Jugador extends Integrante {
    private int pos;
    private String demarcacion;

    public Jugador(int id, String nom, String ape, int edad, int pos, String demarcacion) {
        super(id, nom, ape, edad);
        this.pos = pos;
        this.demarcacion = demarcacion;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void entrenar() {
        System.out.println("=== Etrenamiento ===");
        System.out.println(getNom() + " " + getApe() + " entrena en el campo.");
    }
    
    public void jugarPartido(){
        System.out.println("=== Partido ===");
        System.out.println(getNom() + " " + getApe() + " ingresa a jugar como " + getDemarcacion());
    }

    @Override
    public String toString() {
        return super.toString() + " => Jugador{" + "pos=" + pos + ", demarcacion=" + demarcacion + '}';
    }
    
}
