package _8_more_oop;

/* 5. Write a method that does the opposite of #4 - taking a number, 1-26, and returns a
lowercase letter. 1 would return a, 2 = b, 26 = z, etc.
A: Exercise5 */
public class Exercise5 {
  public static String findLetterByNumber(int number) {
    String result = null;
    for (Alphabet letter : Alphabet.values()) {
      if ((letter.ordinal() + 1) == number) {
        result = letter.toString().toLowerCase();
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(findLetterByNumber(26));
    System.out.println(findLetterByNumber(27));
    System.out.println(findLetterByNumber(1));
  }
}
