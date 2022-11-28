package cw_nov;

import java.util.Arrays;

/* An anagram is the result of rearranging the letters of a
word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments
given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK" */
public class Anagram {
  public static boolean isAnagram(String test, String original) {
    char[] testLetters = test.strip().toLowerCase().toCharArray();
    char[] originalLetters = original.strip().toLowerCase().toCharArray();

    Arrays.sort(testLetters);
    Arrays.sort(originalLetters);
    return Arrays.equals(testLetters, originalLetters);
  }
}
