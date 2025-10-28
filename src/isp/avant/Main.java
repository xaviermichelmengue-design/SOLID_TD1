package isp.avant;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();
        
        Worker robot = new RobotWorker();
        robot.work();
        try {
            robot.eat(); // Erreur !
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
