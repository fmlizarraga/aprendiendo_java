package par;

/**
 *
 * @file Par
 * @author Franco Matias Lizarraga
 */
public class Par<T, U> {

    T primerElemento;
    U segundoElemento;

    public Par(T primerElemento, U segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    public T getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(T primerElemento) {
        this.primerElemento = primerElemento;
    }

    public U getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(U segundoElemento) {
        this.segundoElemento = segundoElemento;
    }

    @Override
    public String toString() {
        return "Par{" + "primerElemento=" + primerElemento + ", segundoElemento=" + segundoElemento + '}';
    }
    
}