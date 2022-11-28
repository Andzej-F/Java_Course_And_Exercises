package cw_nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EndsWithTest {

  /*
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false); */

  @Test
  public void checkTrueIfFirstInputStringEndsWithSecondInputString() {
    assertTrue(EndsWith.solution("abc", "bc"));
    assertTrue(EndsWith.solution("bcabc", "bc"));
    assertTrue(EndsWith.solution("samurai", "ai"));
  }

  public void checkFalseIfFirstInputStringDoesNotEndWithSecondInputString() {
    assertFalse(EndsWith.solution("abc", "d"));
    assertFalse(EndsWith.solution("sumo", "omo"));
    assertFalse(EndsWith.solution("abc\n", "abc"));
  }

  @Test
  public void staticTests() {
    check("samurai", "ai", true);
    check("sumo", "omo", false);
    check("ninja", "ja", true);
    check("sensei", "i", true);
    check("samurai", "ra", false);
    check("abc", "abcd", false);
    check("abc", "abc", true);
    check("abcabc", "bc", true);
    check("ails", "fails", false);
    check("fails", "ails", true);
    check("this", "fails", false);
    check("this", "", true);
    check(":-)", ":-(", false);
    check("!@#$%^&*() :-)", ":-)", true);
    check("abc\n", "abc", false);
  }

  private static void check(String str, String ending, boolean expected) {
    boolean result = EndsWith.solution(str, ending);
    assertEquals(expected, result, "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
  }
}
