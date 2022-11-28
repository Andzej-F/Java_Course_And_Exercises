package codewars;

import java.util.Arrays;

/* source: https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string, the longest possible, containing
distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" */
public class TwoToOne {
  public static String longest(String s1, String s2) {
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] letters = s1.concat(s2).split("");
    String result = "";

    Arrays.sort(letters);

    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < letters.length; j++) {
        if (letters[j].equals(alphabet[i])) {
          result += alphabet[i];
          break;
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
//    System.out.println(TwoToOne.longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
  }
}

/* Other solutions

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted()
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    }
}


public class TwoToOne {

     public static String longest (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String all = "abcdefghijklmnopqrstuvwxyz";
        return all.replaceAll("[^" + s1+s2 + "]", "");
    }
}
 */