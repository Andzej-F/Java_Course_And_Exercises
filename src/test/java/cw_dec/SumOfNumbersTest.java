package cw_dec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

  @Test
  public void testSumBetweenTwoIntegers() {
    /*
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)*/
    SumOfNumbers ob = new SumOfNumbers();
    assertEquals(1, ob.GetSum(1, 0));
    assertEquals(3, ob.GetSum(1, 2));
    assertEquals(1, ob.GetSum(0, 1));
    assertEquals(1, ob.GetSum(1, 1));
    assertEquals(-1, ob.GetSum(-1, 0));
    assertEquals(2, ob.GetSum(-1, 2));
    assertEquals(-12, ob.GetSum(2, -5));
  }

}