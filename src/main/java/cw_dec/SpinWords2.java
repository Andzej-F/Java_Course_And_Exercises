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

StringBuilder. reverse
String.join

expected: <Just gniddik [ereht is llits] one more>
but was:  <Just gniddik [there is still] one more>
 */
public class SpinWords2 {
  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }

    return String.join(" ", words);
  }

  public static void main(String[] args) {
    System.out.println(new SpinWords2().spinWords("Hey fellow warriors"));
    String[] strings = {"I'm", "running", "out", "of", "pangrams!"};

//    String myString = String.join(" ", strings);
    System.out.println(String.join("*", strings));
  }
}
