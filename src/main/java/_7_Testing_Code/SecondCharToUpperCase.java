package _7_Testing_Code;

/* 1. Use TDD to write tests and a SUT (system under test - the actual
implementing class) for a method that takes a String input and outputs
that same String with every other letter uppercase. For example, if you
enter “cat”, it returns “cAt”. If you enter “apple”, it returns “aPpLe”.
You should end up with two classes - a class with the new method in it,
and a class for the unit tests that test your new method. Your test class
should contain as many test methods as necessary to test the proper implementation. */

import java.util.Locale;

public class SecondCharToUpperCase {
  public String capitalizeSecondChar(String word) {
    word = word.strip();
    char[] letters = word.toCharArray();
    String changedWord = "";

    for (int i = 0; i < letters.length; i++) {
      if (i % 2 == 1) {
        letters[i] = (char) (letters[i] - 32);
      }
      changedWord += letters[i];
    }

    return changedWord;
  }
}
