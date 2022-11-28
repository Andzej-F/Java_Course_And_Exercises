package codewars;

/* Check to see if a string has the same amount of 'x's and 'o's.
   The method must return a boolean and be case insensitive. The
   string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false */
public class XO {
  public static boolean getXO(String str) {
    int xCount = 0;
    int oCount = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i, i + 1).equalsIgnoreCase("x")) {
        xCount++;
      } else if (str.substring(i, i + 1).equalsIgnoreCase("o")) {
        oCount++;
      }
    }

    return xCount == oCount;
  }

  public static void main(String[] args) {
    System.out.println(XO.getXO("xxx23424esdsfvxXXOOooo"));
    System.out.println("xxx23424esdsfvxXXOOooo".toLowerCase());

    System.out.println("xxx23424esdsfvxXXOOooo".toLowerCase().
            replace("o", ""));

    System.out.println("xxx23424esdsfvxXXOOooo".toLowerCase().
            replace("x", ""));

    System.out.println("xxx23424esdsfvxXXOOooo".toLowerCase().
            replace("o", "").length());
    System.out.println("xxx23424esdsfvxXXOOooo".toLowerCase().
            replace("x", "").length());

    System.out.println("xxx23424esdsfvxXXOOooo".toLowerCase().chars().filter(ch -> ch == 'o').count());
  }
}

/*  Other solutions

public class XO {

  public static boolean getXO (String str) {
    str = str.toLowerCase();
    return str.replace("o","").length() == str.replace("x","").length();

  }
}
------------------------------------------------------------------------------

public class XO {

  public static boolean getXO (String str) {

        long countX = str.toLowerCase().chars().filter(ch -> ch =='x').count();
        long countO = str.toLowerCase().chars().filter(ch -> ch =='o').count();

        return (countO==countX);

  }
}

*/