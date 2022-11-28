package _5_Numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class InternalizationNumber {

  public static void printNumber(Locale locale) {
    double dbl = 105000.3245;
    NumberFormat formatter = NumberFormat.getNumberInstance();
    String number = formatter.format(dbl);
    System.out.println(number + " for the locale " + locale);
  }


  public static void main(String[] args) {
    printNumber(Locale.CANADA);// 105,000.325 for the locale en_CA
    printNumber(Locale.US);// 105,000.325 for the locale en_US
    printNumber(Locale.UK);// 105,000.325 for the locale en_UK
    printNumber(Locale.JAPAN);// 105,000.325 for the locale en_JP
  }
}
