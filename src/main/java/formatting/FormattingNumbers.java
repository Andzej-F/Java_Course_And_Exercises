package formatting;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbers {
  public static void main(String[] args) {
    /*
    double number = 1240.35;

    NumberFormat usnf = NumberFormat.getInstance(new Locale("en", "US"));
    NumberFormat sknf = NumberFormat.getInstance(new Locale("sk", "SK"));
    NumberFormat dknf = NumberFormat.getInstance(new Locale("da", "DK"));
    NumberFormat frnf = NumberFormat.getInstance(new Locale("fr", "FR"));
    String usval = usnf.format(number);
    String skval = sknf.format(number);
    String dkval = dknf.format(number);
    String frval = frnf.format(number);

    System.out.println(usval); // 1,240.35
    System.out.println(skval); // 1�240,35
    System.out.println(dkval); // 1.240,35
    System.out.println(frval); // 1?240,35
    */

    /*              Number Formatting in Java
    source: https://www.baeldung.com/java-number-formatting

            2. Basic Number Formatting With String#format
    double value = 4.2352989244d;
    System.out.println(String.format("%.2f", value));// 4.24
    System.out.println(String.format("%.3f", value));// 4.235
     */

    /*      3. Decimal Formatting by Rounding

    double value = 4.2352989244d;
    System.out.println(withBigDecimal(value, 2));// 4.24
    System.out.println(withBigDecimal(value, 3));// 4.235

    System.out.println(Math.round(4.2352989244d * 100));// 424
    System.out.println(withMathRound(value, 2));// 4.24
    System.out.println(withMathRound(value, 3));// 4.235

    System.out.println(withMathRound(1000.0d, 17));// 92.23372036854776

    for (int i = 1; i <= 20; i++) {
      System.out.println("Places: " + i + " result: " + withMathRound(1000.0d, i));// 1000.0
    }
       Output:
    Places: 1 result: 1000.0
    Places: 2 result: 1000.0
    Places: 3 result: 1000.0
    Places: 4 result: 1000.0
    Places: 5 result: 1000.0
    Places: 6 result: 1000.0
    Places: 7 result: 1000.0
    Places: 8 result: 1000.0
    Places: 9 result: 1000.0
    Places: 10 result: 1000.0
    Places: 11 result: 1000.0
    Places: 12 result: 1000.0
    Places: 13 result: 1000.0
    Places: 14 result: 1000.0
    Places: 15 result: 1000.0
    Places: 16 result: 922.3372036854776
    Places: 17 result: 92.23372036854776
    Places: 18 result: 9.223372036854776
    Places: 19 result: 0.9223372036854776
    Places: 20 result: 0.09223372036854775


    System.out.println(withMathRound(260.775d, 2)); // 260.77
  }

  public static double withBigDecimal(double value, int places) {
    BigDecimal bigDecimal = new BigDecimal(value);
    bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
    return bigDecimal.doubleValue();
  }

  public static double withMathRound(double value, int places) {
    double scale = Math.pow(10, places);// 10^2==100
    return Math.round(value * scale) / scale;// 4.2352989244d * 100/100=4.24
   */

    /* 4. Formatting Different Types of Numbers
         4.1. Formatting Large Integers With Commas
    int value = 123456789;

    System.out.println(withLargeIntegers(value));// 123,456,789
  }

  public static String withLargeIntegers(double value) {
    DecimalFormat df = new DecimalFormat("###,###,###");
    return df.format(value);
  }
  */

    /* 4.2. Padding a Number   */
    int value = 1;

    System.out.println(byPaddingZeros(value, 3));// 001
  }

  public static String byPaddingZeros(int value, int paddingLength) {
    return String.format("%0" + paddingLength + "d", value);
  }
}