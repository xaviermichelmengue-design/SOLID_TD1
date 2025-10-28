package isp.apres;

public class MainISP {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        
        RobotWorker robot = new RobotWorker();
        robot.work();
        // robot.eat(); // Impossible car RobotWorker n'implémente pas Eatable
        
        // Utilisation spécifique
        Workable worker = new RobotWorker();
        worker.work();
        
        Eatable eater = new HumanWorker();
        eater.eat();
    }
}
