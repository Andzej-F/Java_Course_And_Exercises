package _6_Control_Flow;

/*
6. Repeat exercise #5 but use newer switch expression with as little repetition as possible.

Use:
• an array of days of the week
• enhanced ‘for-loop’
• newer switch/case

to create the following output:
1. We eat spaghetti on Monday
2. We eat tacos on Tuesday
3. We eat chicken on Wednesday
4. We eat meatloaf on Thursday
5. We eat hamburgers on Friday
6. We eat pizza on Saturday
7. We eat pot roast cream on Sunday

6.1. Add a private method that can capitalize the first letter of each word
of the meal. So, instead of “We eat spaghetti on Sunday”, it would print,
 “We eat Spaghetti on Sunday”. Do not just capitalize the meal names
 yourself. Let your new method do it for you.

6.2 Improve on 6.1 to make it smart enough to output: “We eat Pot Roast on
 Sunday”, i.e., it should capitalize each word of a multi-word meal name.
   */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MealsWeekSwitchNewer {

  private static String capitaliseMeal(String sentence) {
    Pattern pat1 = Pattern.compile("^We\\seat\\s");
    Matcher mat1 = pat1.matcher(sentence);
    mat1.find();
    int indexOne = mat1.end();
    String firstPart = sentence.substring(0, indexOne);

    Pattern pat2 = Pattern.compile("\\son\\s");
    Matcher mat2 = pat2.matcher(sentence);
    mat2.find();
    int indexTwo = mat2.start();

    String thirdPart = sentence.substring(indexTwo);
    String foodLowerCase = sentence.substring(indexOne, indexTwo);

    String foodUpperCase = "";

    String[] words = foodLowerCase.split("\\s");
    for (String word : words) {
      foodUpperCase += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
    }
    foodUpperCase = foodUpperCase.strip();

    return firstPart + foodUpperCase + thirdPart;
  }


  public static void main(String[] args) {
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    for (String day : weekdays) {
      switch (day) {
        case "Monday" -> System.out.println(capitaliseMeal("We eat spaghetti on Monday"));
        case "Tuesday" -> System.out.println(capitaliseMeal("We eat tacos on Tuesday"));
        case "Wednesday" -> System.out.println(capitaliseMeal("We eat chicken on Wednesday"));
        case "Thursday" -> System.out.println(capitaliseMeal("We eat meatloaf on Thursday"));
        case "Friday" -> System.out.println(capitaliseMeal("We eat hamburgers on Friday"));
        case "Saturday" -> System.out.println(capitaliseMeal("We eat pizza on Saturday"));
        case "Sunday" -> System.out.println(capitaliseMeal("We eat pot roast on Sunday"));
      }
    }

  }
}