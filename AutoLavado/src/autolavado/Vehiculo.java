package autolavado;

import java.util.Scanner;

/**
 *
 * @file Vehiculo
 * @author Franco Matias Lizarraga
 */
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    Scanner entrada = new Scanner(System.in);

    public Vehiculo() {
        this.patente = "AAA123";
        this.marca = "";
        this.modelo = "";
    }

    public Vehiculo(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
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
    
    public void ingresarDatos() {
        System.out.println("=== DATOS DEL VEHICULO ===");
        System.out.print("Patente: ");
        this.setPatente(entrada.next());
        System.out.print("Marca: ");
        this.setMarca(entrada.next());
        System.out.print("Modelo: ");
        this.setModelo(entrada.next());
    }
    
    public void mostrar() {
        System.out.println("=== Vehiculo ===");
        System.out.println(
                "Patente: " + this.getPatente() +
                "\nMarca: " + this.getMarca() +
                "\nModelo: " + this.getModelo()
        );
    }
}
