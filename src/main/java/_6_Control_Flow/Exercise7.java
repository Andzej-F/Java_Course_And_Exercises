package _6_Control_Flow;

/* 7. Iterate over all the days of the week in an array and add up the total number of characters
in all the days of the week. E.g., “Sunday”=6, “Monday”=6, etc. therefore, answer should
be 50. */
public class Exercise7 {
  public static void main(String[] args) {
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int charSum = 0;

    for (String day : days) {
      charSum += day.length();
    }

    System.out.printf("result: %d", charSum);
  }
}
