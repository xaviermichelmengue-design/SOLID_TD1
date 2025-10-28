package srp.apres;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);
        
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "mon_livre.txt");
        
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Marcial");
        logic.autreservice(book);
    }
}
