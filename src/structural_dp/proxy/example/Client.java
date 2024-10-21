package structural_dp.proxy.example;

//Client
public class Client {
    public static void main(String[] args) {
        RealDocument documentA = new RealDocument("Document content 1", "Book 1");
        RealDocument documentB = new RealDocument("Document content 2", "Book 2");
        IDocument publicDoc = new DocumentProxy( documentA, "READER");
        IDocument restrictedDoc = new DocumentProxy(documentB, "OVERSEA STUDENT");

        System.out.println("Reader accessing public document: ");
        publicDoc.view();
        System.out.println("\nReader attempting to edit public document: ");
        publicDoc.edit();

        System.out.println("\nReader attempting to view restricted document: ");
        restrictedDoc.view();

        IDocument libDoc = new DocumentProxy(documentB, "LIBRARIAN");
        System.out.println("\nLibrarian accessing library document: ");
        libDoc.view();
        System.out.println("\nLibrarian attempting to edit library document: ");
        libDoc.edit();
    }
}
