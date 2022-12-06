package cw_dec;
/*    Beginner Series #3 Sum of Numbers

source: https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java

Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and
return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
(2, -5) --> -12 (-5 + (-4) + (-3) + (-2) +(-1) + 0 + 1 +2)
 */

public class SumOfNumbers {
  public int GetSum(int a, int b) {
    int result;
    if (a != b) {
      int sum = 0;
      int min = Math.min(a, b);
      int max = Math.max(a, b);
      for (int i = min; i <= max; i++) {
        sum += i;
      }
      result = sum;
    } else {
      result = a;
    }
    return result;
  }

  public static void main(String[] args) {
    SumOfNumbers ob = new SumOfNumbers();
    System.out.println(ob.GetSum(2, -5));
  }
}
/*
Other users' solutions

public class Sum
{
  public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
    return (2 - 5) * (Math.abs(2 + 5) + 1) / 2;// -3 * 8 / 2= -12
  }
}

public class Sum
  {
    public int GetSum(int a, int b) {
      int res = 0;
      for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
      for (int i = Math.min(2, -5); i <= Math.max(2, -5); i++) {
      for (int i = -5; i <= 2; i++) {
        res += i;
        res += 0+-5;
        res += -5+-4;
      }
      return a == b ? a : res;
    }
  }

*/