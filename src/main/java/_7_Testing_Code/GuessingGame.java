package _7_Testing_Code;

import java.util.Random;

/*            98. Reimplementing the Guessing Game
  UI logic
  Game logic
*/
public class GuessingGame {

  private final int randomNumber = new Random().nextInt(10) + 1;
  private int counter = 0;

  public String guess(int guessedNumber) {
    counter++;
    String tryText = counter == 1 ? "try" : "tries";
    String winningMsg = String.format("You got it in %d %s", counter, tryText);
    String response;

    if (counter == 4 && guessedNumber != getRandomNumber()) {
      response = String.format("You didn't get it and you've had %d %s. Game over.", counter, tryText);
    } else if (counter > 4) {
      response = "Sorry, you are limited to only 4 tries. Game over.";
    } else {
      String losingMsg = guessedNumber > getRandomNumber() ? "high" : "low";
      String loseText = String.format("You didn't get it - you're too %s", losingMsg);
      response = guessedNumber == getRandomNumber() ?
              winningMsg : loseText;
    }

    return response;
  }

  public int getRandomNumber() {
    return randomNumber;//  1 ... 10
  }

  public static void main(String[] args) {
    GuessingGame game = new GuessingGame();
    boolean loopShouldContinue = true;

    do {
      String input = System.console().readLine("Enter a number ");
      if ("q".equals(input)) {
        return;
      }
      String output = game.guess(Integer.parseInt(input));
      System.out.println(output);
      if (output.contains("You got it") || output.contains("over")) {
        loopShouldContinue = false;
      }
    } while (loopShouldContinue);
  }

}

// java -cp out\production\JavaCourse _7_Testing_Code.GuessingGame
