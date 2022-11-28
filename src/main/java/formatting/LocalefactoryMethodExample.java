package formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalefactoryMethodExample {
  public static void main(String[] args) {
    Locale usLocale = Locale.forLanguageTag("en-US");
    Locale deLocale = Locale.forLanguageTag("de-DE");
    Locale ltLocale = Locale.forLanguageTag("lt-LT");
    Locale kukuLocale = Locale.forLanguageTag("kuku-KUKU");

    long number = 123456789L;

    NumberFormat usnf = NumberFormat.getNumberInstance(usLocale);
    NumberFormat denf = NumberFormat.getNumberInstance(deLocale);
    NumberFormat ltnf = NumberFormat.getNumberInstance(ltLocale);
    NumberFormat kukunf = NumberFormat.getNumberInstance(kukuLocale);

    System.out.println(usnf.format(number)); // 123,456,789
    System.out.println(denf.format(number)); // 123.456.789
    System.out.println(ltnf.format(number));// 123�456�789
    System.out.println(kukunf.format(number)); // 123,456,789
  }
}
