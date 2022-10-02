
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {
        String text = "<strike> Delite! </strike> A eto good text, ego trogat` ne nado. <strike> i eto nujno! </strike>";
        Pattern pattern = Pattern.compile("<strike>. *?</strike>");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom" + start + "to" + (end - 1));

        }
        System.out.println("Clean the text");
        System.out.println(matcher.replaceAll(""));
    }

}
