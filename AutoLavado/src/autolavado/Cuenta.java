package autolavado;

import java.util.Scanner;

/**
 *
 * @file Cuenta
 * @author Franco Matias Lizarraga
 */
public class Cuenta {
    private Cliente cliente;
    private Servicio servicio;
    private int periodo;
    private int tipoServicio;
    private float pago;
    private float saldo;
    
    Scanner entrada = new Scanner(System.in);

    public Cuenta(Servicio servicio) {
        this.cliente = new Cliente();
        this.servicio = servicio;
        this.periodo = 0;
        this.tipoServicio = 0;
        this.pago = 0;
        this.saldo = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float calcularSaldo() {
        return (float) this.getPago() + this.getSaldo() - this.getServicio().CalcularPrecio(this.getTipoServicio(), this.getPeriodo());
    }
    
    public void ingresarDatos() {
        this.getCliente().ingresarDatos();
        this.realizarPago();
        System.out.println("""
                           
                           
                           Datos ingresados!
                           Puede ingresar mas vehiculos a esta cuenta despues!
                           """ );
    }
    
    public void mostrar() {
        System.out.println("--------------------------");
        this.getCliente().mostrar();
        System.out.print("Continuar...");
        entrada.next();
    }
    
    public void generarTicket(String observacion) {
        Comprobante nuevoC = new Comprobante(this, observacion);
        this.getCliente().getTickets().add(nuevoC);
        nuevoC.imprimir();
    }
    
    public void realizarPago() {
        int tipo;
        int periodo;
        float costo;
        
        System.out.println("Elija el tipo de servicio");
        for (int i = 0; i < this.getServicio().getTipos().length; i++) {
            System.out.println(i + ". " + this.getServicio().getTipos()[i]);
        }
        System.out.print("Tipo de servicio: ");
        tipo = entrada.nextInt();
        if(tipo >= 0 && tipo < this.getServicio().getTipos().length)
            this.setTipoServicio(tipo);
        else {
            System.out.println("Opcion invalida, se selecciona opcion 0");
            this.setTipoServicio(0);
        }
        
        System.out.println("\nSeleccione el periodo del servicio");
        for (int i = 0; i < this.getServicio().getPeriodos().length; i++) {
            System.out.println(i + ". " + this.getServicio().getPeriodos()[i] + " dias");
        }
        System.out.print("Periodo contratado: ");
        periodo = entrada.nextInt();
        if(periodo >= 0 && periodo < this.getServicio().getPeriodos().length)
            this.setPeriodo(periodo);
        else {
            System.out.println("Opcion invalida, se selecciona 1 dia");
            this.setPeriodo(0);
        }
        
        costo = this.getServicio().CalcularPrecio(this.getTipoServicio(), this.getPeriodo());
        System.out.println("\nCosto del servicio seleccionado: $" + costo);
        System.out.print("Pago realizado: $");
        this.setPago(entrada.nextFloat());
        System.out.println("\nSu saldo: $" + this.calcularSaldo());
        this.setSaldo(this.calcularSaldo());
        
        this.generarTicket(
                "Pago realizado por servicio " + 
                this.getServicio().getTipos()[tipo] + 
                ", por " + 
                this.getServicio().getPeriodos()[periodo] + 
                " dias"
        );
        // limpio el pago para que no parezca que el cliente paga
        // cada vez que viene y le genero un ticket
        // si es que el servicio es por 7 o 30 dias
        this.setPago(0);
    }
}
