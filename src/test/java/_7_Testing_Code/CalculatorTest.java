package _7_Testing_Code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  private Calculator calc;

  @BeforeEach
  void setUp() {
    calc = new Calculator();
  }

  @Test
  public void canAddZeroPlusZero() {
    int sum = calc.add(0, 0);

    // assertEquals(int expected, int actual, String message);
    assertEquals(0, sum, "Was expecting sum of 0");
  }

  @Test
  public void canAddOnePlusOne() {
    int sum = calc.add(1, 1);

    // assertEquals(int expected, int actual, String message);
    assertEquals(2, sum, "Was expecting sum of 2");
  }

  @Test
  public void annuityExample() {
    String answer = calc.calcAnnuity("22000", 7, "0.06", 1);
    assertEquals("$184,664.43", answer);
  }

  @Test
  public void annuityPractice2() {
    String answer = calc.calcAnnuity("1200", 10, "0.08", 4);
    assertEquals("$72,482.38", answer);
  }

}
