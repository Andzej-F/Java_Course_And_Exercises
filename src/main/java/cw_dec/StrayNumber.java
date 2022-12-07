package cw_dec;

/* Find the stray number
https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

You are given an odd-length array of integers, in which all of them
are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)

Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3
[4, 7, 7, 7, 7] ==> 4
[7, 4, 4, 4, 4] ==> 7


 */
public class StrayNumber {
  static int stray(int[] numbers) {
    int firstNbr = 0;
    int secondNbr = 0;
    int sameNbr = 0;

    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] == numbers[i + 1]) {
        sameNbr = numbers[i];
      } else if (numbers[i] != numbers[i + 1]) {
        firstNbr = numbers[i];
        secondNbr = numbers[i + 1];
      }
    }

    return firstNbr != sameNbr ? firstNbr : secondNbr;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 1, 2};
    int[] arr2 = {17, 17, 3, 17, 17, 17, 17};
    int[] arr3 = {4, 7, 7, 7, 7};
    int[] arr4 = {7, 4, 4, 4, 4};
    System.out.println(stray(arr1));// 2
    System.out.println(stray(arr2));// 3
    System.out.println(stray(arr3));// 4
    System.out.println(stray(arr4));// 7
  }
}
/* Other solutions


class Solution {
  static int stray(int[] numbers) {
      4, 7, 7, 7, 7
      17, 17, 17, 3, 17, 17, 17
    if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
    if (4 != 7 && 4 != 7]) return 4; true
    if (17 != 17 && 17 != 17]) return 17; false

    for (int i : numbers) if (i != numbers[0]) return i;
    for (int i : numbers) if (17 != 17) return i;
    for (int i : numbers) if (17 != 17) return i;
    for (int i : numbers) if (17 != 17) return i;
    for (int i : numbers) if (3 != 17) return i;
    return 0;
  }
}

import java.util.*;

class Solution {
  static int stray(int[] numbers) {
    Arrays.sort(numbers);
            4, 7, 7, 7, 7
            17, 17, 17, 3, 17, 17, 17
    return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    return 4 == 7 ? 7 : 4;
    return 17 == numbers[1] ? numbers[numbers.length-1] : numbers[0];

  }
}


*/