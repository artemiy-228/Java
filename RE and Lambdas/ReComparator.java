import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReComparator {

    public static boolean Email(String text){
        String mask = "([a-zA-Z0-9]+[-_.]?[a-zA-Z0-9]+)+@[a-zA-Z]+.[a-zA-Z]+";
        boolean result = text.matches(mask);
        return result;
    }

    public static String Replacer(String text){
        String replacement = "\\b(function)\\b";

        Pattern pattern = Pattern.compile(replacement);
        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("<mark>$1<mark>");
    }

    public static Map<String, Integer> Splitter(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }

}