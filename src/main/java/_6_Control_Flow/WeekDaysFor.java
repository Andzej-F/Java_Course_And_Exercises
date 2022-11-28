package _6_Control_Flow;

/*
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
   braces of method.
    */
public class WeekDaysFor {
  public static void main(String[] args) {
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday"};

    for (int i = 0; i < weekdays.length; i++) {
      System.out.printf("%s%n", weekdays[i]);
    }

    System.out.println();

    // Using enhanced for-loop
    for (String day : weekdays) {
      System.out.printf("%s%n", day);
    }

    System.out.println();

    for (int i = 0; i < weekdays.length; i++) {
      String output = i % 2 == 1 ? weekdays[i].toUpperCase() : weekdays[i];
      System.out.printf("%s%n", output);
    }
  }
}
