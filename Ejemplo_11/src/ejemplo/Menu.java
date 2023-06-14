/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import java.util.Scanner;

public class Menu {
    
        Scanner entrada =new Scanner(System.in);
        
        Persona p1 = new Persona();
        
    public void cargarDatos(){
        
        System.out.println("Ingrese datos del Propietario");
        System.out.print("DNI: ");
        p1.setDni(entrada.nextInt());
        entrada.nextLine();
        System.out.print("Apellido: ");
        p1.setApe(entrada.nextLine());
        System.out.print("Sueldo: ");
        p1.setSueldo(entrada.nextFloat());
    }
    
    
    public void mostrarDatos(){
        System.out.println("DNI: "+ p1.getDni());
        System.out.println("Apellido: "+ p1.getApe());
        System.out.println("Sueldo: "+ p1.getSueldo());
    }
    public void menuOpciones(){
    
        int opc = 9;
        while(opc != 0){
            switch(opc){
                case 1:
                   cargarDatos();
                    break;
                    
                case 2:
                    mostrarDatos();
                    break;
                case 3:
                    actualizarSueldo();
                case 9:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            mostrarMenu();
            System.out.print("Ingrese opcion: ");
            opc = entrada.nextInt();
        }
 
    }
        
    public void actualizarSueldo(){
        System.out.print("Sueldo actualizado: ");
        p1.setSueldo(entrada.nextFloat());
    }


    public void mostrarMenu(){
        System.out.println("\n-------------------------->");
        System.out.println("       menu de Opciones");
        System.out.println("\n-------------------------->");
        System.out.println("1- Cargar Datos");
        System.out.println("2- Mostrar Datos");
        System.out.println("3- Actualizar sueldo");
        System.out.println("0- Salir");
    }
   
    public static void main(String[] args) {
       
        Menu m = new Menu();
        m.menuOpciones();
                
        
    }
    
}
