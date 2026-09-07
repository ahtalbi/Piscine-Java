import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class ParseDate {
    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }

        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("EEEE d MMMM yyyy").toFormatter(Locale.ENGLISH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }

        String normalized = stringDate.replace("evening", "PM").replace("afternoon", "PM").replace("morning", "AM").replace("night", "PM");
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("hh' hours in the 'a', 'mm' minutes and 'ss' seconds'").toFormatter(Locale.ENGLISH);
        return LocalTime.parse(normalized, formatter);
    }
}