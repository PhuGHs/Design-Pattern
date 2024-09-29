package structural_dp.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class DocumentGroup extends Document {
    private List<Document> documents;

    public DocumentGroup(DocumentType documentType) {
        super(documentType);
        documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void removeDocument(Document document) {
        documents.remove(document);
    }

    public void display() {
        for (Document document : documents) {
            document.display();
        }
    }
}
