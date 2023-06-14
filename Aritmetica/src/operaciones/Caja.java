/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author tiamat
 */
public class Caja {
    int a;
    int b;
    int c;
    
    public Caja() {
        System.out.println("Constructor vacio");
    }
    
    public Caja(int a, int b, int c) {
        System.out.println("Constructor con args tipo int");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void volumen() {
        int vol = this.a*this.b*this.c;
        System.out.println("volumen" + vol);
    }
    
}
