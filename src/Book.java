package src;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private LocalDate dateAdded;
    private boolean read;
    private int numPages;
    public static int bookCount = 0;

    public Book() {
        title = "";
        author = "";
        dateAdded = LocalDate.now();
        read = false;
        numPages = 0;
        bookCount++;
    }

    public Book(String title, String author, String dateAdded, boolean read, int numPages) {
        this.title = title;
        this.author = author;
        this.dateAdded = Helpers.convertStrToDate(dateAdded);
        this.read = read;
        this.numPages = numPages;
        bookCount++;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Date Added: " + dateAdded;
    }

    @Override
    public int compareTo(Book other) {
        int result = this.title.compareToIgnoreCase(other.title);
        if(result == 0) {
            result = this.author.compareToIgnoreCase(other.author);
        }
        return result;
    }
    
}