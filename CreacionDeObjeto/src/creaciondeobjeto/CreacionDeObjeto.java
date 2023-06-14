/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creaciondeobjeto;

/**
 *
 * @author tiamat
 */
public class CreacionDeObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjetoJava objeto1 = new ObjetoJava();
        ObjetoJava objeto2 = new ObjetoJava(32, "Hola");
        
        objeto1.imprimir();
        objeto2.imprimir();
        
        objeto1.ingresarDatos();
        objeto1.imprimir();
    }
}
