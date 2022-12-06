package cw_dec;

public class FindOdd2 {
  // 1,2,2,3,3,3,4,3,3,3,2,2,1
  // step 1.    0 ^ 1 = 1    // 1
  // step 2.    1 ^ 2 = 3    // 3
  // step 3.    3 ^ 2 = 1    // 1
  // step 4.    1 ^ 3 = 2    // 2
  // step 5.    2 ^ 3 = 1    // 1
  // step 6.    1 ^ 3 = 2    // 2
  // step 7.    2 ^ 4 = 6    // 6
  // step 8.    6 ^ 3 = 5    // 5
  // step 9.    5 ^ 3 = 6    // 6
  // step 10.   6 ^ 3 = 5    // 5
  // step 11.   5 ^ 2 = 7    // 7
  // step 12.   7 ^ 2 = 5    // 5
  // step 13.   5 ^ 1 = 4    //

  public static int findIt(int[] A) {
    int odd = 0;
    for (int item : A) {
      // XOR will cancel out everytime you XOR with the same
      // number so 1^1=0 but 1^1^1=1 so every pair should
      // cancel out leaving the odd number out
      odd = odd ^ item;

    }

    return odd;
  }

  public static void main(String[] args) {
    int[] array1 = {1, 3, 1};
    System.out.println(FindOdd2.findIt(array1));// 3
    System.out.println("0 ^ 1 = " + (0 ^ 1));
    System.out.println("1 ^ 2 = " + (1 ^ 2));
    System.out.println("2 ^ 3 = " + (2 ^ 3));
    System.out.println("1 ^ 3 = " + (1 ^ 3));
    System.out.println("2 ^ 4 = " + (2 ^ 4));
    System.out.println("6 ^ 3 = " + (6 ^ 3));
    System.out.println("5 ^ 3 = " + (5 ^ 3));
    System.out.println("5 ^ 2 = " + (5 ^ 2));
    System.out.println("7 ^ 2 = " + (7 ^ 2));
    System.out.println("5 ^ 1 = " + (5 ^ 1));


  }
}
