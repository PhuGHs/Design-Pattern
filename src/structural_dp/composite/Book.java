package structural_dp.composite;

//Leaf
public class Book extends Document {
    private int publishedYear;
    private String name;

    public Book(DocumentType documentType, int publishedYear, String name) {
        super(documentType);
        this.publishedYear = publishedYear;
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("Document type: " + documentType.getType());
        System.out.println("Document name: " + this.name);
        System.out.println("Document type: " + this.publishedYear);
        System.out.println("--------------------------------------");
    }
}
