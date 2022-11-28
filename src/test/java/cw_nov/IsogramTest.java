package cw_nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsogramTest {

  @Test
  public void testTrueConditions() {
    assertTrue(Isogram.isIsogram("Dermatoglyphics"));
    assertTrue(Isogram.isIsogram("isogram"));
    assertTrue(Isogram.isIsogram("thumbscrewjapingly"));
    assertTrue(Isogram.isIsogram(""));
  }

  @Test
  public void testFalseConditions() {
    assertFalse(Isogram.isIsogram("moose"));
    assertFalse(Isogram.isIsogram("isIsogram"));
    assertFalse(Isogram.isIsogram("aba"));
    assertFalse(Isogram.isIsogram("moOse"));
  }
}
