package _4_Regular_Expressions;

public class Regex2 {
  public static void main(String[] args) {
//                49. Additional Character Classes
//    \\w == a-zA-Z0-9_  word character
//    \\W == opposite to \\w, anything other than a word character
//    \\d == 0-9
//    \\D == non-digits
//    \\s == space character
//    \\S == non-space character
//    [-.\s]+ == 1 or more
//    [-.\s]* == 0 or more
//    [-.\s]? == 0 or 1
//    d{3,4} == 3 to 4 digits
//    d{3,} == >=3, at least 3 digits, no upper limit
//    (\\d{3}[-.\s]?){2} == match this pattern 2 times
//    (\\d{3}[-.\s]?){1,2} == match this pattern 1 or 2 times
//    (?:(\d{1,2})[-.\s]?) ?: == not remember/capture that group
//    \\( == escape opening parenthesis
//    . == any character (except \n and \r)
//    ^[abc] == beginning of line/string
//    $ == end of line/string
//    [^abc] == NOT a or b or c
//    \\b == boundary, matches area between word character and non-word character
//    *? == tell * not to be greedy
//    The metacharacters that we usually need to escape in this manner are:
//        <  ( [ { \ ^ - = $ ! | ] } ) ? * + . >

//    System.out.println("doggy".matches("."));// false
//    System.out.println("d".matches("."));// true
//    System.out.println("doggy".matches("....."));// true
//    System.out.println("doggy".matches(".+"));// true
//    System.out.println("doggy".matches(".*"));// true
//    System.out.println("doggy".matches("^.....$"));// true
    System.out.println("cat doggy".matches("...\\s\\b....."));// true
    System.out.println("cat".matches("\\W\\W\\W"));// false
    System.out.println("?%-".matches("\\W\\W\\W"));// true

    System.out.println("123".matches("\\D\\D\\D"));// false
    System.out.println("abc".matches("\\D\\D\\D"));// true

    System.out.println(" ".matches("\\s"));// true
    System.out.println(" ".matches("\\S"));// false
    System.out.println("".matches("\\S"));// false, because 0 characters, need 1 non-space character
    System.out.println(",".matches("\\S"));// true
  }
}