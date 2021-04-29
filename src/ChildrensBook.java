public class ChildrensBook extends Book {
    private String illustrator;

    public ChildrensBook() {
        super();
        illustrator = "";
    }

    public ChildrensBook(String title, String author, String dateAdded, boolean read, int numPages, String illustrator) {
        super(title, author, dateAdded, read, numPages);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String toString() {
        return super.toString() + ", Illustrator: " + illustrator;
    }
}
