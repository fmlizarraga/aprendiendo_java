package pruebatiempo;

/**
 *
 * @file PruebaTiempo
 * @author Franco Matias Lizarraga
 */
public class PruebaTiempo {

    public static void main(String[] args) {
        // Crear varios objetos Tiempo 
        // Utilizar los constructores sobrecargados
        // Verificar todo el funcionamiento de la clase Tiempo
        Tiempo t1 = new Tiempo();
        Tiempo t2 = new Tiempo(8);
        Tiempo t3 = new Tiempo(9, 40);
        Tiempo t4 = new Tiempo(7, 57, 28);
        Tiempo t5 = new Tiempo(t4);
        
        t1.establecerTiempo(5, 43, 16);
        
        t2.establecerHora(6);
        t2.establecerMinuto(24);
        
        t3.establecerSegundo(37);
        
        System.out.println("t1.obtenerHora(): " + t1.obtenerHora());
        System.out.println("t2.obtenerMinuto(): " + t2.obtenerMinuto());
        System.out.println("t3.obtenerSegundo(): " + t3.obtenerSegundo());
        System.out.println("t4.aStringUniversal(): " + t4.aStringUniversal());
        System.out.println("t1.toString(): " + t1.toString());
        System.out.println("t2.toString(): " + t2.toString());
        System.out.println("t3.toString(): " + t3.toString());
        System.out.println("t4.toString(): " + t4.toString());
        System.out.println("t5.toString(): " + t5.toString());
    }

}
