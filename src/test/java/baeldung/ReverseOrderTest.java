package baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOrderTest {

  @Test
  public void testReverseWordIsCorrectlyReversed() {
    ReverseOrder ob = new ReverseOrder();
    // A house of a rising sun.
    assertEquals("sun. rising a of house A", ob.reverseWords("A house of a rising sun."));
  }
}