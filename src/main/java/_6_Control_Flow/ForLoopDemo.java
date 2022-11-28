package _6_Control_Flow;

//                  88. A Simpler "For" Loop
public class ForLoopDemo {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d ", i);
      sum += i;
    }

    System.out.printf("Sum of 1 to 10 is: %d%n", sum);
    System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
  }
}

