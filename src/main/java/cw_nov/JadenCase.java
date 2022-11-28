package cw_nov;

/*
source: https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing
every word. For simplicity, you'll have to capitalize each word,
check out how contractions are expected to be in the example below.
Your task is to convert strings to how they would be written by Jaden
Smith. The strings are actual quotes from Jaden Smith, but they are not
capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {
  private String convertedSentence = null;

  public String toJadenCase(String phrase) {
    if (phrase != null && !phrase.isEmpty()) {
      String[] words = phrase.split("\\s");
      StringBuilder builder = new StringBuilder(phrase.length());
      this.convertedSentence = null;

      for (String word : words) {
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
        this.convertedSentence = builder.append(word).append(" ").toString().strip();
      }
    }

    return this.convertedSentence;
  }

  public static void main(String[] args) {
    JadenCase object = new JadenCase();
//    System.out.println(object.toJadenCase("How can mirrors be real if our eyes aren't real"));
    System.out.println(object.toJadenCase(""));// null
    System.out.println(object.toJadenCase(null));
    System.out.println(null == null);// true
  }
}

/* Other users' solutions

import java.lang.Character;

public class JadenCase {

  public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;

    char[] array = phrase.toCharArray();

    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }

    return new String(array);
  }
}
------------------------------------------

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

  public String toJadenCase(String phrase) {
      if (null == phrase || phrase.length() == 0) {
          return null;
      }

      return Arrays.stream(phrase.split(" "))
                   .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                   .collect(Collectors.joining(" "));
  }
}


 */