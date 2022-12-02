package baeldung;

/*
source: https://www.baeldung.com/java-reverse-string

Now, let's assume we have a sentence with words separated
by spaces and no punctuation marks. We need to reverse the
order of words in this sentence. */
public class ReverseOrder {
  public String reverseWords(String sentence) {
    if (sentence == null) {
      return null;
    }

    String[] words = sentence.split(" ");
    StringBuilder builder = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
      builder = builder.append(words[i]).append(" ");
    }
    return builder.toString().strip();
  }

  public static void main(String[] args) {
    ReverseOrder ob = new ReverseOrder();
    System.out.println(ob.reverseWords("A house of a rising sun"));
  }
}
