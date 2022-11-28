package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaskifyTest {

  @Test
  public void testMaskify() {
    assertEquals("############5616", Maskify.maskify("4556364607935616"));
    assertEquals("#######5616", Maskify.maskify("64607935616"));
    assertEquals("1", Maskify.maskify("1"));
    assertEquals("", Maskify.maskify(""));
    assertEquals("##ippy", Maskify.maskify("Skippy"));
    assertEquals("####################################man!", Maskify.maskify("Nananananananananananananananana Batman!"));
  }
}
