package cookbook;

// p.55 Extract a substring by matching a regular expression.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegExpr {
  public static void main(String[] args) {
    Pattern pat = Pattern.compile("\\b\\w+@XYZ\\.com\\b");
    Matcher mat = pat.matcher("""
            Company Contact Info
            Tom 555-1111 tom@XYZ.com
            Mary 555-2222 Mary@XYZ.com
            Don 555-3333 Don@XYZ.com
            """);

    while (mat.find()) {
      System.out.println("Match: " + mat.group());
      System.out.println("Index start: " + mat.start());// [
      System.out.println("Index end: " + mat.end());// )
      System.out.println();
    }
  }
}
