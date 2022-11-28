package _4_Regular_Expressions;

public class Regex {
  public static void main(String[] args) {
//              42. ABCs of Regular Expressions: part 1
//    System.out.println("cat".matches("cat"));// true
//    System.out.println("Cat".matches("cat"));// false
//    System.out.println("cat".matches("Cat"));// false
//    System.out.println("Cat".toLowerCase().matches("cat"));// true
//
////    character ranges
//    System.out.println("Cat".matches("[cC]at"));// => c || C, true
//    System.out.println("cat".matches("[cC]at"));// => c || C, true
//    System.out.println("bat".matches("[bcC]at"));// => c || C || b, true
//    System.out.println("Dat".matches("[a-fA-F]at"));// true
//
//    System.out.println("cat".matches("[^c]at"));// => ! = c, false
//    System.out.println("lat".matches("[^a-z]at"));// false
//    System.out.println("Lat".matches("[^a-z]at"));// true


//              42. ABCs of Regular Expressions: part 2
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

//    System.out.println("Lat".matches("\\wat"));// true
//    System.out.println("-at".matches("\\wat"));// false
//    System.out.println("G_T".matches("\\w\\w\\w"));// true
//    System.out.println("456".matches("\\d\\d\\d"));// true
//    System.out.println("321-333-7652".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));// true
//    System.out.println("321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}"));// true
//    System.out.println("321.333.7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));// true
//    System.out.println("321.333.7652".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));// true
//    System.out.println("321   333 7652".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4}"));// true
//    System.out.println("321333 7652".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{4}"));// true
//    System.out.println("321333 7652".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}"));// true
//    System.out.println("321  333 7652".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}"));// false

//    System.out.println("321 333 7652".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,4}"));// true
//    System.out.println("321 333 7652".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,4}"));// true
//
//    System.out.println("321 333 7652".matches("(\\d{3}[-.\\s]?){2}\\d{3,4}"));// true
//    System.out.println("321 7652".matches("(\\d{3}[-.\\s]?){2}\\d{3,4}"));// false
//
//    System.out.println("321 7652".matches("(\\d{3}[-.\\s]?){1,2}\\d{3,4}"));// true
//    System.out.println("321 333 7652".matches("(\\d{3}[-.\\s]?){1,2}\\d{3,4}"));// true
//    System.out.println("333.7652".matches("(\\d{3}[-.\\s]?){1,2}\\d{3,4}"));// true
//
//    System.out.println("1.321.333.7652".matches("(1[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{3,4}"));// true
//    System.out.println("4.321.333.7652".matches("(1[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{3,4}"));// false
//    System.out.println("321.333.7652".matches("(1[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{3,4}"));// true


//                    44. Capture Groups: Part One
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

    /*
    String regex = "(1[-.\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{3,4}";
    String phoneNumber = "232.333.2365";
    System.out.println(phoneNumber.matches(regex));// true
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.println(mat.group(0)); // 232.333.2365
      System.out.println(mat.group(1)); // null
      System.out.println(mat.group(2)); // 333.
    }
*/

    /*
    String regex = "(1[-.\\s]?)?(\\d{3}[-.,\\s]?)(\\d{3}[-.,\\s]?)\\d{3,4}";
    String phoneNumber = "1.232.333.2365";
    System.out.println(phoneNumber.matches(regex));// true
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.println(mat.group(1)); // 1
      System.out.println(mat.group(2)); // 232.
      System.out.println(mat.group(3)); // 333.
    }
   */


//                    45. Capture Groups: Part Two
/*
    String regex = "((\\d{1,2})[-.\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{3,4})";
    String phoneNumber = "1.232.333.2365";
    System.out.println(phoneNumber.matches(regex));// true
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.println(mat.group(1)); // 1.
      System.out.format("Country code: %s\n", mat.group(2)); // Country code: 1
      System.out.println(mat.group(3)); // 232.
      System.out.format("Area code: %s\n", mat.group(4)); // Area code: 232
      System.out.println(mat.group(5)); // 333.
      System.out.format("Exchange: %s\n", mat.group(6)); // Exchange: 333
      System.out.format("Line number: %s\n", mat.group(7)); // Line number: 2365
    }
    */
//                    46. Named Capture Groups
//    \\w == a-zA-Z0-9_
//    \\d == 0-9
//    \\s == space
//    + == 1 or more
//    * == 0 or more
//    ? == 0 or 1
//    d{3,4} == 3 to 4 digits
//    d{3,} == >=3, at least 3 digits, no upper limit
//    (\\d{3}[-.\s]?){2} == match this pattern 2 times
//    (\\d{3}[-.\s]?){1,2} == match this pattern 1 or 2 times
//    (?:(\d{1,2})[-.\s]?) ?: == not remember/capture that group
//    \\( == escape opening parenthesis
    /*
    String regex = "(?:(\\d{1,2})[-.\\s]?)?(?:(\\d{3})[-.,\\s]?)(?:(\\d{3})[-.,\\s]?)(\\d{3,4})";
    String phoneNumber = "1.232.333.2365";
    System.out.println(phoneNumber.matches(regex));// true
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.format("Country code: %s\n", mat.group(1)); // Country code: 1
      System.out.format("Area code: %s\n", mat.group(2)); // Area code: 232
      System.out.format("Exchange: %s\n", mat.group(3)); // Exchange: 333
      System.out.format("Line number: %s\n", mat.group(4)); // Line number: 2365
    }
     */

    /*
    String regex = "(?:(?<countryCode>\\d{1,2})[-.\\s]?)?(?:(?<areaCode>\\d{3})[-.,\\s]?)(?:(?<exchange>\\d{3})[-.,\\s]?)(?<lineNumber>\\d{3,4})";
    String phoneNumber = "1.232.333.2365";
    System.out.println(phoneNumber.matches(regex));// true
    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.format("Country code: %s\n", mat.group("countryCode")); // Country code: 1
      System.out.format("Country code: %s\n", mat.group(1)); // Country code: 1
      System.out.format("Area code: %s\n", mat.group("areaCode")); // Area code: 232
      System.out.format("Exchange: %s\n", mat.group("exchange")); // Exchange: 333
      System.out.format("Line number: %s\n", mat.group("lineNumber")); // Line number: 2365
    }
*/

//                    47. Comments in Regular Expressions
    /*
    String regex = """
            # This is my regex to parse the parts of a phone number
            (?:(?<countryCode>\\d{1,2})[-.\\s]?)? #Gets country code
            (?:(?<areaCode>\\d{3})[-.,\\s]?) #Gets area code
            (?:(?<exchange>\\d{3})[-.,\\s]?) # Gets exchange number
            (?<lineNumber>\\d{3,4}) # Gets line number
            """;
    String phoneNumber = "1.232.333.2365";
    System.out.println(phoneNumber.matches(regex));// false
    // "I am good"
    // "I\\sam\\sgood" \\ use \\s instead of " " in Pattern.COMMENTS mode

    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.format("Country code: %s\n", mat.group("countryCode")); // Country code: 1
      System.out.format("Country code: %s\n", mat.group(1)); // Country code: 1
      System.out.format("Area code: %s\n", mat.group("areaCode")); // Area code: 232
      System.out.format("Exchange: %s\n", mat.group("exchange")); // Exchange: 333
      System.out.format("Line number: %s\n", mat.group("lineNumber")); // Line number: 2365
    }
*/

    //                    48. Wrapping Up Phone Number Parsing

    /*
    String regex = """
            # This is my regex to parse the parts of a phone number
            (?:(?<countryCode>\\d{1,2})[-.\\s]?)? #Gets country code
            (?:\\(?(?<areaCode>\\d{3})\\)?[-.,\\s]?) #Gets area code
            (?:(?<exchange>\\d{3})[-.,\\s]?) # Gets exchange number
            (?<lineNumber>\\d{3,4}) # Gets line number
            """;
    String phoneNumber = "1.(232).333-2365";
    System.out.println(phoneNumber.matches(regex));// false
    // "I am good"
    // "I\\sam\\sgood" \\ use \\s instead of " " in Pattern.COMMENTS mode

    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
    Matcher mat = pat.matcher(phoneNumber);

    if (mat.matches()) {
      System.out.format("Country code: %s\n", mat.group("countryCode")); // Country code: 1
      System.out.format("Country code: %s\n", mat.group(1)); // Country code: 1
      System.out.format("Area code: %s\n", mat.group("areaCode")); // Area code: 232
      System.out.format("Exchange: %s\n", mat.group("exchange")); // Exchange: 333
      System.out.format("Line number: %s\n", mat.group("lineNumber")); // Line number: 2365
    }
*/
  }
}