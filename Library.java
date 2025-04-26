import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title, String author, int quantity) {
        books.add(new Book(nextId++, title, author, quantity));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }
}
