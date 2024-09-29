package structural_dp.composite;

//Component
public abstract class Document {
    protected DocumentType documentType;

    public Document(DocumentType documentType) {
        this.documentType = documentType;
    }

    protected abstract void display();
}
