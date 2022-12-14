package _8_more_oop;

/* 4. Write a method that takes an input of 1 lowercase letter (and only 1 letter),
like a - b - c - z, etc., and returns that letter’s ordinal position in the alphabet,
i.e. a = 1, b = 2, c = 3… z = 26. Do NOT use any conditionals (if/then/else/switch/etc.).
Do not use an array. Write unit tests to test out the following inputs: a, z, w, f, c, h
- which should return: 1, 26, 23, 6, 3, 8 respectively */
public class Exercise4 {
  public int getOrdinal(String letter) {
    return Alphabet.valueOf(letter.toUpperCase()).ordinal() + 1;
  }

  public static void main(String[] args) {
    Exercise4 obj = new Exercise4();
    System.out.println(obj.getOrdinal("a"));
    System.out.println(obj.getOrdinal("b"));
    System.out.println(obj.getOrdinal("c"));
  }
}
