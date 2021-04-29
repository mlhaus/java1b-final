import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Helpers {
    public static LocalDate convertStrToDate(String date) {
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate newDate;
        try {
            newDate = LocalDate.parse(date, formatterInput);
        } catch(DateTimeParseException e) {
            newDate = LocalDate.now();
        }
        return newDate;
    }

    public static int convertStrToInt(String num) {
        int result;
        try {
            result = Integer.parseInt(num);
        }
        catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    public static String input(String prompt, Scanner scanner) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
