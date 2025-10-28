package dip.apres;

public class Main {
    public static void main(String[] args) {
        Database database;
        
        // Utilisation avec MySQL
        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder");
        
        // Utilisation avec MongoDB
        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("Données à sauvegarder");
        
        // Utilisation avec PostgreSQL
        database = new PostgresDatabase();
        OrderProcessor order2 = new OrderProcessor(database);
        order2.processOrder("Données à sauvegarder");
    }
}
