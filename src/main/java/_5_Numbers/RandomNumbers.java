package _5_Numbers;

import java.security.SecureRandom;
import java.util.Random;

/* 63. More on Random Numbers */
public class RandomNumbers {
  public static void main(String[] args) {
//    System.out.println(Math.random());// 0.0 <= result < 1.0
//    System.out.println((int) (Math.random() * 10));// 0 <= result <=9
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      System.out.print(random.nextInt(10) + " ");// 2 7 8 4 9 0 9 9 9 4
    }
    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.print(random.nextInt() + " "); // -1879396730 1421036838 -2034143053 63952170 -452696909 137940790 -894417726 -2004835653 1013731143 724951799
    }
    System.out.println();

    SecureRandom secRandom = new SecureRandom();
    for (int i = 0; i < 10; i++) {
      System.out.print(secRandom.nextInt(10) + " "); // 3 7 5 4 3 2 8 0 1 7
    }

    // Random & SecureRandom are more efficient that Math.random()
  }
}
