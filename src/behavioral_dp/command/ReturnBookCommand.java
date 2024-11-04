package behavioral_dp.command;

public class ReturnBookCommand implements LibraryCommand {
    private Library library;
    private LibraryUser libraryUser;
    private Book book;

    public ReturnBookCommand(Library library, LibraryUser libraryUser, Book book) {
        this.library = library;
        this.libraryUser = libraryUser;
        this.book = book;
    }

    @Override
    public void execute() {
        library.returnBook(book, libraryUser);
    }
}
