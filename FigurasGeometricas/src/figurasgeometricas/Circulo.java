package figurasgeometricas;

public class Circulo extends FiguraGeometrica {
    

    public Circulo(float valor) {
        super(valor);
    }

    @Override
    public float getArea() {
        super.getArea();
        return (float) Math.PI * this.getValor() * this.getValor();
    }

    @Override
    public float getPerimetro() {
        super.getPerimetro();
        return 2 * (float) Math.PI * this.getValor();
    }
}
