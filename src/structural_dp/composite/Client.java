package structural_dp.composite;

public class Client {
    public static void main(String[] args) {
        Book book = new Book(DocumentType.BOOK, 2020, "Book 1");
        Magazine magazine = new Magazine(DocumentType.MAGAZINE, 2021, "Magazine 1");

        DocumentGroup container = new DocumentGroup(DocumentType.GROUP);
        container.addDocument(book);
        container.addDocument(magazine);
        container.display();

        container.removeDocument(magazine);
        container.display();
    }
}
