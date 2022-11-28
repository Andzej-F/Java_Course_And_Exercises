package _8_more_oop;

/* 7. If you modeled a chess board in Java using a two-dimensional array, how could you
convert chess notation, or coordinate notation of chess, to an element in that
two-dimensional array?
For example, in the chess board image below, square a8 might map to
array[0][0], and h1 might map to array[7][7]. Make a method that takes an input String of a
chess coordinate and returns array coordinates. This exercise simply builds on the previous
two. Use the following test data:
Input Output
a8 0,0
h1 7,7
g5 6,3
d4 3,4 */
public class Exercise7 {

  public static String convertCoordinatesToArray(String position) {
    int i;
    int j;
    char[] letters = position.toCharArray();
    i = (int) letters[0] - 97;
    j = Math.abs(letters[1] - 56);

    return Integer.toString(i).concat(",").concat(Integer.toString(j));
  }

  public static void main(String[] args) {
    System.out.println(convertCoordinatesToArray("a8"));
    System.out.println(convertCoordinatesToArray("h1"));
    System.out.println(convertCoordinatesToArray("g5"));
    System.out.println(convertCoordinatesToArray("d4"));
    System.out.println((int) '8');// 56
    System.out.println((int) '1');// 49
  }
}
