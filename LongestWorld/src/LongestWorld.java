import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

  public static String LongestWord(String sen) {   
    Pattern pattern = Pattern.compile("\\b\\w+\\b");
    Matcher matcher = pattern.matcher(sen);   
    String longestWord = "";   
    int maxLength = 0;    
    while (matcher.find()) {
      String word = matcher.group();
        if (word.length() > maxLength || (word.length() == maxLength && sen.indexOf(word) < sen.indexOf(longestWord))) {
        longestWord = word;
        maxLength = word.length();
      }
    }

    return longestWord;
  }

  public static void main(String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print("Digite uma frase: ");   
    System.out.println("A palavra mais longa é: " + LongestWord(s.nextLine()));
  }
}
