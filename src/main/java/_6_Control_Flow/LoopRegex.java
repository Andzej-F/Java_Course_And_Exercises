package _6_Control_Flow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//                90. Applying Loops to Regex
public class LoopRegex {
  public static void main(String[] args) {
    String people = """
            Flintstone, Fred, 1/1/1900
            Rubble, Barny, 2/2/1905
            Flintstone, Wilma, 3/3/1910
            Rubble, Betty, 4/4/1915
            """;

    String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})";
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(people);


    while (mat.find()) {
      System.out.printf("%s %s %s%n", mat.group("firstName"),
              mat.group("lastName"), mat.group("dob"));
    }
  }
}

//    + Match one or more. 	 	>= 1
//    * Match zero or more.  	>= 0
//    ? Match zero or one. 	 0 || 1
//    \\w == a-zA-Z0-9_
//    \\d == 0-9
//    \\s == space
//    [-.\s]+ == 1 or more
//    [-.\s]* == 0 or more
//    [-.\s]? == 0 or 1
//    d{3,4} == 3 to 4 digits
//    d{3,} == >=3, at least 3 digits, no upper limit
//    (\\d{3}[-.\s]?){2} == match this pattern 2 times
//    (\\d{3}[-.\s]?){1,2} == match this pattern 1 or 2 times
//    (?:(\d{1,2})[-.\s]?) ?: == not remember/capture that group
//    \\( == escape opening parenthesis