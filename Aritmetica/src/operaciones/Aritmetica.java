/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author tiamat
 */
public class Aritmetica {
    int a;
    int b;
    
//    Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
}
