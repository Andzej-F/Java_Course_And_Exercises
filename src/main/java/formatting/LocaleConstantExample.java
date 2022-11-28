package formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleConstantExample {
  public static void main(String[] args) {
    Locale usLocale = Locale.US;
    Locale deLocale = Locale.GERMANY;
    Locale jpLocale = Locale.JAPAN;
    long number = 123456789L;

    NumberFormat usnf = NumberFormat.getInstance(usLocale);
    NumberFormat denf = NumberFormat.getInstance(deLocale);
    NumberFormat jpnf = NumberFormat.getInstance(jpLocale);

    System.out.println(usnf.format(number));// 123,456,789
    System.out.println(denf.format(number));// 123.456.789
    System.out.println(jpnf.format(number));// 123,456,789
  }
}
