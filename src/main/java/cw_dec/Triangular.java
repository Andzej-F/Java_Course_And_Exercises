package cw_dec;

/* Triangular Treasure
https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java

Triangular numbers are so called because of the equilateral triangular
shape that they occupy when laid out as dots. i.e.

1st (1)   2nd (3)    3rd (6)
*          **        ***
           *         **
                     *
You need to return the nth triangular number. You should return 0 for
out of range values:

For example: (Input --> Output)

0 --> 0
2 --> 3
3 --> 6
-10 --> 0
 */
public class Triangular {
  public static long triangular(long n) {
    long result = 0L;

    if (n > 0L) {
      for (long i = 1L; i <= n; i++) {
        result += i;
        System.out.println(result);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(triangular(2));
  }
}
