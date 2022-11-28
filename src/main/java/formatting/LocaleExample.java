package formatting;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {
  public static void main(String[] args) {
    Locale deLocale = new Locale("de", "De");
    Locale usLocale = new Locale("en", "US");
    long number = 123456789L;
    NumberFormat denf = NumberFormat.getNumberInstance(deLocale);
    NumberFormat usnf = NumberFormat.getNumberInstance(usLocale);

    System.out.println(denf.format(number));// 123.456.789
    System.out.println(usnf.format(number));// 123,456,789


    Date now = new Date();
    DateFormat dedf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, deLocale);
    DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);

    System.out.println(dedf.format(now));// 25. Oktober 2022 um 18:58:39 OESZ
    System.out.println(usdf.format(now));// October 25, 2022 at 6:58:39 PM EEST

    // Using the Locale.Builder class
    Locale plLocale = new Locale.Builder().setLanguage("pl").setRegion("PL").build();
    NumberFormat plnf = NumberFormat.getNumberInstance(plLocale);

    System.out.println(plnf.format(number)); // 123�456�789

    DateFormat pldf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, plLocale);
    System.out.println(pldf.format(now));// 31 pa?dziernika 2022 00:56:31 EET

  }
}
