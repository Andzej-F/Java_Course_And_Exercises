package _3_Working_With_Text;

/* 4. If someone enters “ alphabet “ (notice the spaces) as input into a method, make that
method output “alphabeT” instead. */
public class Alphabet {
  public static void main(String[] args) {
    String orgText = "  alphabet ";

    // alphabet
    // 01234567
    String strippedText = orgText.strip();
    int length = strippedText.length();
    String firstPart = strippedText.substring(0, length - 1);
    String lastLetter = strippedText.substring(length - 1).toUpperCase();
    String newText = firstPart + lastLetter;

    String builder = new StringBuilder(strippedText.length())
            .append(firstPart)
            .append(lastLetter)
            .toString();

    System.out.println("Original text: " + orgText);
    System.out.println("Transformed text: " + newText);
    System.out.println("Transformed text w/builder: " + builder);
  }
}
