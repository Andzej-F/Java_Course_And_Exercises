package cw_nov;

/*
source:
https://www.codewars.com/kata/6357825a00fba284e0189798/train/java

        The task
You have to make a program capable of returning the sum
of all the elements of a triangle with side of size n+1.

      The problem
Your solution has to support 0 ≤ n ≤ 10^6. Brute-forcing will not work!

      The definition
A triangle element aij = 2 * j + i + 1;
where:
• j is the row 
• i is the column
can be defined as

aij = 2 * j + i + 1 where 0 <= j <= i <=n

Examples
For n = 2:

1  2  3      \
   4  5       \__ 1+2+3+4+5+7 sums to: 22
      7       /
sum(2) = 22

For n = 3:

1  2  3  4   \
   4  5  6    \__ 1+2+3+4+4+5+6+7+8+10 sums to: 50
      7  8    /
        10   /
sum(3) = 50

*/

import java.math.BigDecimal;

public class TriangleSum {
  public static long getSum(int n) {
    long triangleSize = n + 1L;
//    long sum = 0L;
    BigDecimal sum = new BigDecimal("0");
    for (long j = 0L; j < triangleSize; j++) {
      for (long i = j; i < triangleSize; i++) {

//          sum = sum + 2 * j + i + 1;
        BigDecimal a = new BigDecimal("2").multiply(new BigDecimal(j));// model "(2 * j)"
        BigDecimal b = a.add(new BigDecimal(i));// model "(2 * j) + i"
        BigDecimal c = b.add(BigDecimal.ONE);// model "(2 * j + i) + 1
        sum = sum.add(c);// model "sum + (2 * j + i + 1)"
//        sum = sum + 2 * j + i + 1;
      }
    }
    return sum.longValue();
  }

  public static void main(String[] args) {

    TriangleSum triangle = new TriangleSum();
    System.out.println(triangle.getSum(2));// 22
    System.out.println(triangle.getSum(20));// 22
    System.out.println(triangle.getSum(200));// 22

    /*System.out.println(triangle.getSum(4));// 95
    System.out.println(triangle.getSum(5));// 161
    System.out.println(triangle.getSum(6));// 252
    System.out.println(triangle.getSum(7));// 372
    System.out.println(triangle.getSum(1000));// 669169501
    System.out.println(triangle.getSum(10000));// 666916695001
    System.out.println(triangle.getSum(100000));// 666691666950001
    System.out.println(triangle.getSum(1000000));//
*/

  }
}
// 191 ->