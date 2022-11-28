package _6_Control_Flow;

/*
5. Use:
    • an array of days of the week
    • enhanced ‘for-loop’
    • traditional switch/case

to create the following output:
1. We eat spaghetti on Monday
2. We eat tacos on Tuesday
3. We eat chicken on Wednesday
4. We eat meatloaf on Thursday
5. We eat hamburgers on Friday
6. We eat pizza on Saturday
7. We eat pot roast on Sunday

A: WeekMealsFor
*/
public class MealsWeekSwitchTrad {
  public static void main(String[] args) {
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    for (String day : weekdays) {
      switch (day) {
        case "Monday":
          System.out.println("We eat spaghetti on Monday");
          break;

        case "Tuesday":
          System.out.println("We eat tacos on Tuesday");
          break;

        case "Wednesday":
          System.out.println("We eat chicken on Wednesday");
          break;

        case "Thursday":
          System.out.println("We eat meatloaf on Thursday");
          break;

        case "Friday":
          System.out.println("We eat hamburgers on Friday");
          break;

        case "Saturday":
          System.out.println("We eat pizza on Saturday");
          break;

        case "Sunday":
          System.out.println("We eat pot roast on Sunday");
          break;
      }
    }
  }
}
