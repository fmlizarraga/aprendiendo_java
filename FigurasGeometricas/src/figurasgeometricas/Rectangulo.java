package figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {
    
    private float valor2;

    public Rectangulo(float valor2, float valor) {
        super(valor);
        this.valor2 = valor2;
    }

    public float getValor2() {
        return this.valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
    @Override
    public float getArea() {
        super.getArea();
        return this.valor * this.valor2;
    }

    @Override
    public float getPerimetro() {
        super.getPerimetro();
        return 2 * this.valor + 2 * this.valor2;
    }
}
