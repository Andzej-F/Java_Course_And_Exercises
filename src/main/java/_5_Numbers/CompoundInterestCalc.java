package _5_Numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/*            70. Coding Exercise: Calculating Compound Interest

Balance(Y) = P(1+r)^Y + c[((1+r)^Y-1)/r];

P == Principal
r == interest/return rate
Y == time in years
c == contribution amount

*/
public class CompoundInterestCalc {

  private static final NumberFormat mfDefault = NumberFormat.getCurrencyInstance();

  public static BigDecimal calculate(String principal, String rate, int period, String contribution) {
    // BigDecimal.ONE == new BigDecimal(1)

    BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate));// (1 + r)
    BigDecimal b = a.pow(period);// (1 + r)^Y
    BigDecimal c = b.subtract(BigDecimal.ONE);// ((1 + r)^Y)-1
    BigDecimal d = c.divide(new BigDecimal(rate));// ((1 + r)*Y)/r
    BigDecimal e = d.multiply(new BigDecimal(contribution));// c*[((1 + r)*Y)/r]
    BigDecimal f = (new BigDecimal(principal)).multiply(b);// P*((1 + r)^Y
    BigDecimal g = f.add(e);

    return g;
  }

  public static void main(String[] args) {
    BigDecimal balance = CompoundInterestCalc.calculate("10000.00",
            "0.08", 10, "1000");
    System.out.println(balance);// 36075.8124386377007104000000


    /* 71.                Formatting Numbers        */
    // mf == moneyFormatter
    NumberFormat mfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    NumberFormat mfJapan = NumberFormat.getCurrencyInstance(Locale.JAPAN);

    System.out.println(mfDefault.format(balance));// $36,075.81
    System.out.println(mfFrance.format(balance));// 36?075,81��
    System.out.println(mfJapan.format(balance));// ?36,076




    /*              72. Customizing Number Formatters
    DecimalFormat df1 = new DecimalFormat("#");
    System.out.println(df1.format(balance)); // 36076

    DecimalFormat df2 = new DecimalFormat("#.##");
    System.out.println(df2.format(balance)); // 36075.81

    DecimalFormat df3 = new DecimalFormat("$#,###.##");
    System.out.println(df3.format(balance)); // $36,075.81

    DecimalFormat df4 = new DecimalFormat("$#,###.##;$(#)");
    System.out.println(df4.format(balance.negate())); // $(36,075.81) , negative number

    DecimalFormat df5 = new DecimalFormat("$#,###.00");
    System.out.println(df5.format(balance)); //$36,075.81

    DecimalFormat pf = new DecimalFormat("#%");
    System.out.println(pf.format(0.08));// 8%
     */

    /*              73. Additional Ways to Format Numbers
    System.out.printf("%f%n", balance);// 36075.812439 ; %n == \n
    System.out.printf("%.2f%n", balance);// 36075.81
    System.out.printf("$%.2f%n", balance);// $36075.81
    System.out.printf("$%,.2f%n", balance);// $36,075.81
    System.out.printf("$%,(.2f%n", balance.negate());// $(36,075.81)
    System.out.printf("$%,(.2f%n", balance);// $36,075.81

//     printf("$%,(.2f%n") == format("$%,(.2f%n") == String.format("$%,(.2f%n")
    System.out.format("$%,(.2f%n", balance);// $36,075.81

    String myMoney = String.format("$%,(.2f%n", balance);
    System.out.println(myMoney); // $36,075.81
    */
  }
}