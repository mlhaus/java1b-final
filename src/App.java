import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String menuTitle = "Main Menu";
        String prompt = "Select an option:";
        String[] menuOptions = {
            "Add a book", 
            "View books left to right", 
            "View books alphabetically",
            "View books read/unread", 
            "View books by category",
            "Modify a book as read", 
            "Move a book",
            "Swap 2 books",
            "Remove a book" 
        };
        int choice = 0;
        while (true) {
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            UIUtility.showSectionTitle(menuOptions[Integer.valueOf(choice) - 1]);
            switch (choice) {
                case 1:
                    if(Bookshelf.isFull()) {
                        System.out.println("The bookshelf is full. Remove a book before adding a new one.");
                    } else {
                        addBook(scanner);
                    }
                    break;
                case 2:
                    Bookshelf.viewBooksLeftToRight();
                    break;
                case 3:
                    
                    break;
                case 4:

                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }

    public static void addBook(Scanner scanner) {
        String typeOfBook = Helpers.input("What type of book would you like to add? [1-Regular or 2-Children's]:", scanner);
        String title = Helpers.input("Enter the book's title:", scanner);
        String author = Helpers.input("Enter the book's author:", scanner);
        String illustrator = "";
        if(typeOfBook.equals("2")) {
            illustrator = Helpers.input("Enter the book's illustrator:", scanner);
        }
        String dateAdded = Helpers.input("Enter the date the book was added [YYYY-MM-DD]:", scanner);
        String numPages = Helpers.input("Enter the number of pages:", scanner);
        int numPagesInt = Helpers.convertStrToInt(numPages);
        if(numPagesInt < 0 || numPagesInt > 15000) {
            numPagesInt = 0;
        }
        String readYesNo = Helpers.input("Have you read this book? [1-Yes or 2-No]:", scanner);
        int readYesNoInt = Helpers.convertStrToInt(readYesNo);
        boolean read = readYesNoInt == 1 ? true : false;
        Book book = typeOfBook.equals("2") ? new ChildrensBook(title, author, dateAdded, read, numPagesInt, illustrator) : new Book(title, author, dateAdded, read, numPagesInt);
        Bookshelf.addBook(book);
        System.out.println("\nBook Added!");
    }
    
    public static void testData(Scanner scanner) {
        Book book1 = new Book("Java 1", "Marc Hauschildt", "2021-02-06", false, 300);
        System.out.println("Book " + Book.bookCount + ": " + book1);
        Book book2 = new Book();
        System.out.println("Book " + Book.bookCount + ": " + book2);
        Book book3 = new ChildrensBook("Java 2 For Kids", "Dr. Suess", "2022-01-01", false, 40, "Stan Lee");
        System.out.println("Book " + Book.bookCount + ": " + book3);
        Book book4 = new ChildrensBook();
        System.out.println("Book " + Book.bookCount + ": " + book4);
        UIUtility.pressEnterToContinue(scanner);
    }

}