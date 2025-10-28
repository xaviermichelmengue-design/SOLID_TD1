package dip.avant;

public class OrderProcessor {
    private MySQLDatabase database;
    
    public OrderProcessor() {
        this.database = new MySQLDatabase(); // Dépendance concrète
    }
    
    public void processOrder(String order) {
        database.save(order);
    }
}
