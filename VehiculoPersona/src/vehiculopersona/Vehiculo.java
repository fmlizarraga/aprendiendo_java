package vehiculopersona;

import java.util.Scanner;

/**
 *
 * @file Vehiculo
 * @author Franco Matias Lizarraga
 */
public class Vehiculo {
    private int patente;
    private String marca;
    private String modelo;
    private String color;
    private float valor;

    public Vehiculo() {
        this.patente = 0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.valor = 0;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void leerDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de patente:");
        setPatente(entrada.nextInt());
        
        System.out.println("Ingrese la marca:");
        setMarca(entrada.next());
        
        System.out.println("Ingrese el modelo:");
        setModelo(entrada.next());
        
        System.out.println("Ingrese el color:");
        setColor(entrada.next());
        
        System.out.println("Ingrese el valor:");
        setValor(entrada.nextFloat());
    }
    
    public void mostrarDatos() {
        System.out.println("=== DATOS DEL VEHICULO ===");
        System.out.println("Patente N°: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Valor: $" + getValor());
    }
    
    public float calcularImpuesto() {
        return getValor()*3/100;
    }
}
