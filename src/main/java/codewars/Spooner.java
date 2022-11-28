package codewars;

/*
source: https://www.codewars.com/kata/56b8903933dbe5831e000c76/train/java

A spoonerism is a spoken phrase in which the first
letters of two of the words are swapped around, often
 with amusing results.

In its most basic form a spoonerism is a two word phrase
in which only the first letters of each word are swapped:

"not picking" --> "pot nicking"

Your task is to create a function that takes a string of
two words, separated by a space: words and returns a
spoonerism of those words in a string, as in the above
example.
A "word" in the context of this kata can contain:
•any of the letters A through Z in upper or lower case,
•the numbers 0 to 9
Though spoonerisms are about letters in words in the domain
of written and spoken language, numbers are included in the
inputs for the random test cases and they require no special
treatment.

NOTE: All input strings will contain only two words. Spoonerism
can be more complex. For example, three-word phrases in which
the first letters of the first and last words are swapped:
"pack of lies" --> "lack of pies" or more than one letter
from a word is swapped: "flat battery --> "bat flattery"
You are NOT expected to account for these, or any other nuances
involved in spoonerisms.

Once you have completed this kata, a slightly more challenging
take on the idea can be found here:
http://www.codewars.com/kata/56dbed3a13c2f61ae3000bcd */

public class Spooner {
  public String spoonerize(String words) {
    String[] wordsArray = words.split("\\s");
    String firstWord = wordsArray[0];
    String secondWord = wordsArray[1];
    String firstWordLetter = firstWord.substring(0, 1);
    String secondWordLetter = secondWord.substring(0, 1);

    String firstWordTransformed = secondWordLetter.concat(firstWord.substring(1));
    String secondWordTransformed = firstWordLetter.concat(secondWord.substring(1));

    return firstWordTransformed + " " + secondWordTransformed;
  }

  public static void main(String[] args) {

    Spooner spooner = new Spooner();
    String phrase = "not picking";
    System.out.println(spooner.spoonerize(phrase));
  }
}
/* Other solution:
public class Spooner {

    public String spoonerize(String words) {
        String[] word = words.split(" ");
        return word[1].substring(0, 1) + word[0].substring(1) +
         " " + word[0].substring(0, 1) + word[1].substring(1);
    }

}

 */
// 189 -> 191