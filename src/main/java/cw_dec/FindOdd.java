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

 0 1 2 3 4 5 6 7 8 9 0 1 2
[1,1,2,2,2,2,3,3,3,3,3,3,4] should return 4, because it appears 1 time (which is odd).

239 -> 292
 */
public class FindOdd {

  public static int findIt(int[] a) {
    int result = 0;
    String numbersString = "";
    int counter = 1;// count how many times a number appears in array
    int counterSum = 0;

    Arrays.sort(a);

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] != a[i + 1]) {
        String nbrText = Integer.toString(a[i]);
        String counterText = Integer.toString(counter);

        /* Represent result in a string pattern "number=>counter"*/
        numbersString += nbrText.concat("=>").concat(counterText).concat(" ");
        counterSum += counter;
        counter = 1;
      } else {
        counter++;
      }
    }

    /* Edge case: Find the occurrence(counter) of a last integer */
    System.out.println(counterSum);
    int lastNbr = a[a.length - 1];
    int lastNbrOccur = a.length - counterSum;

    numbersString += Integer.toString(lastNbr).concat("=>").concat(Integer.toString(lastNbrOccur));

    /* • iterate over outer String array
       • compare counter value agains the odd number
       • for odd number create an inner loop
       • once number is found, break of the loop
       • return an integer representaion of a String number
     */


    System.out.println(numbersString);

    return result;
  }

  public static void main(String[] args) {
//    int[] array1 = {0, 1, 0, 1, 0};// 0
//    int[] array2 = {3, 3, 4};// 4
    int[] array3 = {5, 5, 7, 7, 7, 8, 8};// 0
//    int[] array4 = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};//
//    int[] array5 = {14};//
//    System.out.println(findIt(array1));//0
//    System.out.println(findIt(array2));// 4
    System.out.println(findIt(array3));// 7
//    System.out.println(findIt(array4));// 7
//    System.out.println(findIt(array5));// 7
    System.out.println("miau");
  }
}