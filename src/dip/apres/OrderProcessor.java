package dip.apres;

public class OrderProcessor {
    private Database database;
    
    public OrderProcessor(Database database) { // Injection de dépendance
        this.database = database;
    }
    
    public void processOrder(String order) {
        database.save(order);
    }
}
