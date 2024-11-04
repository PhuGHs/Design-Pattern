package behavioral_dp.command;

public class BorrowBookCommand implements LibraryCommand {
    private Library library;
    private LibraryUser user;
    private Book book;

    public BorrowBookCommand(Library library, LibraryUser user, Book book) {
        this.library = library;
        this.user = user;
        this.book = book;
    }

    @Override
    public void execute() {
        library.borrowBook(book, user);
    }
}
