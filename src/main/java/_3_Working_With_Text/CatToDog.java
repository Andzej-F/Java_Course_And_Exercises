package _3_Working_With_Text;

/* 2. Write code that replaces the word “cat” with the word “dog” wherever it shows up in a
sentence. */
public class CatToDog {
  public static void main(String[] args) {
    String orgText = "I love to play with cats because cats are really fun.";
    String newText = orgText.replace("cat", "dog");

    System.out.println("Original text: " + orgText);
    System.out.println("New text: " + newText);
  }
}
