package herenciapersonas;

import java.util.Date;

/**
 *
 * @file Cliente
 * @author Franco Matias Lizarraga
 */
public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes; // variable de clase

    public Cliente(Date fechaRegistro, boolean vip) {
        // convocar al constructor del Padre
        // inicializar variables
        super();
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Cliente{" + "idCliente=" + getIdCliente() + ", fechaRegistro=" + getFechaRegistro().toString() + ", vip=" + isVip() + '}';
    }

}