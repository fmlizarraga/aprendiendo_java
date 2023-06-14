package coleccionmonedas;

/**
 *
 * @file Coleccion
 * @author Franco Matias Lizarraga
 */
public class Coleccion {
    private Moneda[] monedero;

    public Coleccion() {
        this.monedero = new Moneda[0];
    }

    public Moneda[] getMonedero() {
        return monedero;
    }

    private void setMonedero(Moneda[] monedero) {
        this.monedero = monedero;
    }
    
    public int contarMonedas() {
        return this.monedero.length;
    }
    
    public void agregarMoneda() {
        Moneda[] nuevoMonedero = new Moneda[contarMonedas() + 1];

        System.arraycopy(getMonedero(), 0, nuevoMonedero, 0, contarMonedas());
        
        nuevoMonedero[contarMonedas()] = new Moneda();
        nuevoMonedero[contarMonedas()].ingresarDatos();
        
        setMonedero(nuevoMonedero);
    }

    public void mostrarColeccion() {
        int i = 0;
        System.out.println("=== Coleccion de monedas ===");
        while(i < contarMonedas()) {
            System.out.println(
                    "Moneda "
                    + (i + 1)
                    + ": { "
                    + "Valor Nominal: "
                    + getMonedero()[i].getValorNominal()
                    + ", Denominacion: "
                    + getMonedero()[i].getDenominacion()
                    + ", Pais: "
                    + getMonedero()[i].getPais()
                    + ", Año de acuñacion: "
                    + getMonedero()[i].getAnio()
                    + " },"
            );
            i++;
        }
    }
    
    // metodo monedasPais
    public int contarPorPais(String pais) {
        int cuenta = 0;
        for (int i = 0; i < getMonedero().length; i++) {
            if(getMonedero()[i].getPais().equals(pais)) cuenta++;
        }
        return cuenta;
    }
    // metodo monedasAnio
    public int contarPorAnio(int anio) {
        int cuenta = 0;
        for (int i = 0; i < getMonedero().length; i++) {
            if(getMonedero()[i].getAnio()== anio) cuenta++;
        }
        return cuenta;
    }
    
}
