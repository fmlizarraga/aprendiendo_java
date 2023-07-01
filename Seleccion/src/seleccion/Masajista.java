package seleccion;

/**
 *
 * @file Masajista
 * @author Franco Matias Lizarraga
 */
public class Masajista extends Integrante{
    private String Titulo;
    private int antiguedad;

    public Masajista(int id, String nom, String ape, int edad, String Titulo, int antiguedad) {
        super(id, nom, ape, edad);
        this.Titulo = Titulo;
        this.antiguedad = antiguedad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void darMasaje() {
        System.out.println("=== Masaje ===");
        System.out.println(getNom() + " " + getApe() + ", " + getTitulo() + ", da un masaje.");
    }

    @Override
    public String toString() {
        return super.toString() + " => Masajista{" + "Titulo=" + Titulo + ", antiguedad=" + antiguedad + '}';
    }
    
}
