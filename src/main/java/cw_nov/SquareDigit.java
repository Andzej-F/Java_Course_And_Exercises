package cw_nov;

/*
   source: https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
   Welcome. In this kata, you are asked to square every digit
   of a number and concatenate them. For example, if we run 9119
   through the function, 811181 will come out, because 92 is 81
   and 12 is 1.

Note: The function accepts an integer and returns an integer */
public class SquareDigit {
  public int squareDigits(int n) {
    String number = Integer.toString(n);
    String newNumber = "";

    for (int i = 0; i < number.length(); i++) {
      String stringNumber = number.substring(i, i + 1);
      int intNumber = Integer.parseInt(stringNumber);
      String squareString = Integer.toString(intNumber * intNumber);
      newNumber += squareString;
    }

    return Integer.parseInt(newNumber);
  }

  public static void main(String[] args) {
    SquareDigit object = new SquareDigit();
    System.out.println(object.squareDigits(9119));// 811181
    System.out.println(object.squareDigits(25));// 811181
    System.out.println(object.squareDigits(242));// 811181
  }
}
