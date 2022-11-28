package _6_Control_Flow;

//     3. Do #2 again but use a ‘do-while-loop’. (No solutions provided for this one)
public class WeekDaysDoWhile {
  public static void main(String[] args) {
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday"};
    int counter = 0;

    do {
      System.out.printf("%s ", weekdays[counter]);
      counter++;
    } while (counter < weekdays.length);

    System.out.println();
    counter = 0;

    do {
      String output = counter % 2 == 0 ? weekdays[counter] : weekdays[counter].toUpperCase();
      System.out.printf("%s ", output);
      counter++;
    } while (counter < weekdays.length);

  }
}
