package _4_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//                52. Finding Multiple Matches
public class PeopleMatching {
  public static void main(String[] args) {
    String people =
            """
                    Flintstone, Fred, 1/1/1900
                    Rubble, Barney, 2/2/1905
                    Flintstone, Wilma, 3/3/1910
                    Rubble, Betty, 4/4/1915
                    """;
    //        <  ( [ { \ ^ - = $ ! | ] } ) ? * + . >
    String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
    Matcher mat = pat.matcher(people);

    mat.find(35);
    System.out.println(mat.group("firstName"));
    System.out.println(mat.group("lastName"));
    System.out.println(mat.group("dob"));
    System.out.println(mat.start("firstName")); // [)
    System.out.println(mat.end("firstName"));

  }
}
