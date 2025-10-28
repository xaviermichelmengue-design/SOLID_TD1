package lsp.avant;

public class MainLsp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du Rectangle = " + rectangle.getArea()); // 20
        
        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(4);
        System.out.println("Aire du Carré = " + square.getArea()); // 16 au lieu de 20
    }
}
