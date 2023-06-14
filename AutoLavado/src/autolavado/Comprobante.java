package autolavado;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @file Comprobante
 * @author Franco Matias Lizarraga
 */
public class Comprobante {
    private int id;
    private LocalDate fechaTransaccion;
    private LocalTime horaTransaccion;
    private String observacion;
    private int dni;
    private float pago;
    private float saldo;
    private String nombre;
    private String ape;
    
    private static int contadorId;

    public Comprobante() {
        this.id = ++contadorId;
        this.fechaTransaccion = LocalDate.now();
        this.horaTransaccion = LocalTime.now();
    }

    public Comprobante(Cuenta cuenta, String observacion) {
        this();
        this.dni = cuenta.getCliente().getDni();
        this.nombre = cuenta.getCliente().getNombre();
        this.ape = cuenta.getCliente().getApellido();
        this.pago = cuenta.getPago();
        this.saldo = cuenta.getSaldo();
        this.observacion = observacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public float getPago() {
        return pago;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApe() {
        return ape;
    }

    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    public LocalTime getHoraTransaccion() {
        return horaTransaccion;
    }
    
    // TODO: agregar campos para que sean estaticos de este objeto
    // y no cambien, como el saldo y el monto pagado!
    public void imprimir() {
        System.out.println("\n### COMPROBANTE ###");
        System.out.println("Cliente: " + 
                this.getApe() +
                ", " +
                this.getNombre()
        );
        System.out.println("DNI: " + this.getDni());
        System.out.println("\nFecha: " + this.getFechaTransaccion());
        System.out.println("Hora: " + this.getHoraTransaccion());
        System.out.println("Monto pagado: $" + this.getPago());
        System.out.println("Saldo: $" + this.getSaldo());
        System.out.println("\nObserbacion: " + this.getObservacion());
        System.out.println("-------------------------");
        System.out.println("Comprobante N°: " + this.getId());
    }
    
}
