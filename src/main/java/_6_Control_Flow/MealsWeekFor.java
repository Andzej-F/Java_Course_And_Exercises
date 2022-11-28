package _6_Control_Flow;

/*
 4. •Use an array of days of the week,
    •enhanced ‘for-loop’
    •and if/else
     to create the following output.

We eat pot roast on Sunday
We eat spaghetti on Monday
We eat tacos on Tuesday
We eat chicken on Wednesday
We eat meatloaf on Thursday
We eat hamburgers on Friday
We eat pizza on Saturday

A: WeekMeals */

public class MealsWeekFor {
  public static void main(String[] args) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    for (String day : days) {
      if ("Sunday".equals(day)) {
        System.out.println("We eat pot roast on Sunday");
      } else if ("Monday".equals(day)) {
        System.out.println("We eat spaghetti on Monday");
      } else if ("Tuesday".equals(day)) {
        System.out.println("We eat tacos on Tuesday");
      } else if ("Wednesday".equals(day)) {
        System.out.println("We eat chicken on Wednesday");
      } else if ("Thursday".equals(day)) {
        System.out.println("We eat meatloaf on Thursday");
      } else if ("Friday".equals(day)) {
        System.out.println("We eat hamburgers on Friday");
      } else {
        System.out.println("We eat pizza on Saturday");
      }
    }
  }
}
