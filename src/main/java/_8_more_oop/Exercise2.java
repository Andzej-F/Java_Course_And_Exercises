package _8_more_oop;

/* 2. Write code to print the following using only an Enum & loop
 without using any conditionals (if/else/switch/etc.)
We eat pot roast on Sunday
We eat spaghetti on Monday
We eat tacos on Tuesday
We eat chicken on Wednesday
We eat meatloaf on Thursday
We eat hamburgers on Friday
We eat pizza on Saturday

2.1 Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.
(No solution provided because you’ve done this before in earlier exercise - but try to do
it without looking at previous work - for practice) */
public class Exercise2 {

  public static void main(String[] args) {
    // 2.
    for (WeekDays day : WeekDays.values()) {
      System.out.printf("We eat %s on %s%n", day.getMeal(), capitalise(day.name()));
    }
    System.out.println("********************");

    // 2.1
    for (WeekDays day : WeekDays.values()) {
      System.out.printf("We eat %s on %s%n", capitalise(day.getMeal()), capitalise(day.name()));
    }
  }

  private static String capitalise(String text) {
    text = text.toLowerCase();
    String[] words = text.split(" ");
    String result = "";

    for (String word : words) {
      result += word.substring(0, 1).toUpperCase().concat(word.substring(1)).concat(" ");
    }

    return result.strip();
  }
}
