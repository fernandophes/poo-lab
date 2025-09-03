import right.Rectangle;
import right.Square;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final var rectangle = new Rectangle(2, 3);
        final var square = new Square(2);

        System.out.println("Área do retângulo: " + rectangle.getArea());
        System.out.println("Área do quadrado: " + square.getArea());
    }
}
