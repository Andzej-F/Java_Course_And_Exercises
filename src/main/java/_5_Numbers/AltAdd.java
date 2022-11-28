package _5_Numbers;

import java.math.BigDecimal;

/* 2. What’s an alternative way you could add 2 + 4 without using “+” symbol? */
public class AltAdd {
  public static void main(String[] args) {

//     Using Math.add
    int sum = Math.addExact(2, 4);
    System.out.println(sum);// 6

    // Using BigDecimal Class
    BigDecimal num1 = new BigDecimal(2);
    BigDecimal num2 = new BigDecimal(4);
    System.out.println(num1.add(num2));// 6
    /* 128 64 32 16 8 4 2 1
         0  0  0  0 0 0 1 0
         |
         0  0  0  0 0 1 0 0
         __________________
         0  0  0  0 0 1 0 1 == 2 + 4 == 6


    /* 128 64 32 16 8 4 2 1
         0  0  0  0 0 0 1 0
         |
         0  0  0  0 0 0 1 0
         __________________
         0  0  0  0 0 1 0 1 == 2 + 2 == 2

         You can use a logic OR operation.
In Java, this is the pipe symbol, “ | “.
2 + 4 is equivalent to:
2 | 4
Note: this only works for numbers
whose binary bit patterns don’t
overlap.

0 0 0 0 0 0 1 0 = 2
 OR
0 0 0 0 0 1 0 0 = 4
—————————
0 0 0 0 0 1 1 0 = 6


2 | 2 does not equal 2 + 2
0 0 0 0 0 0 1 0 = 2
 OR
0 0 0 0 0 0 1 0 = 2
—————————
0 0 0 0 0 0 1 0 = 2

         */
  }
}
