package cw_nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class XOTest {

  @Test
  public void EqualAmountofXAndO() {
    assertTrue(XO.getXO("xxxooo"));
    assertTrue(XO.getXO("xxxXooOo"));
  }

  @Test
  public void NoXAndO() {
    assertTrue(XO.getXO("zssddd"));
  }

  @Test
  public void DifferentAmountofXAndO() {
    assertFalse(XO.getXO("xxx23424esdsfvxXXOOooo"));
    assertFalse(XO.getXO("xXxxoewrcoOoo"));
    assertFalse(XO.getXO("XxxxooO"));
    assertFalse(XO.getXO("Xxxxertr34"));
  }
}
