package _5_Numbers;

/* 64. Coding Exercise: Calculating the Area of a Circle */
public class CircleArea {
  public static void main(String[] args) {
    System.out.println(calcAreaOfCircle(3));// 28.274333882308138
  }

  /**
   * This method calculates the area of a circle
   * It uses the formula: A = PI *radius^2
   *
   * @param radius
   * @return
   */
  public static double calcAreaOfCircle(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

}
