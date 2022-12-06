package cw_dec;

import java.util.Arrays;

/* Find the odd int
source: https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

239 -> 292
 */
public class FindOdd {

  public static int findIt(int[] a) {

    return 5;
  }

  public static void main(String[] args) {
    int[] array1 = {0, 1, 0, 1, 0};// 0
    int[] array2 = {3, 3, 4};// 4
    int[] array3 = {5, 5, 7, 7, 7};// 0
    int[] array4 = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};//
    int[] array5 = {14};//
//    System.out.println(findIt(array1));//0
//    System.out.println(findIt(array2));// 4
//    System.out.println(findIt(array3));// 7
//    System.out.println(findIt(array4));// 7
//    System.out.println(findIt(array5));// 7

    // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
//    1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
//      2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
    for (int i = 1; i < 100; i++) {
      int counter = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          counter++;
        }
      }
      if (counter < 3) {
        System.out.print(i + " ");
      }
    }

  }
}