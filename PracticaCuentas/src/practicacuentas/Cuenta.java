package practicacuentas;

/**
 *
 * @file Cuenta
 * @author Franco Matias Lizarraga
 */
public class Cuenta {

    private String titular;
    private double cantidad;
    
    public static void main(String[] args) {
        // creacion de un objeto con el costructor de 1 parametro
        Cuenta c1 = new Cuenta("Juan Perez");
        // creacion de un objeto con el costructor de 2 parametros
        Cuenta c2 = new Cuenta("Maria Sanchez", 999.99);
        // imprimo y pruebo los metodos toString()
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        // getters
        System.out.println("c1, getters: " + c1.getTitular() + " - " + c1.getCantidad());
        System.out.println("c2, getters: " + c2.getTitular() + " - " + c2.getCantidad());
        // setters
        c1.setTitular("Juan C. Perez");
        c1.setCantidad(195.45);
        System.out.println("c1 ahora es: " + c1.toString());
        // ingresar
        double ing = 255.75;
        System.out.println(c2.titular + " tiene $" + c2.getCantidad());
        System.out.println(c2.titular + " ingresa $" + ing);
        c2.ingresar(ing);
        System.out.println(c2.titular + " ahora tiene $" + c2.getCantidad());
        ing = -75.55;
        System.out.println(c2.titular + " intenta ingresar $" + ing);
        System.out.println(c2.titular + " aun tiene $" + c2.getCantidad());
        // extraer
        double ext = 55.60;
        System.out.println(c1.titular + " tiene $" + c1.getCantidad());
        System.out.println(c1.titular + " extrae $" + ext);
        c1.retirar(ext);
        System.out.println(c1.titular + " ahora tiene $" + c1.getCantidad());
        ext = 200;
        System.out.println(c1.titular + " intenta extraer $" + ext);
        c1.retirar(ext);
        System.out.println(c1.titular + " ahora tiene $" + c1.getCantidad());
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(double cantidad) {
        if(cantidad > 0) this.setCantidad(this.getCantidad() + cantidad);
    }
    
    public void retirar(double cantidad) {
        this.setCantidad(this.getCantidad() - cantidad);
        if(this.getCantidad() < 0) this.setCantidad(0);
    }
}
