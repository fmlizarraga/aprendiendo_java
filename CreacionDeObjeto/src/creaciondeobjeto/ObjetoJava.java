/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creaciondeobjeto;

import java.util.Scanner;

/**
 *
 * @author tiamat
 */
public class ObjetoJava {
    private int atributo1;
    private String atributo2;
    
    public ObjetoJava() {
        this.atributo1=0;
        this.atributo2="";
    }
    
    public ObjetoJava(int atributo1, String atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
    
    public void imprimir() {
        System.out.println("Estado del objeto: {" + getAtributo1() + ", " + getAtributo2() + "}");
    }
    
    public void ingresarDatos() {
        System.out.println("Ingrese los valores de los campos del objeto:");
        Scanner entrada = new Scanner(System.in);
        System.out.println("atributo1: ");
        setAtributo1(entrada.nextInt());
        System.out.println("atributo2: ");
        setAtributo2(entrada.next());
    }
    
}
