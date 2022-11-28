package cw_nov;

/*
source:
https://www.codewars.com/kata/5831c204a31721e2ae000294/train/java

When provided with a String, capitalize all vowels

For example:
Input : "Hello World!"
Output : "HEllO WOrld!"

Note: Y is not a vowel in this kata.
 */

public class ChangingLetters {
  public static String swap(String st) {
    for (int i = 0; i < 5; i++) {
      String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
      st = st.replace(vowels[i], vowels[i + 5]);
    }

    return st;
  }

  public static void main(String[] args) {
    System.out.println(ChangingLetters.swap("Hello World!"));
  }
}