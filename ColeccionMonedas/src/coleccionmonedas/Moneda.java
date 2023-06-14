package coleccionmonedas;

import java.util.Scanner;

/**
 *
 * @file Moneda
 * @author Franco Matias Lizarraga
 */
public class Moneda {
    private float valorNominal;
    private String denominacion;
    private String pais;
    private int anio;

    public Moneda() {
        this.valorNominal = 0;
        this.denominacion = "";
        this.pais = "";
        this.anio = 0;
    }

    public Moneda(float valorNominal, String denominacion, String pais, int anio) {
        if(valorNominal > 0 && valorNominal < 1) this.valorNominal = valorNominal;
        else this.valorNominal = 1;
        this.denominacion = denominacion;
        this.pais = pais;
        this.anio = anio;
    }

    public float getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(float valorNominal) {
        if(valorNominal > 0 && valorNominal < 1) this.valorNominal = valorNominal;
        else this.valorNominal = 1;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void ingresarDatos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== Nueva Moneda ===");
        
        System.out.println("Ingrese el valor nominal (entre 0 y 1):");
        this.setValorNominal(entrada.nextFloat());
        
        System.out.println("Ingrese la denominacion:");
        this.setDenominacion(entrada.next());
        
        System.out.println("Ingrese el pais de origen:");
        this.setPais(entrada.next());
        
        System.out.println("Ingrese el año de acuñacion:");
        this.setAnio(entrada.nextInt());
        
    }
    
}
