/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrathis;

/**
 *
 * @author tiamat
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("ocnarF", "agarraziL");
        System.out.println("persona = " + persona);
    }
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona) {
        System.out.println("persona imprimir:" + persona);
        System.out.println("objeto imprimir: " + this);
    }
}