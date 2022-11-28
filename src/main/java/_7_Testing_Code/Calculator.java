package _7_Testing_Code;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

// This class is a SUT == system under test
public class Calculator {
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public String calcAnnuity(String R, int t, String r, int n) {
    /* Ordinary Annuity(==renta roczna) (Sinking Fund)
       F = R*(((1+ r/n)^n*t - 1)/(r/n))       */

    // model r/n
    BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n));

    // model 1+ r/n
    BigDecimal b = BigDecimal.ONE.add(a);

    // model (1+ r/n)^n*t
    BigDecimal c = b.pow(n * t);

    // model (1+ r/n)^n*t - 1
    BigDecimal d = c.subtract(BigDecimal.ONE);

    // model ((1+ r/n)^n*t - 1)/(r/n)
    BigDecimal e = d.divide(a);

    // model F = R*(((1+ r/n)^n*t - 1)/(r/n))
    BigDecimal f = new BigDecimal(R).multiply(e);

    NumberFormat currencyInstanceUSA = NumberFormat.getCurrencyInstance(Locale.US);

//    System.out.println(currencyInstanceUSA.format(f)); // $184,664.43

    return currencyInstanceUSA.format(f);
  }
}
