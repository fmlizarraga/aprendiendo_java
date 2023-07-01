package par;

/**
 *
 * @file ParGenerico
 * @author Franco Matias Lizarraga
 */
public class ParGenerico {

    public static void main(String[] args) {
        // Crear objetos de tipo Par con diferentes tipos de elementos
        Par<Integer, String> p1 = new Par<>(10, "Juan");
        Par<Float, Character> p2 = new Par<>((float)1.5,'g');
        Par<Boolean, Float> p3 = new Par<>(false, (float) 0.45);
        Par<String, Boolean> p4 = new Par<>("Falso", true);
        Par<Double, Integer> p5 = new Par<>(1.75, 24);
        // Imprimir los elementos de cada objeto Par
        System.out.println("1. " + p1.toString());
        System.out.println("2. " + p2.toString());
        System.out.println("3. " + p3.toString());
        System.out.println("4. " + p4.toString());
        System.out.println("5. " + p5.toString());
    }
}
