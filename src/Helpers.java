package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
}
