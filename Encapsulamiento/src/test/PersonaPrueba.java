/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dominio.Persona;

/**
 *
 * @author tiamat
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Franco", 600.00, false);
        persona1.setNombre("Franco Matias");
//        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println(persona1);
    }
}
