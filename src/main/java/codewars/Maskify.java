package codewars;

/*
source: https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java

Usually when you buy something, you're asked whether your credit card number,
phone number or answer to your most secret question is still correct. However,
since someone could look over your shoulder, you don't want that shown on your
screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last
four characters into '#'.

Examples
"4556364607935616" --> "############5616"
     "64607935616" -->      "#######5616"
               "1" -->                "1"
                "" -->                 ""

// "What was the name of your first pet?"

"Skippy" --> "##ippy"

"Nananananananananananananananana Batman!"
-->
"####################################man!" */

public class Maskify {
  public static String maskify(String str) {
    String maskedString = str;
    if (str.length() > 4) {
      int splitIndex = str.length() - 4;
      String partOne = str.substring(0, splitIndex);
      String partTwo = str.substring(splitIndex);
      maskedString = partOne.replaceAll(".", "#").concat(partTwo);
    }

    return maskedString;
  }
}

/* Other users' solutions

public class Maskify {
    public static String maskify(String str) {
    // match everything except for the last 4 symbols
        return str.replaceAll(".(?=.{4})", "#");
    }
}

public class Maskify {
  public static String maskify(String str) {
    char[] strChars = str.toCharArray();
    for( int i = 0; i < strChars.length - 4; i++ ) {
      strChars[i] = '#';
    }
    return new String(strChars);
  }
}

 */