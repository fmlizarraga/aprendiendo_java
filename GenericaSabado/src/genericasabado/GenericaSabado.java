package genericasabado;

/**
 *
 * @file GenericaSabado
 * @author Franco Matias Lizarraga
 */
public class GenericaSabado {

    public static void main(String[] args) {
        MiClase<Integer> objetoEntero = new MiClase<>(20);
        objetoEntero.mostrarObjeto();
        
        MiClase<String> objetoString = new MiClase<>("Pepe");
        objetoString.mostrarObjeto();
    }

}
