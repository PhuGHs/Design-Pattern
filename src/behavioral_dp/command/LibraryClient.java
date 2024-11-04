package behavioral_dp.command;

public class LibraryClient {
    public static void main(String[] args) {
        //init
        Book book1 = new Book(1L, "Book 1", false);
        Book book2 = new Book(2L, "Book 2", true);
        Book book3 = new Book(3L, "Book 3", true);
        Book book4 = new Book(4L, "Book 4", true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        LibraryUser user1 = new LibraryUser(1L, "user 1");
        LibraryUser user2 = new LibraryUser(2L, "user 2");

        LibraryCommand renewCommand = new RenewBookCommand(library, user1, book1);
        LibraryCommand borrowCommand = new BorrowBookCommand(library, user1, book1);
        LibraryCommand returnCommand = new ReturnBookCommand(library, user1, book1);

        //create invoker
        LibraryInvoker invoker = new LibraryInvoker();
        invoker.addCommand(borrowCommand);
        invoker.addCommand(renewCommand);
        invoker.addCommand(returnCommand);

        //execute commands
        invoker.execute();
    }
}
