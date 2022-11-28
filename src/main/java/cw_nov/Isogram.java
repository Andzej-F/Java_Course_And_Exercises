package cw_nov;

/* An isogram is a word that has no repeating letters,
   consecutive or non-consecutive. Implement a function
   that determines whether a string that contains only
   letters is an isogram. Assume the empty string is an
   isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

 */

public class Isogram {
  public static boolean isIsogram(String str) {
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    str = str.toLowerCase();

    for (int i = 0; i < alphabet.length; i++) {
      char letter = alphabet[i];
      int counter = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == letter) {
          counter++;
        }

        if (counter == 2) {
          return false;
        }
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isIsogram("Dermatoglyphics"));// true
    System.out.println(isIsogram("aba"));// false
    System.out.println(isIsogram("moOse"));// false
  }
}
/* Other solutions:

public class Isogram {
  public static boolean  isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  }
}

class isogram {
    public static boolean isIsogram(String str) {
        return str.toLowerCase()
                  .chars()
                  .distinct()
                  .count() == str.length();
    }
}

 */