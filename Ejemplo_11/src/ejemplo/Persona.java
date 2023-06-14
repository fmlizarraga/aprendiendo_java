/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;




public class Persona {

private int dni;
private String ape;
private float sueldo;

    public Persona() {
        this.dni=0;
        this.ape="";
        this.sueldo= 0.0f;
        
    }

    public Persona(int dni, String ape, float sueldo) {
        this.dni = dni;
        this.ape = ape;
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

   


}
