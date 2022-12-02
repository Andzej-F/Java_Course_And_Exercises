package cw_dec;

/* Stop gninnipS My sdroW!

Write a function that takes in a string of one or more words,
and returns the same string, but with all five or more letter
words reversed (Just like the name of this Kata). Strings passed
in will consist of only letters and spaces. Spaces will be
included only when more than one word is present.

Examples:
spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"

 */
public class SpinWords {
  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    String result = "";
    for (String word : words) {
      if (word.length() >= 5) {
        String revWord = "";
        char[] letters = word.toCharArray();
        for (int i = word.length() - 1; i >= 0; i--) {
          revWord += letters[i];
        }
        word = revWord;
      }
      result += word + " ";
    }

    return result.strip();
  }

  public static void main(String[] args) {
    System.out.println(new SpinWords().spinWords("Hey fellow warriors"));
  }
}
// 231 -> 239