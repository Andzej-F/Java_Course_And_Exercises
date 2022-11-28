package _3_Working_With_Text;

/* 5. Given the String
“12345 Big St., Alphabet City, CA 90210”
or any other address with the same format,
can you write code that can parse and print out:
1. The building number: 12345
2. The Street: “Big St.”
3. City: “Alphabet City”
4. State: “CA”
5. Postal Code: 90210  */
public class ParseAddress {
  public static void main(String[] args) {
    //                01234567890123
    String address = "12345 Big St., Alphabet City, CA 90210";

    System.out.format("'%s'\n", parseBuildingNbr(address));
    System.out.format("'%s'\n", parseStreet(address));
    System.out.format("'%s'\n", parseCity(address));
    System.out.format("'%s'\n", parseState(address));
    System.out.format("'%s'\n", parsePostalCode(address));
  }

  public static String parseBuildingNbr(String address) {
    int firstSpace = address.indexOf(' ');// 5
    return address.substring(0, firstSpace);
  }

  public static String parseStreet(String address) {
    int firstSpace = address.indexOf(' ');//5
    int firstComma = address.indexOf(',');//5
    return address.substring(firstSpace + 1, firstComma);
  }

  public static String parseCity(String address) {
    int firstComma = address.indexOf(',');//5
    int secondComma = address.indexOf(',', firstComma + 1);//5
    System.out.println("First comma:" + firstComma);
    System.out.println("Second comma:" + secondComma);
    return address.substring(firstComma + 2, secondComma);
  }

  public static String parseState(String address) {
    int lastComma = address.lastIndexOf(',');//5
    int lastSpace = address.lastIndexOf(' ');//5
    return address.substring(lastComma + 2, lastSpace);
  }

  public static String parsePostalCode(String address) {
    int lastSpace = address.lastIndexOf(' ');//5
    return address.substring(lastSpace + 1);
  }
}
