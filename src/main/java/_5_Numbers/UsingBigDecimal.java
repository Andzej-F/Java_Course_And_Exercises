package _5_Numbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/* 67. Introducing BigDecimal */
public class UsingBigDecimal {
  public static void main(String[] args) {
    /*
    float num1 = 2.15f;
    float num2 = 1.10f;
    System.out.println(num1 - num2);// 1.0500001

    BigDecimal num3 = new BigDecimal("2.15");
    BigDecimal num4 = new BigDecimal("1.05");
    System.out.println(num3.subtract(num4)); // 1.10
     */

    /* 68. Using BigDecimal */
    /*
    System.out.println(new BigDecimal("0.5").add(new BigDecimal("5.0")));// 5.5
    System.out.println(new BigDecimal("0.5").subtract(new BigDecimal("5.0")));// -4.5
    System.out.println(new BigDecimal("0.5").multiply(new BigDecimal("5.0")));// 2.50
    System.out.println(new BigDecimal("0.5").divide(new BigDecimal("5.0")));// 0.1
//    System.out.println(new BigDecimal("0.5").divide(new BigDecimal("5.1")));// Exception in thread "main" java.lang.ArithmeticException

    MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
    System.out.println(new BigDecimal("0.5").divide(new BigDecimal("5.1"), mc));// 0.098039, precision 5 == 98039 ==significant numbers, excluding 0 (zeroes)

    System.out.println(new BigDecimal("49").sqrt(mc));// 7
    System.out.println(new BigDecimal("0.054798").sqrt(mc));// 0.23409

    System.out.println(new BigDecimal("7").max(new BigDecimal("13")));// 13
    System.out.println(new BigDecimal("-7").abs());// 7

    System.out.println(new BigDecimal("13").remainder(new BigDecimal("8")));// 5
    System.out.println(new BigDecimal("1").remainder(new BigDecimal("2")));// 1
    System.out.println(new BigDecimal("2").remainder(new BigDecimal("2")));// 0
    System.out.println(new BigDecimal("3").remainder(new BigDecimal("2")));// 1
    System.out.println(new BigDecimal("4").remainder(new BigDecimal("2")));// 0
    System.out.println(new BigDecimal("5").remainder(new BigDecimal("2")));// 1
     */

    /* 69. More on BigDecimal & BigInteger */
    /*
    BigDecimal num1 = new BigDecimal(3.14);
    BigDecimal num2 = new BigDecimal(3.14f);
    BigDecimal num3 = new BigDecimal(205);

    short myShort = 1234;
    BigDecimal num4 = new BigDecimal(myShort);

    byte myByte = 125;
    BigDecimal num5 = new BigDecimal(myByte);
    byte byteNbr1 = num5.byteValue();
    System.out.println(byteNbr1);// 100

    BigDecimal num6 = new BigDecimal("3.14");
    byte byteNbr2 = num6.byteValue();
    System.out.println(byteNbr2);// 3

    BigDecimal num7 = new BigDecimal("128");
    byte byteNbr3 = num7.byteValue();
    System.out.println(byteNbr3);// -128

    BigDecimal num8 = new BigDecimal("1024");
    System.out.println(num8.doubleValue());// 1024.0

    BigDecimal num9 = new BigDecimal("1024");
    String myString = num9.toString();
    System.out.println(myString);// 1024
     */

    BigInteger myInt = new BigInteger("1234567891234567891234567891213456");
    System.out.println(myInt);// 1234567891234567891234567891213456
    // 3.141592 -> 3141592
  }
}
