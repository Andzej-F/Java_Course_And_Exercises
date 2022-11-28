package _8_more_oop;

/*
 public enum WeekDays {
  SUNDAY("pot roast"),
  MONDAY("spaghetti"),
  TUESDAY("tacos"),
  WEDNESDAY("chicken"),
  THURSDAY("meatloaf"),
  FRIDAY("hamburgers"),
  SATURDAY("pizza");

 3. Write a method that takes the following input
String “friday, thursday, monday, saturday, tuesday”
and returns the following output String using an Enum like (print the output):
getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
Output: "hamburgers, meatloaf, spaghetti, pizza, tacos" */

public class Exercise3 {
  public String getMealsForDays(String days) {
    String[] daysArray = days.toUpperCase().split(", ");
    StringBuilder result = new StringBuilder();

    for (String day : daysArray) {
      String mealOfTheDay = WeekDays.valueOf(day).getMeal();
      result.append(mealOfTheDay).append(", ");
    }
    int index = result.lastIndexOf(",");
    result.delete(index, index + 1);

    return result.toString().strip();
  }

  public static void main(String[] args) {
    Exercise3 ex3 = new Exercise3();
    System.out.println(ex3.getMealsForDays("friday, thursday, monday, saturday, tuesday"));
    System.out.println(ex3.getMealsForDays("friday"));
  }


}
/*
Exception in thread "main" java.lang.IllegalArgumentException:
No enum constant _8_more_oop.WeekDays.HAMBURGERS
	at java.base/java.lang.Enum.valueOf(Enum.java:273)
	at _8_more_oop.WeekDays.valueOf(WeekDays.java:3)
	at _8_more_oop.Exercise3.main(Exercise3.java:30)*/