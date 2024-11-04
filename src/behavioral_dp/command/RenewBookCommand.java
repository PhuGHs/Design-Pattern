package behavioral_dp.command;

public class RenewBookCommand implements LibraryCommand {
    private Library library;
    private LibraryUser libraryUser;
    private Book book;

    public RenewBookCommand(Library library, LibraryUser libraryUser, Book book) {
        this.library = library;
        this.libraryUser = libraryUser;
        this.book = book;
    }

    @Override
    public void execute() {
        library.renewBook(book, libraryUser);
    }
}
