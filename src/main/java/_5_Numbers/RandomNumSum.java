package _5_Numbers;

import java.util.Random;

/*
5. Make a method, next(), that
•can be called 10 times
•generates a random integer between 0 & 10 (non-inclusive).
•keeps a running sum of all random numbers it generates
•return that sum each time
If first time next() is called, it generates 5, and second time it’s called
it generates 3, it should return 8 from the second call - for example.
A: RandomNumSum */
public class RandomNumSum {
  private int sum1 = 0;
  private int sum2 = 0;

  /* Random random = new Random();

      for (int i = 0; i < 10; i++) {
        System.out.print(random.nextInt(10) + " ");// 2 7 8 4 9 0 9 9 9 4 */
//  1. Using Math.random()
  private int next1() {
    int randomNumber = (int) (Math.random() * 10);
    System.out.println("Random number: " + randomNumber);
    this.sum1 += randomNumber;
    return this.sum1;
  }

  //  2. Using Random() class
  private int next2() {
    Random randomObj = new Random();
    int randomNumber = randomObj.nextInt(10);
    System.out.println("Random number: " + randomNumber);
    this.sum2 += randomNumber;

//    this.sum2 += new Random().nextInt(10);
    return this.sum2;
  }

  public static void main(String[] args) {
    RandomNumSum obj = new RandomNumSum();

    for (int i = 0; i < 10; i++) {
      System.out.println("Sum " + obj.next1() + "\n");
    }

    System.out.println("**************************************************");

    for (int i = 0; i < 10; i++) {
      System.out.println("Sum " + obj.next2() + "\n");
    }

  }
}
