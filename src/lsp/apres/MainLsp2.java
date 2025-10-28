package lsp.apres;

public class MainLsp2 {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 4);
        
        System.out.println("Square Area: " + square.getArea()); // 9
        System.out.println("Rectangle Area: " + rectangle.getArea()); // 12
    }
}
