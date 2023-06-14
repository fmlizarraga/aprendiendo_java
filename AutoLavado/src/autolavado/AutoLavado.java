package autolavado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @file AutoLavado
 * @author Franco Matias Lizarraga
 */
public class AutoLavado {

    float precio;
    String[] tiposServicio;
    List<Cuenta> cuentas;
    Servicio servicio;
    Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        AutoLavado negocio = new AutoLavado();
        System.out.println(
                "\n#####################" +
                "\n### MI AUTOLAVADO ###" +
                "\n#####################"
        );
        negocio.menuInicial();
    }

    public AutoLavado() {
        this.precio = 150;
        this.tiposServicio = new String[] {"Basico","Completo","Premium"};
        this.cuentas = new ArrayList<>();
        this.servicio = new Servicio(this.precio, this.tiposServicio);
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String[] getTiposServicio() {
        return tiposServicio;
    }

    public void setTiposServicio(String[] tiposServicio) {
        this.tiposServicio = tiposServicio;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    public void menuInicial() {
        int opcion = 0;
        do {
            System.out.println("1. Registrar nueva cuenta");
            System.out.println("2. Buscar cuenta");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    registrarCuenta();
                    break;
                case 2:
                    buscarCuenta();
                    break;
                case 3: break;
                default:
                    System.out.println("Opcion invalida o desconocida");
            }
        } while(opcion != 3);
    }
    
    public void registrarCuenta() {
        Cuenta nuevaC = new Cuenta(servicio);
        nuevaC.ingresarDatos();
        this.getCuentas().add(nuevaC);
    }
    
    public void menuCuenta(int indice) {
        String ape = this.getCuentas().get(indice).getCliente().getApellido();
        String nom = this.getCuentas().get(indice).getCliente().getNombre();
        int opcion = 0;
        do {
            System.out.println("\n\n-----------------------------");
            System.out.println("Cuenta de " + ape + ", " + nom);
            System.out.println("1. Mostrar cuenta");
            System.out.println("2. Prestar servicio");
            System.out.println("3. Efectuar pago");
            System.out.println("4. Registrar nuevo vehiculo");
            System.out.println("5. Mostrar el ultimo ticket");
            System.out.println("6. Volver al inicio");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    this.getCuentas().get(indice).mostrar();
                    break;
                case 2:
                    prestarServicio(indice);
                    break;
                case 3:
                    this.getCuentas().get(indice).realizarPago();
                    break;
                case 4:
                    this.getCuentas().get(indice).getCliente().agregarVehiculo();
                    break;
                case 5:
                    this.mostrarUltTicket(indice);
                    break;
                case 6: break;
                default:
                    System.out.println("Opcion desconocida");
            }
        } while (opcion != 6);
    }
    
    public void buscarCuenta() {
        int dni;
        int iEncontrada = -1;
        System.out.println("\n=== BUSCAR CUENTA ====");
        System.out.print("Ingrese el DNI: ");
        dni = entrada.nextInt();
        for (Cuenta cuenta : cuentas) {
            if(cuenta.getCliente().getDni() == dni) {
                iEncontrada = this.getCuentas().indexOf(cuenta);
            }
        }
        if(iEncontrada >= 0) {
            System.out.println("\nCuenta Encontrada");
            menuCuenta(iEncontrada);
        } else {
            System.out.println("\nNo existe una cuenta con ese DNI");
            System.out.println("Ingrese cualquier caracter para regresar");
            entrada.next();
        }
    }
    
    public void prestarServicio(int indice) {
        int opcionV = -1;
        Cuenta cuenta = this.getCuentas().get(indice);
        Cliente cliente = this.getCuentas().get(indice).getCliente();
        List<Vehiculo> vehiculos = cliente.getVehiculos();
        String observacion = "";
        String nuevaPatente = "";
        
        System.out.println("Seleccione el vehiculo");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(
                    i + ". " + 
                    vehiculos.get(i).getPatente() + " - " + 
                    vehiculos.get(i).getMarca() + " " + 
                    vehiculos.get(i).getModelo()
            );
        }
        System.out.println(vehiculos.size() + ". Vehiculo nuevo o desconocido");
        System.out.print("Opcion: ");
        opcionV = entrada.nextInt();
        if(opcionV == vehiculos.size()) {
            System.out.print("Ingrese la patente: ");
            nuevaPatente = entrada.next();
            observacion = "Vehiculo no registrado en la cuenta. Patente: " + nuevaPatente;
        }
        else if(opcionV >= 0 && opcionV < vehiculos.size()) {
            cliente.setVehiculoActual(vehiculos.get(opcionV));
            observacion = "Vehiculo conocido " +
                    cliente.getVehiculoActual().getPatente() + " - " + 
                    cliente.getVehiculoActual().getMarca() + " " + 
                    cliente.getVehiculoActual().getModelo();
        } 
        else {
            System.out.println("ERROR: Opcion desconocida, no se hace nada.");
            return;
        }
        cuenta.generarTicket(observacion);
    }
    
    public void mostrarUltTicket(int iCuenta) {
        List<Comprobante> misTickets = this.getCuentas().get(iCuenta)
                .getCliente().getTickets();
        int iTicket = misTickets.size() - 1;
        misTickets.get(iTicket).imprimir();
    }
}
