package figurasgeometricas;

public class FiguraGeometrica {
    
    protected float valor;

    public FiguraGeometrica(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getArea() {
        System.out.println("Calculo del Area de la figura");
        return (0);
    }

    public float getPerimetro() {
        System.out.println("Calculo del Perimetro de la figura");
        return (0);
    }
            
}
