package _5_Numbers;

/* 65. Coding Exercise: Calculating Centripetal Force */

/* A ball has a mass of 0.2 kg. It moves around a circular path
   of a radius 80 cm. Calculate the centripetal force given that it
   completes 1 round every 3 seconds

   Solution:
   Mass of the ball = 0.2 kg
   Radius of the path = 0.8 m

   Path velocity (2*PI*radius)/time

   Centripetal Acceleration: a = v^2/r

   Centripetal Force F=ma;
   */

public class CentripetalForce {
  public static void main(String[] args) {
    System.out.println(calcCentripetalForce(0.2, 0.8, 3));
  }

  private static double calcPathVelocity(double radius, double period) {
    return (2 * Math.PI * radius) / period;
  }

  private static double calcCentripetalAcceleration(double radius, double velocity) {
    return (Math.pow(velocity, 2)) / radius;
  }

  private static double calcCentripetalForce(double mass, double acceleration) {
    return mass * acceleration;
  }

  public static double calcCentripetalForce(double mass, double radius, double period) {
    double velocity = calcPathVelocity(radius, period);
    double acceleration = calcCentripetalAcceleration(radius, velocity);
    return calcCentripetalForce(mass, acceleration);
  }
}
