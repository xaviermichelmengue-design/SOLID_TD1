package ocp.apres;

public class Main {
    public static void main(String[] args) {
        AreaCalculator2 calculator = new AreaCalculator2();
        
        Shape rectangle = new Rectangle(4, 3);
        Shape circle = new Circle(5);
        
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
    }
}
