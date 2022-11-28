package _8_more_oop;

/* 1. Use an Enum to model the days of the week and print them using a loop.
  1.1. Print them with the first letter capitalized (without changing the Enum constants).
  1.2. Alternate between printing the first letter capitalized or whatever letter is approximately
      in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
  1.3. Print 10 randomly-chosen days of the week */

import java.util.Random;

public class Exercise1 {
  // 1.
  public static void main(String[] args) {
    for (WeekDays day : WeekDays.values()) {
      System.out.println(day);
    }
    System.out.println("***********************");

    // 1.1.
    for (WeekDays day : WeekDays.values()) {
      String dayText = day.toString();
      System.out.println(dayText.substring(0, 1)
              + dayText.substring(1).toLowerCase());
    }
    System.out.println("***********************");

    // 1.2.
    int index = 0;
    for (WeekDays day : WeekDays.values()) {
      String dayText = day.toString().toLowerCase();

      if (index % 2 == 0) {
        System.out.println(dayText.substring(0, 1).toUpperCase()
                + dayText.substring(1));
      } else {
        int middle = dayText.length() / 2;
        String firstPart = dayText.substring(0, middle);
        String capitalLetter = dayText.substring(middle, middle + 1).toUpperCase();
        String remainder = dayText.substring(middle + 1);
        System.out.println(firstPart.concat(capitalLetter).concat(remainder));
      }
      index++;
    }
    System.out.println("***********************");

    // 1.3
    Random random = new Random(7);
    for (int i = 0; i < 10; i++) {
      int randomNbr = random.nextInt(7);
      System.out.println(WeekDays.values()[randomNbr]);
    }

  }
}