package src;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String menuTitle = "Main Menu";
        String prompt = "Select an option:";
        String[] menuOptions = {
            "Test Data",
            "Option 2",
            "Option 3"
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
                    testData();
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }
    
    public static void testData() {
        Book book1 = new Book("Java 1", "Marc Hauschildt", "2021-02-06", false, 300);
        System.out.println("Book " + Book.bookCount + ": " + book1);
        Book book2 = new Book();
        System.out.println("Book " + Book.bookCount + ": " + book2);
        Book book3 = new ChildrensBook("Java 2 For Kids", "Dr. Suess", "2022-01-01", false, 40, "Stan Lee");
        System.out.println("Book " + Book.bookCount + ": " + book3);
        Book book4 = new ChildrensBook();
        System.out.println("Book " + Book.bookCount + ": " + book4);
    }

}