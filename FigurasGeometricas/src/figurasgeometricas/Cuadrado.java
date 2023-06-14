package figurasgeometricas;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(float valor) {
        super(valor);
    }
    
    @Override
    public float getArea() {
        super.getArea();
        return this.getValor() * this.getValor();
    }

    @Override
    public float getPerimetro() {
        super.getPerimetro();
        return (float) 4 * this.getValor();
    }
}
