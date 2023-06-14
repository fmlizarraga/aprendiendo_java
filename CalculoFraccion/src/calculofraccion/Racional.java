package calculofraccion;

import java.util.Scanner;

/**
 *
 * @file Racional
 * @author Franco Matias Lizarraga
 */
public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }
    
    public Racional(int numerador, int denominador) {
        int[] reducido = this.reducir(numerador, denominador);
        this.numerador = reducido[0];
        this.denominador = reducido[1];
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    // Maximo comun denominador
    private int mcd(int a, int b) {
        if(b==0) return a;
        return mcd(b, a % b);
    }
    
    private int[] reducir(int a, int b) {
        int d;
        d = mcd(a, b);
        int[] reducida = {a/d,b/d};
        return reducida;
    }
    
    public void ingresarFraccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngresando fraccion");
        System.out.println("Ingrese el numerador:");
        this.setNumerador(entrada.nextInt());
        
        System.out.println("Ingrese el denominador:");
        this.setDenominador(entrada.nextInt());
    }
    
    public void mostrar() {
        System.out.println(
                "\n " + 
                this.getNumerador() +
                "\n---" +
                "\n " +
                this.getDenominador()
        );
    }
    
    public Racional multiplicacion(Racional m) {
        int nuevoNum = this.getNumerador() * m.getNumerador();
        int nuevoDen = this.getDenominador() * m.getDenominador();
        return new Racional(nuevoNum,nuevoDen);
    }
    
    public Racional division(Racional d) {
        int nuevoNum = this.getNumerador() * d.getDenominador();
        int nuevoDen = this.getDenominador() * d.getNumerador();
        return new Racional(nuevoNum, nuevoDen);
    }
    
}
