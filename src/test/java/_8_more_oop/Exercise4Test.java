package _8_more_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {
  /* Write unit tests to test out the following inputs: a, z, w, f, c, h
- which should return: 1, 26, 23, 6, 3, 8 respectively */
  @Test
  public void returnLetterOrdinal() {
    Exercise4 object = new Exercise4();
    assertEquals(1, object.getOrdinal("a"));
    assertEquals(26, object.getOrdinal("z"));
    assertEquals(23, object.getOrdinal("w"));
    assertEquals(6, object.getOrdinal("f"));
    assertEquals(3, object.getOrdinal("c"));
    assertEquals(8, object.getOrdinal("h"));
  }

}