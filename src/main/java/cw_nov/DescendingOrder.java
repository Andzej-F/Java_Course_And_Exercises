package cw_nov;

/*
source:
https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

Your task is to make a function that can take any non-negative
integer as an argument and return it with its digits in descending
order. Essentially, rearrange the digits to create the highest possible
number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321

 */

import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int orgNumber = num;
    int counter = 0;

    // Get a number of digits
    while (orgNumber > 0) {
      orgNumber /= 10;
      counter++;
    }

    // Convert number to integer array
    orgNumber = num;
    int[] numbers = new int[counter];
    for (int i = 0; i < counter; i++) {
      numbers[i] = orgNumber % 10;
      orgNumber /= 10;
    }

    // Apply sort array function
    Arrays.sort(numbers);

    int reversedNumber = 0;
    for (int i = counter - 1; i >= 0; i--) {
      reversedNumber += numbers[i] * Math.pow(10, i);
    }

    return reversedNumber;
  }

  public static void main(String[] args) {
    System.out.println(sortDesc(42145));// 54421
    System.out.println(sortDesc(145263));// 654321
    System.out.println(sortDesc(123456789));// 987654321
  }
}
/* Other solutions:

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}



import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
}
 */