package _5_Numbers;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* 7. Write a function that takes a String input of “$12,345.83” and prints
out that value divided by 32.19. It should return $383.53. */
public class Exercise7 {

  /*
    public static void main(String[] args) {
      System.out.println(formatMoney("$12345.83"));
    }

    public static String formatMoney(String amount) {

      BigDecimal money = new BigDecimal(amount.substring(1));
      BigDecimal divisor = new BigDecimal("32.19");
      BigDecimal result = (money.divide(divisor, 2, RoundingMode.HALF_UP));

      return "$" + result.toString();
    }
  */
//   Terry's solution
  public static String calculate(String formattedMoney) throws ParseException {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    Number value = formatter.parse(formattedMoney); // 12345.83
    System.out.println(value);
    BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);
    // Used MathContext.DECIMAL32 above so I wouldn't have to create one myself. Chose 32
    // instead of the others, because it was the smallest one, in terms of precision.
    return formatter.format(result);
  }

  public static void main(String[] args) throws ParseException {
    System.out.println(calculate("$12,345.83"));
    System.out.println();
  }

}
