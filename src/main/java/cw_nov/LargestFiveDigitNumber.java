package cw_nov;
/* source: https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java
In the following 6 digit number: 283910
91 is the greatest sequence of 2 consecutive digits.

In the following 10 digit number: 1234567890
67890 is the greatest sequence of 5 consecutive digits.

Complete the solution so that it returns the greatest sequence
of 5 consecutive digits found within the number given.
The number will be passed in as a string of only digits. It should
return a five digit integer. The number passed may be as large as 1000 digits.

Adapted from ProjectEuler.net */

import java.math.BigDecimal;

public class LargestFiveDigitNumber {
  public static int solve(final String digits) {
    BigDecimal maxValue = BigDecimal.ZERO;
    for (int i = 0; i <= digits.length() - 5; i++) {
      String numberText = digits.substring(i, i + 5);
      BigDecimal decimal = new BigDecimal(numberText);
      maxValue = maxValue.max(decimal);
    }

    return maxValue.intValue();
  }

  public static void main(String[] args) {
    System.out.println("result:");
    System.out.println(solve("731674765"));// 74765
  }
}
