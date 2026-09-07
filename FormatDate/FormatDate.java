import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDate {

    private static final DateTimeFormatter FULL_TEXT_FORMATTER =
            DateTimeFormatter.ofPattern("'Le' d MMM 'de l''an' yyyy 'à' HH'h'mm'm et' ss's'", Locale.FRENCH);

    private static final DateTimeFormatter SIMPLE_FORMATTER =
            DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);

    public static String formatToFullText(LocalDateTime dateTime) {
        return (dateTime == null) ? null : dateTime.format(FULL_TEXT_FORMATTER);
    }

    public static String formatSimple(LocalDate date) {
        return (date == null) ? null : date.format(SIMPLE_FORMATTER);
    }

    public static String formatIso(LocalTime time) {
        return (time == null) ? null : time.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
}