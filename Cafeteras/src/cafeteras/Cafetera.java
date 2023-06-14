package cafeteras;

/**
 *
 * @file Cafetera
 * @author Franco Matias Lizarraga
 */
public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    
    public Cafetera(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        if (cantidadActual >= cantidadMaxima) this.cantidadActual = cantidadActual;
        else this.cantidadActual = cantidadMaxima;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        this.setCantidadActual(this.getCantidadMaxima());
    }
    
    public int servirTaza(int capacidad) {
        int miTaza;
        int nuevaCantidad;
        if(this.getCantidadMaxima() >= capacidad) {
            miTaza = capacidad;
            nuevaCantidad = this.getCantidadActual() - capacidad;
        }
        else {
            miTaza = this.getCantidadActual();
            nuevaCantidad = 0;
        }
        this.setCantidadActual(nuevaCantidad);
        return miTaza;
    }
    
    public void vaciarCafetera() {
        this.setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidad) {
        int disponible = this.getCantidadMaxima() - this.getCantidadActual();
        if(disponible >= cantidad) {
            this.setCantidadActual(this.getCantidadActual() + cantidad);
        }
        else {
            this.setCantidadActual(this.getCantidadMaxima());
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantidadMaxima=" + cantidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
}
