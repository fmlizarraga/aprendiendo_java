package figurasgeometricas;

public class Principal {

    public static void main(String[] args) {
        
        // se crea una referencia del tipo Figura
        FiguraGeometrica figura;
        // se le asigna un objeto de tipo Circulo (un Circulo tambien es una Figura!)
        figura = new Circulo(5);
        // mediante el metodo getClass es posible conocer cual es el tipo del objeto referenciado
        System.out.println("\n\nClase: " + figura.getClass());
        // se efectua el calculo solicitado para el tipo Circulo
        System.out.println(" Figura " + " Area: " + figura.getArea());
        System.out.println(" Figura " + " Perimetro: " + figura.getPerimetro());
        
        // Repite las mismas tareas para cada clase hija
        
        // Cuadrado
        figura = new Cuadrado(5);
        // mediante el metodo getClass es posible conocer cual es el tipo del objeto referenciado
        System.out.println("\n\nClase: " + figura.getClass());
        // se efectua el calculo solicitado para el tipo Circulo
        System.out.println(" Figura " + " Area: " + figura.getArea());
        System.out.println(" Figura " + " Perimetro: " + figura.getPerimetro());
        
        // Rectangulo
        figura = new Rectangulo(3,4);
        // mediante el metodo getClass es posible conocer cual es el tipo del objeto referenciado
        System.out.println("\n\nClase: " + figura.getClass());
        // se efectua el calculo solicitado para el tipo Circulo
        System.out.println(" Figura " + " Area: " + figura.getArea());
        System.out.println(" Figura " + " Perimetro: " + figura.getPerimetro());
        
        // Triangulo
        figura = new Triangulo(5,7);
        // mediante el metodo getClass es posible conocer cual es el tipo del objeto referenciado
        System.out.println("\n\nClase: " + figura.getClass());
        // se efectua el calculo solicitado para el tipo Circulo
        System.out.println(" Figura " + " Area: " + figura.getArea());
        System.out.println(" Figura " + " Perimetro: " + figura.getPerimetro());
    }

}
