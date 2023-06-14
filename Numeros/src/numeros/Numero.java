package numeros;

/**
 *
 * @file Numero
 * @author Franco Matias Lizarraga
 */
public class Numero {
    private int valor;

    public Numero() {
        this.valor = 0;
    }
    
    public Numero(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void mostrar(){
        System.out.println(this.getValor());
    }
    
    public int sumar(int valor){
        return this.getValor() + valor;
    }
    
    public int sumar(Numero numero){
        return this.getValor() + numero.getValor();
    }
}
