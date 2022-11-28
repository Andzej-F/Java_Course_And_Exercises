package _6_Control_Flow;

/*
 2. Repeat all parts of exercise #1, but use ‘while-loop’ instead of
 ‘for-loop’ (where applicable).

1. Write a method in 4 lines of code (not including method name/signature
& curly braces) that outputs the days of the week, one per line, using
a regular ‘for-loop’ and an array.

  1.1 Do it again using the enhanced ‘for-loop’.
  1.2 Do it again but make every other output line fully capitalized.
Sunday
MONDAY
Tuesday
WEDNESDAY
etc…
  1.3. Do it again but use only 4 lines of code (not including method and curly
   braces of method. */
public class WeekDaysWhile {
  public static void main(String[] args) {
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday"};
    int counter = 0;

    while (counter < weekdays.length) {
      System.out.printf("%s ", weekdays[counter]);
      counter++;
    }

    System.out.println();
    counter = 0;

    while (counter < weekdays.length) {
      String output = counter % 2 == 0 ? weekdays[counter] : weekdays[counter].toUpperCase();
      System.out.printf("%s ", output);
      counter++;
    }

    System.out.println(0 % 2);// 0
    System.out.println(1 % 2);// 1
  }
}
