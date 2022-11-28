package cw_nov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JadenCaseTest {

  private JadenCase sentence;

  @BeforeEach
  void setUp() {
    sentence = new JadenCase();
  }

  @Test
  public void nonEmptyStringInput() {
    assertEquals("How Can Mirrors Be Real If Our Eyes Aren't Real",
            sentence.toJadenCase("How can mirrors be real if our eyes aren't real"));
  }

  @Test
  public void emptyStringInput() {
    assertEquals(null, sentence.toJadenCase(""));
  }

  @Test
  public void nullInput() {
    assertEquals(null, sentence.toJadenCase(null));
  }
}
