package _4_Regular_Expressions;

public class Exercises {
  /* Regular Expressions
        Supplemental on Regex
                Backreferences
Java Regular Expressions also support backreferences. This is a capability
of a regex to refer back to a capture group from earlier in the expression.
For example - if given a string:
“aaabbb12345cccdddzzz12345”
We could write a regex that matches the same sequence of numbers like so:
“[a-z]+(\\d{5})[a-z]+\\1”
Where:
“[a-z]+” matches “aaabbb”
“(\\d{5})” matches “12345” AND is stored in reference #1
“[a-z]+” also matches “cccdddzzz”
“\\1” refers back to capture group #1 which is “12345”
We can also use named capture groups with backreferences like so:
“[a-z]+(?<nums>\\d{5})[a-z]+\\k<nums>”
Note the use of “\\k<nums>” to refer back to the named capture group of “nums”.
Be sure to include the “k” in “\\k” to indicate you’re backreferencing a named group.


            Exercises
1. Write a regex that would match the following words: Dark, bark, Lark
1. For extra challenge, could you additionally make it match: stark
2. Use capture groups to write a regex that could match: Abracadabra or Agracadagra
3. How can you use parentheses in a regex for grouping but without capturing?
4. Write a regex that tests whether a String is an address and allows you to
extract the parts (your choice for address format).
5. Write a regex that tests whether a String is an email address.
1. Note: Doing this in regex is actually notoriously difficult to comply
with ALL the ways an email address can be written. However, you can just do
the simplest form of email address you can think of, such as: first.last@domain.com
 */

  public static void main(String[] args) {
   /*
   1. Write a regex that would match the following words: Dark, bark, Lark
    1. For extra challenge, could you additionally make it match: stark
    String regex = "\\w{1,2}ark";

//    Pattern pat = Pattern.compile(regex);
//    Matcher mat = pat.matcher(text);

    System.out.println("Dark".matches(regex1));// true
    System.out.println("bark".matches(regex1));// true
    System.out.println("Lark".matches(regex1));// true
    System.out.println("stark".matches(regex1));// true
    */

    /*
    2. Use capture groups to write a regex that could match:
    Abracadabra or Agracadagra

    String regex = "A[b,g]racada[b,g]ra";
    System.out.println("Abracadabra".matches(regex));// true
    System.out.println("Agracadagra".matches(regex));// true
     */

    /*
    3. How can you use parentheses in a regex for grouping but without capturing?
    A: (?: )
    */

    /*
    4. Write a regex that tests whether a String is an address and allows you to
       extract the parts (your choice for address format).

    String address = "12345 Funny St., Big City, NY 90210";
    String regex = """
            (?<houseNumber>^\\d+)\\s
            (?<street>[A-Z][a-z]+\\s[A-Z][a-z].),\\s
            (?<city>[A-Z][a-z]+\\s[A-Z][a-z]+),\\s
            (?<state>[A-Z]{2})\\s
            (?<postalCode>\\d+)$
            """;
    // houseNumber
    // street
    // city
    // state
    // postalCode
    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS | Pattern.DOTALL);
    Matcher mat = pat.matcher(address);

    if (mat.matches()) {
      System.out.println(mat.group("houseNumber"));
      System.out.println(mat.group("street"));
      System.out.println(mat.group("city"));
      System.out.println(mat.group("state"));
      System.out.println(mat.group("postalCode"));
    }
     */

    /*
    5. Write a regex that tests whether a String is an email address.
      1. Note: Doing this in regex is actually notoriously difficult to comply
      with ALL the ways an email address can be written. However, you can just do
      the simplest form of email address you can think of, such as:
      first.last@domain.com
    String emailAddress = "first.last@domain.com";
    String regex = "\\w+.\\w+@[a-z]+.com"; // true

    System.out.println(emailAddress.matches(regex));// true
    */
  }
}
