package behavioral_dp.command;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        bookList = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void renewBook(Book book, LibraryUser user) {
        System.out.println(user.getName() + " renews book " + book.getTitle());
    }

    public void borrowBook(Book book, LibraryUser user) {
        if (bookList.stream().anyMatch(b -> b.getBookId().equals(book.getBookId()) && !b.getIsAvailable())) {
            System.out.println("This book is already borrowed!");
        }

        user.getBorrowedBooks().add(book);

        bookList.stream().map(b -> {
            if (b.getBookId() == book.getBookId()) {
                b.setIsAvailable(false);
            }
            return b;
        });
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void returnBook(Book book, LibraryUser user) {
        //remove book from user borrowed book list
        user.getBorrowedBooks().remove(book);

        //set book is available = true
        for (Book b : bookList) {
            if (b.getBookId().equals(book.getBookId())) {
                b.setIsAvailable(true);
                return;
            }
        }
    }
}
