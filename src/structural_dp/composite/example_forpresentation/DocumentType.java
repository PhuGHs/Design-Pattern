package structural_dp.composite.example_forpresentation;

public enum DocumentType {
    MAGAZINE("Magazine"),
    BOOK("Book"),
    GROUP("Document Group");

    private String type;

    DocumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
