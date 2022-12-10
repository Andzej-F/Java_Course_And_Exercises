package cw_dec;

/* Moves in squared strings (I)
https://www.codewars.com/kata/56dbe0e313c2f63be4000b25/train/java

This kata is the first of a sequence of four about "Squared Strings".

You are given a string of n lines, each substring being n characters long: For example:

s = "abcd\nefgh\nijkl\nmnop"

We will study some transformations of this square of strings.

Vertical mirror: vert_mirror (or vertMirror or vert-mirror)
vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"
Horizontal mirror: hor_mirror (or horMirror or hor-mirror)
 hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"
or printed:

vertical mirror   |horizontal mirror
abcd --> dcba     |abcd --> mnop
efgh     hgfe     |efgh     ijkl
ijkl     lkji     |ijkl     efgh
mnop     ponm     |mnop     abcd

Task:
Write these two functions
and

high-order function oper(fct, s) where

fct is the function of one variable f to apply to the
string s (fct will be one of vertMirror, horMirror)

Examples:
s = "abcd\nefgh\nijkl\nmnop"
oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"
oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"
Note:
The form of the parameter fct in oper changes according
to the language. You can see each form according to the
language in "Sample Tests".

Bash Note:
The input strings are separated by , instead of \n. The output
strings should be separated by \r instead of \n. See "Sample Tests".

 */
public class SquaredStrings {
  public static String vertMirror(String strng) {
    String result = "";
    String[] words = strng.split("\n");

    for (String word : words) {
      char[] letters = word.toCharArray();
      for (int i = letters.length - 1; i >= 0; i--) {
        result += letters[i];
      }
      result += "\n";
    }

    return result.substring(0, result.length() - 1);
  }

  public static String horMirror(String strng) {
    String result = "";
    String[] words = strng.split("\n");

    for (int i = words.length - 1; i >= 0; i--) {
      result += words[i] + "\n";
    }

    return result.substring(0, result.length() - 1);
  }

  // lambda expression
//  public static String oper(vertMirror(String s)) {
//    return "";
// }

  public static void main(String[] args) {
    System.out.println(vertMirror("abcd\nefgh\nijkl\nmnop"));
    System.out.println("********************************");
    System.out.println(horMirror("abcd\nefgh\nijkl\nmnop"));
  }
}
