package _3_Working_With_Text;

/* 3. How can you make sure when people enter text into a program, there are no unintended
spaces at the beginning or end of the text? */
public class StripSpaces {
  public static void main(String[] args) {
    String orgText = " Basketball  ";
    String newText = orgText.strip();

    System.out.format("Original text: '%s'\n", orgText);
    System.out.format("New text: '%s'", newText);
  }
}
