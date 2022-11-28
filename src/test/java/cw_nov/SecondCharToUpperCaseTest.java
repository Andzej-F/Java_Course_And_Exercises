package cw_nov;

import static org.junit.jupiter.api.Assertions.assertEquals;

import _7_Testing_Code.SecondCharToUpperCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondCharToUpperCaseTest {

  private SecondCharToUpperCase changer;

  @BeforeEach
  void setUp() {
    changer = new SecondCharToUpperCase();
  }

  @Test
  public void checkIfEverySecondCharIsUppercased() {
    assertEquals("cAt", changer.capitalizeSecondChar("cat"));
    assertEquals("aPpLe", changer.capitalizeSecondChar("apple"));

  }

  @Test
  public void checkIfSecondCharIsUppercased_withLeadingAndTrackingSpace() {
    assertEquals("cAt", changer.capitalizeSecondChar(" cat "));
    assertEquals("aPpLe", changer.capitalizeSecondChar(" apple "));
  }
}
