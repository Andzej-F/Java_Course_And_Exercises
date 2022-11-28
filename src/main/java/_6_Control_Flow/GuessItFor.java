package _6_Control_Flow;
//                        87. "For" Loops

import java.util.Random;

public class GuessItFor {
  public static int MAX_ALLOWED_TRIES = 4;

  public static void main(String[] args) {
    int randomNum = new Random().nextInt(10) + 1;
    System.out.printf("Random number is %d.%n", randomNum);
    String guessedNumStr = null;
    int wrongGuessCount = 1;


    for (; wrongGuessCount <= MAX_ALLOWED_TRIES; wrongGuessCount++) {
      guessedNumStr = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
      if (guessedNumStr.matches("-?\\d{1,2}")) {// Check if the input contains a number
        int guessedNum = Integer.parseInt(guessedNumStr);

        if (guessedNum == randomNum) {
          String tryText = wrongGuessCount == 1 ? "try" : "tries";
          System.out.printf("The random number was %d, you got it in %d %s.%n",
                  randomNum, wrongGuessCount, tryText);
          break;
        } else {
          System.out.printf("Wrong number, try again!\n");
        }
      }
    }

    if (wrongGuessCount >= MAX_ALLOWED_TRIES) {
      System.out.printf("You have had %d incorrect guesses. The random number is %d." +
              "Ending program now.%n", --wrongGuessCount, randomNum);
    }
  }
}
