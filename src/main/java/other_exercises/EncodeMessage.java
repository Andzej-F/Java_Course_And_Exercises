package other_exercises;

/*
   Original message: This is a test
   Coded message: 01+x1+x9x,=+,
   Decoded message: This is a test */
public class EncodeMessage {
  public static void main(String[] args) {
    byte val = 88;
    String orgMsg = "This is a test";
    String encodedMsg = "";
    String decodedMsg = "";

    // Encode the message
    for (char symbol : orgMsg.toCharArray()) {
      encodedMsg += (char) (symbol ^ 88);
    }

    // Decode the message
    for (char symbol : encodedMsg.toCharArray()) {
      decodedMsg += (char) (symbol ^ 88);
    }

    System.out.println("Original message: " + orgMsg);// This is a test
    System.out.println("Encoded message: " + encodedMsg);// 01+x1+x9x,=+,
    System.out.println("Encoded message: " + decodedMsg);// This is a test
  }
}