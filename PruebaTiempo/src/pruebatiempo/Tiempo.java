package pruebatiempo;

/**
 *
 * @file Tiempo
 * @author Franco Matias Lizarraga
 */
public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
        this(0, 0, 0);
    }

    public Tiempo(int h) {
        this(h, 0, 0);
    }

    public Tiempo(int h, int m) {
        this(h, m, 0);
    }

    public Tiempo(int h, int m, int s) {
        establecerTiempo(h, m, s);
    }

    public Tiempo(Tiempo tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    public void establecerTiempo(int h, int m, int s) {
        establecerHora(h);
        establecerMinuto(m);
        establecerSegundo(s);
    }

    public void establecerHora(int h) {
        hora = ((h >= 0 && h < 24) ? h : 0);
    }

    public void establecerMinuto(int m) {
        minuto = ((m >= 0 && m < 60) ? m : 0);
    }

    public void establecerSegundo(int s) {
        segundo = ((s >= 0 && s < 60) ? s : 0);
    }

    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    public String aStringUniversal() {
        return String.format(
                "%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d   %s",
                ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),
                obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }
}
