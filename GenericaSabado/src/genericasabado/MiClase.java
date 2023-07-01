package genericasabado;

/**
 *
 * @file MiClase
 * @author Franco Matias Lizarraga
 */
public class MiClase <T>{
    T objeto;

    public MiClase(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
    
    public void mostrarObjeto() {
        System.out.println("Objeto: " + getObjeto());
    }
}
