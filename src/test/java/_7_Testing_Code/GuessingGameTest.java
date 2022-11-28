package _7_Testing_Code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

  private static final int GAME_RANDOMNESS_RETRIES = 100;
  private GuessingGame game;

  @BeforeEach
  void setUp() {
    game = new GuessingGame();
  }

  @Test
  public void testSimpleWinSituation() {
    int randomNum = game.getRandomNumber();
    String message = game.guess(randomNum);
    assertEquals("You got it in 1 try", message);
  }

  @Test
  public void testOneWrongNegGuessSituation() {
    String message = game.guess(-5);
    assertEquals("You didn't get it - you're too low", message);
  }

  @Test
  public void testOneWrongPosGuessSituation() {
    int randomNum = game.getRandomNumber();
    String message = game.guess(randomNum + 1);
    assertEquals("You didn't get it - you're too high", message);
  }

  @Test
  public void testRandomNumberGeneration() {
    // 1  2  3  4  5  6  7  8  9  10
    // 1  1  1  1  0  1  0  1  1   1
    int[] randomNumCount = new int[11];
    for (int i = 0; i < GAME_RANDOMNESS_RETRIES; i++) {
      GuessingGame game = new GuessingGame();
      int randomNum = game.getRandomNumber();
      randomNumCount[randomNum] = 1;
    }

    int sum = 0;
    for (int number : randomNumCount) {
//      System.out.printf("%d ", number);
      sum += number;
    }

    assertEquals(10, sum);
  }

  @Test
  // 4 wrong guesses == game over
  public void testFourWrongGuesses() {
    // guess negative numbers
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    String message = game.guess(-3);
    assertEquals("You didn't get it ", message);
  }

  @Test
  public void testTenWrongGuesses() {
    // guess negative numbers
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    String message = game.guess(-3);
    assertEquals("Sorry, you are limited to only 4 tries. Game over.", message);
  }

  @Test
  public void testThreeWrongGuessesAndOneCorrect() {
    // guess negative numbers
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    int correctAnswer = game.getRandomNumber();
    String message = game.guess(correctAnswer);
    assertEquals("You got it in 4 tries", message);
  }

  @Test
  public void testTwoWrongGuessesAndOneCorrect() {
    // guess negative numbers
    game.guess(-3);
    game.guess(-3);
    int correctAnswer = game.getRandomNumber();
    String message = game.guess(correctAnswer);
    assertTrue(message.contains(" 3 "), "Should indicate 3 tries");
    assertTrue(message.contains("You got it"), "Should indicate we got the right number");
  }
}