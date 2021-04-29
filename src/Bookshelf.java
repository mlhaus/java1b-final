import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private static List<Book> books = new ArrayList<>();
    private static final int CAPACITY = 1;

    public static boolean isFull() {
        return books.size() == CAPACITY;
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {

    }

    public static void viewBooksLeftToRight() {
        
    }

    public static void viewBooksAlphabetically() {

    }

    public static void viewBooksRead() {
        
    }

    public static void viewBooksByCategory() {

    }

    public static void updateBookAsRead(int bookIndex) {

    }

    public static void moveABook(int bookIndex, int newLocationIndex) {

    }

    public static void swapBooks(int book1Index, int book2Index) {

    }

    public static void removeBook(int bookIndex) {

    }
}
