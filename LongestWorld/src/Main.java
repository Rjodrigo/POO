import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String sentence = "Study, More!!!";
        String result = LongestWord(sentence);
        System.out.println(result);
    }

    public static String LongestWord(String sen) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(sen);
        String longestWord = "";
        
        while (matcher.find()) {
            String word = matcher.group();
            
            word = word.replaceAll("[^a-zA-Z]", "");
            
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
