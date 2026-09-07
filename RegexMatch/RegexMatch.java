import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        if (s == null) return false;
        Pattern pattern = Pattern.compile("^\\w+$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        if (s == null) return false;
        Pattern pattern = Pattern.compile("^\\w.+[0-9]$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
        if (s == null) return false;
        Pattern pattern = Pattern.compile("A{3,}");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}