package figurasgeometricas;

public class Triangulo extends FiguraGeometrica {
    
    private float valor2;

    public Triangulo(float valor) {
        super(valor);
        this.valor2 = valor;
    }

    public Triangulo(float valor2, float valor) {
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
        return this.getValor() * this.getValor2() / 2;
    }

    @Override
    public float getPerimetro() {
        super.getPerimetro();
        // considero que el tringulo es rectangulo
        // valor y valor2 serian los catetos
        float hipotenusa = (float) Math.sqrt(Math.pow(this.getValor(), 2) + Math.pow(this.getValor2(), 2));
        return this.getValor() + this.getValor2() + hipotenusa;
    }
}
