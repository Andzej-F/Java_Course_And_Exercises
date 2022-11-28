package cw_nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareDigitTest {


  @Test
  public void testSquaredigit() {
    SquareDigit obj = new SquareDigit();
    assertEquals(811181, obj.squareDigits(9119));
    assertEquals(425, obj.squareDigits(25));
    assertEquals(16, obj.squareDigits(4));
    assertEquals(1625, obj.squareDigits(45));
    assertEquals(4494981, obj.squareDigits(223239));
  }
}
/*
* import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareDigitTest {
    @Test
    public void test() {
      assertEquals(811181, new SquareDigit().squareDigits(9119));
      assertEquals(0, new SquareDigit().squareDigits(0));
    }

} */