package structural_dp.proxy;

//Service
public class RealDocument implements IDocument {
    private String content;
    private String name;

    public RealDocument(String content, String name) {
        this.content = content;
        this.name = name;
    }


    @Override
    public void view() {
        System.out.println("Viewing document: " + name);
        System.out.println("Content: " + content);
    }

    @Override
    public void edit() {
        System.out.println("Editing document: " + name);
    }
}
