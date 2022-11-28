package _5_Numbers;

import java.text.NumberFormat;
import java.util.Locale;

/* 6. Write a function that takes a String like “149.32” and formats it as
money for wherever you live. So, if you live in the United States, it would
return “$149.32”, Korea = ₩149, France/EU = 149,32 €, etc. */
public class FormatCurrency {

  private String formatValue(String price) {
    double value = Double.parseDouble(price);
    NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(new Locale("lt", "LT"));
    return moneyFormatter.format(value);

    // Terry's solution
//    return NumberFormat.getCurrencyInstance(new Locale("lt", "LT")).format(new BigDecimal(money));
  }


  public static void main(String[] args) {
    FormatCurrency obj = new FormatCurrency();
    System.out.println(obj.formatValue("149.32"));// 149,32��
  }
}
