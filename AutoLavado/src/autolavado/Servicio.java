package autolavado;

/**
 *
 * @file Servicio
 * @author Franco Matias Lizarraga
 */
public class Servicio {
    private float precioBase;
    private String[] tipos;
    private int[] periodos;

    public Servicio() {
        this.precioBase = 0;
        this.tipos = new String[0];
        this.periodos = new int[0];
    }

    public Servicio(float precioBase, String[] tipos) {
        this.precioBase = precioBase;
        this.tipos = tipos;
        this.periodos = new int[] {1, 7, 30};
    }
    
    public Servicio(int precioBase, String[] tipos, int[] periodos) {
        this.precioBase = precioBase;
        this.tipos = tipos;
        this.periodos = periodos;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipo) {
        this.tipos = tipo;
    }

    public int[] getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int[] periodo) {
        this.periodos = periodo;
    }
    
    public float CalcularPrecio(int tipo, int periodo) {
        /* Quise hacer una forma de calcular automaticamente los precios
         * aplicando recargos por los servicios mas caros
         * y descuentos por los periodos mas prolongados
         * de manera que el usuario solo tenga que pensar un precio base
         */
        // recargo de 50% por cada "nivel" de servicio, el servicio mas basico cuesta el precio base
        float recargoTipo = (float) this.getPrecioBase() + this.getPrecioBase() * tipo / 2;
        // multiplicador por los dias que se paga el servicio
        float multPeriodo = (float) this.getPeriodos()[periodo];
        // descuento que aumenta con los periodos mas largos y no afecta al valor diario
        float descPeriodo = (float) 1 / (1 + periodo / 5);
        return (float) recargoTipo * multPeriodo * descPeriodo;
    }
}
