package cw_dec;

/* Remove duplicate words
source: https://www.codewars.com/kata/5b39e3772ae7545f650000fc/train/java

Your task is to remove all duplicate words from a string,
leaving only single (first) words entries.

Example:

Input:

"alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"

Output:

'alpha beta gamma delta'
 */
public class RemoveDuplicate {
  public static String removeDuplicateWords(String s) {
    String[] words = s.split(" ");
    String result = "";

    for (String word : words) {
      if (!result.contains(word)) {
        result += word + " ";
      }
    }

    return result.strip();
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    System.out.println(removeDuplicateWords("my cat is fat"));
  }
}
/*
Other solutions:

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Solution{
    public static String removeDuplicateWords(String s){
        return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }
}

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution {

    public static String removeDuplicateWords(String s) {

        return String.join(" ", new LinkedHashSet<>(Arrays.asList(s.split(" "))));
    }
}

*/