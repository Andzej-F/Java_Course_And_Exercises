package baeldung;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecDemo {

  public static void main(String[] args) {
    /* 2. BigDecimal  */

    /* We can create a BigDecimal object from:
     • String
     • character array
     • int
     • long
     • BigInteger
     • double
    BigDecimal bdFromString = new BigDecimal("0.1");
    BigDecimal bdFromCharArray = new BigDecimal(new char[]{'3', '.', '1', '6', '1', '5'});
    BigDecimal bdFromInt = new BigDecimal(42);
    BigDecimal bdFromLong = new BigDecimal(123412345678901L);
    BigInteger bigInteger = BigInteger.probablePrime(4, new Random());
    BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);
    BigDecimal bdFromDouble = new BigDecimal(0.1d);

    System.out.println(bdFromString);// 0.1
    System.out.println(bdFromCharArray);// 3,1615
    System.out.println(bdFromInt);// 42
    System.out.println(bdFromLong);// 123412345678901
    System.out.println(bigInteger);// 11 == 1011 || 13 == 1101
    System.out.println(bdFromBigInteger);// 11 || 13
    System.out.println(bdFromDouble);// 0.1000000000000000055511151231257827021181583404541015625
     */

    /* In addition, we can convert double and long to BigDecimal using
       the valueOf static method:
    BigDecimal bdFromLong1 = BigDecimal.valueOf(123412345678901L);
    BigDecimal bdFromLong2 = BigDecimal.valueOf(123412345678901L, 2);
    BigDecimal bdFromDouble2 = BigDecimal.valueOf(0.2d);

    System.out.println(bdFromLong1);// 123412345678901
    System.out.println(bdFromLong2);// 1234123456789.01
    System.out.println(bdFromDouble2);// 0.2
     */

    /* 3. Operations on BigDecimal
    Just like the other Number classes (Integer, Long, Double etc.),
    BigDecimal provides operations for:
    • arithmetic operations
    • comparison operations
    • scale manipulation
    • rounding
    • format conversion

    It does not overload the the:
    • arithmetic (+, -, /, *)
    • logical (>. < etc)
    operators. Instead, we use the corresponding methods
    • add, subtract, multiply, divide
    • compareTo
*/
    /*
    BigDecimal has methods to extract various attributes, such as:
    • precision
    • scale
    • sign
    BigDecimal bd = new BigDecimal("-12345.6789");
    System.out.println(bd.precision());// 9
    System.out.println(bd.scale());// 4
    System.out.println(bd.signum());// 4
    */

    /* We compare the value of two BigDecimals using the compareTo method
      This method ignores the scale while comparing.
    BigDecimal bd1 = new BigDecimal("1.0");
    BigDecimal bd2 = new BigDecimal("1.00");
    BigDecimal bd3 = new BigDecimal("2.0");

    System.out.println(bd1.compareTo(bd3));// -1
    System.out.println(bd3.compareTo(bd1));// 1
    System.out.println(bd1.compareTo(bd2));// 0

    System.out.println(bd1.equals(bd2));// false
    System.out.println(bd2.equals(bd3));// false
*/

    /* 4. Rounding and BigDecimal */

    BigDecimal bd = new BigDecimal("2.4");
    // Round to 1 digit using HALF_EVEN
    BigDecimal rounded = bd
            .round(new MathContext(1, RoundingMode.HALF_UP));
    System.out.println(rounded);// 2

  }
}
