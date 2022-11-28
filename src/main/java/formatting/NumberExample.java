package formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberExample {
  public static void main(String[] args) {
    double n = 225.813522;
    long x = 778552639;
    System.out.println("Formatting numbers according to different countries in the world");
    // create an instance for a particular locale/country.

    NumberFormat nfSwitz = NumberFormat.getInstance(new Locale("ch",
            "Switzerland"));
    System.out.println("Decimal separator Switzerland: "
            + nfSwitz.format(n));// 225.814
    System.out.println("Thousands separator Switzerland: "
            + nfSwitz.format(x)); // 778,552,639
    System.out.println();

    NumberFormat nfIndia = NumberFormat.getInstance(new Locale("in",
            "India"));
    System.out.println("Decimal separator India: "
            + nfIndia.format(n));// 225,814
    System.out.println("Thousands separator India: "
            + nfIndia.format(x));// 778.552.639
    System.out.println();

  }
}
