package _5_Numbers;

/*
4. Imagine you’ve been given data representing how long items have sat in
a warehouse. Your job is to categorize them by time in the warehouse.
Items can be classified as 0, 1, 2 or 3.
Class 0 = 0 - 89 days
Class 1 = 90-179 days,
Class 2 = 180-269 days,
Class 3 = 270-364 days.

For the given warehouse wait times: 13, 49, 90, 130, 175, 181, 255, 310, 330, 359,
•write a class similar to Exercise 3 above,
•that has a next() method that can be called 10 times
•this method outputs a number representing the classification of each number in
the set of ages above.

Example:
•an item waiting for 5 days would return 0
•an item waiting 92 days would return 1.
A: Warehouse */
public class Warehouse {
  private int[] days = {13, 49, 90, 130, 175, 181, 255, 310, 330, 359};
  //                       0   0   1    1    1    2    2    3    3    3
  private int index = 0;

  private int next1() {
    int day = days[index++];
    if (day <= 89 && day >= 0) {
      return 0;
    } else if (day >= 90 && day <= 179) {
      return 1;
    } else if (day >= 180 && day <= 269) {
      return 2;
    } else if (day >= 270 && day <= 364) {
      return 3;
    }

    return -1;
  }

  private int next2() {
    int day = days[index++];
    if (day <= 89) return 0;
    if (day <= 179) return 1;
    if (day <= 269) return 2;
    if (day <= 364) return 3;

    return -1;
  }


  public static void main(String[] args) {
    Warehouse warehouse1 = new Warehouse();
    Warehouse warehouse2 = new Warehouse();

    long startTime1 = System.nanoTime();
    for (int j = 0; j < warehouse1.days.length; j++) {
      System.out.print(warehouse1.next1() + " ");
    }
    long stopTime1 = System.nanoTime();
    System.out.println("next1() execution time: " + (stopTime1 - startTime1));


    long startTime2 = System.nanoTime();
    for (int j = 0; j < warehouse2.days.length; j++) {
      System.out.print(warehouse2.next2() + " ");
    }
    long stopTime2 = System.nanoTime();
    System.out.println("next2() execution time: " + (stopTime2 - startTime2));
  }
}
