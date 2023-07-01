package zoologico;

public class Zoologico {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.imprimirResultado();
    }

    public static String compararAnimales(Jaula<Animal> anim1, Jaula<Animal> anim2) {

        // Modifique el metodo para hacer las pruebas
        
        Animal mayor = null;
        
        for (Animal a : anim1.getAnimales()) {
            if(mayor == null || a.getEdad() > mayor.getEdad()) mayor = a;
        }
        for (Animal a : anim2.getAnimales()) {
            if(mayor == null || a.getEdad() > mayor.getEdad()) mayor = a;
        }

        return "El animal mas viejo entre " + anim1.toString() + "\ny " + anim2.toString() + "\nes " + mayor.toString();
    }

    public void imprimirResultado() {

        ejecutarPruebasGenericidad();

        // Modifique el resultado para que muestre el String resultante 
        // del metodo compararAnimales
        Jaula<Animal> anim1 = new Jaula<>();
        Jaula<Animal> anim2 = new Jaula<>();
        Animal a1 = new Jaguar("Joaquin", "oscuro", true);
        Animal a2 = new Orangutan("Marron", false, 70, true);
        
        a1.setEdad(2);
        a1.setEnPeligro(true);
        a1.setNombreCientífico("Panthera onca");
        a1.setHabitat("Selva sudamericana");
        anim1.asignarAnimal(a1);
        
        a2.setEdad(7);
        a2.setEnPeligro(true);
        a2.setNombre("Osvaldo");
        a2.setNombreCientífico("Pongo pygmaeus");
        a2.setHabitat("Jungla de Borneo");
        anim2.asignarAnimal(a2);
        
        System.out.println("\n=====================================\n");
        System.out.println("Se van a comparar animales");
        String compararAnimales = compararAnimales(anim1, anim2);
        System.out.println(compararAnimales);
    }

    public void ejecutarPruebasGenericidad() {
        // Cree las jaulas y siga los pasos de la guia
        Jaula<Animal> jaulaJ1 = new Jaula<>();
        Jaguar j1 = new Jaguar("Juan", "Claro", false);
        jaulaJ1.asignarAnimal(j1);
        Jaguar j2 = new Jaguar("Jorge", "Negro", false);
        jaulaJ1.asignarAnimal(j2);
        Jaguar j3 = new Jaguar("Jazmin", "Claro", false);
        jaulaJ1.asignarAnimal(j3);
        jaulaJ1.mostrarAnimales();
        Serpiente s1 = new Serpiente("Sandra", true, true);
        //jaulaJ1.asignarAnimal(s1); // Esto lanza una excepcion si el parametro es Jaguar
        //si el parametro es la clase generica Animal si se puede
        jaulaJ1.asignarAnimal(s1);
        jaulaJ1.mostrarAnimales();
    }
}
