package behavioral_dp.command;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private Long userId;
    private String name;
    private List<Book> borrowedBooks;

    public LibraryUser(Long userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
