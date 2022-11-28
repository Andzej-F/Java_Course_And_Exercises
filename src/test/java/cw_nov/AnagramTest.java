package cw_nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @Test
  public void exampleTests() {
    Anagram anagram = new Anagram();

    assertEquals(true, anagram.isAnagram("foefet", "toffee"));
    assertEquals(true, anagram.isAnagram("Buckethead", "DeathCubeK"));
    assertEquals(true, anagram.isAnagram("Twoo", "Woot"));
    assertEquals(false, anagram.isAnagram("apple", "pale"));
  }

  @Test
  public void moreTests() {
    Anagram anagram = new Anagram();

    assertEquals(false, anagram.isAnagram("dumble", "bumble"));
    assertEquals(false, anagram.isAnagram("ound", "round"));
    assertEquals(false, anagram.isAnagram("apple", "pale"));
  }

}