public class RegexReplace {

    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\s|$)", "");
    }

    public static String obfuscateEmail(String s) {
        if (s == null || !s.contains("@")) return s;

        String[] parts = s.split("@");
        String user = parts[0];
        String[] dom = parts[1].split("\\.");

        int sep = -1;
        for (int i = 0; i < user.length(); i++) {
            if ("-._".indexOf(user.charAt(i)) != -1) {
                sep = i;
                break;
            }
        }

        if (sep != -1) {
            user = user.substring(0, sep + 1) + user.substring(sep + 1).replaceAll(".", "*");
        } else if (user.length() > 3) {
            int keep = Math.max(3, user.length() - 3);
            user = user.substring(0, keep) + user.substring(keep).replaceAll(".", "*");
        }

        dom[0] = dom[0].replaceAll(".", "*");
        if (dom.length == 3 || (dom.length == 2 && !dom[1].matches("com|org|net"))) {
            dom[dom.length - 1] = dom[dom.length - 1].replaceAll(".", "*");
        }

        return user + "@" + String.join(".", dom);
    }
}