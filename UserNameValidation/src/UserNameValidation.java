import java.util.*;

class Main {
    
public static String UserNameValidation (String str) {

    if (str.length() < 4 || str.length() > 25) {
        return "invalid: length outside range 4-25";
    }
    if (!Character.isLetter(str.charAt(0))) {
        return "invalid: does not start with a letter";
    }    
    if (!str.matches("^[a-zA-Z0-9_]*$")) {
        return "invalid: contains invalid characters";
    }
    if (str.charAt(str.length() - 1 ) == '_') {
        return "Invalid: ends with underscore";
    }
    return "Valid ID";
   }
    public static void  main (String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print(UserNameValidation(s.nextLine()));
  }

}
