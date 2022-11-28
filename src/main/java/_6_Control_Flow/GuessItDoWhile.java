package _6_Control_Flow;

import java.util.Random;

public class GuessItDoWhile {
  public static int MAX_ALLOWED_TRIES = 4;

  public static void main(String[] args) {
    // Generate a random integer 1-10
    int randomNum = new Random().nextInt(10) + 1;
    System.out.printf("Random number is %d.%n", randomNum);
    String guessedNumStr = null;
    int wrongGuessCount = 1;

    do {
      guessedNumStr = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");

      // Check if the input contains a number
      if (guessedNumStr.matches("-?\\d{1,2}")) {
        int guessedNum = Integer.parseInt(guessedNumStr);

        if (guessedNum == randomNum) {
          String tryText = wrongGuessCount == 1 ? "try" : "tries";
          System.out.printf("The random number was %d, you got it in %d %s.%n",
                  randomNum, wrongGuessCount, tryText);
          return;
        } else if (wrongGuessCount >= MAX_ALLOWED_TRIES) {
          System.out.printf("You have had %d incorrect guesses. The random number is %d." +
                  "Ending program now.%n", wrongGuessCount, randomNum);
          return;
        } else {
          System.out.printf("Wrong number, try again!\n");
          wrongGuessCount++;
        }
      }
    } while (!"q".equals(guessedNumStr));

  }
}

// Cannot call method on a null object,
// e.g. guessesNumStr.equals("q") /// wrong, because we are calling equals method on null object
// "q".equals(guessesNumStr) // correct, because we are calling equals method on not null object -> "q"


// java -cp out\production\JavaCourse _6_Control_Flow.GuessIt
// Ctrl + C == stop from command line
// clear || cls == to clear console