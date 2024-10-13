package structural_dp.proxy;

//Proxy
public class DocumentProxy implements IDocument {
    private RealDocument realService;
    private String userRole;

    public DocumentProxy(RealDocument realService, String userRole) {
        this.realService = realService;
        this.userRole = userRole;
    }

    @Override
    public void view() {
        if (userRole.equals("LIBRARIAN") || userRole.equals("READER")) {
            realService.view();
        } else {
            System.out.println("Access denied");
        }
    }

    @Override
    public void edit() {
        if (userRole.equals("LIBRARIAN")) {
            realService.edit();
        } else {
            System.out.println("Access denied");
        }
    }
}
