package _3_Working_With_Text;

public class LearnStrings {
  public static void main(String[] args) {
//    String fruit = "apple";
//    String anotherFruit = "apple";
//    String vegetable = new String("broccoli");
//    String anotherVegetable = new String("broccoli");
//
//    System.out.println(fruit == anotherFruit);// addresses match
//    System.out.println(vegetable == anotherVegetable);// addresses do not match

//                26. Upper & Lower Casing
//    String myText = "abcdefg";
//    System.out.println(myText.toUpperCase()); // ABCDEFG
//
//    String myText2 = "ABCDEFG";
//    System.out.println(myText2.toLowerCase());`// abcdefg

//                27.Strings: Blank or Empty?
//    String myText1 = "";
//    System.out.println(myText1.isEmpty());// true
//    System.out.println(myText1.isBlank());// true
//
//    String myText2 = " ";
//    System.out.println(myText2.isEmpty());// false
//    System.out.println(myText2.isBlank());// true

//                28.Replacing Text Within Strings
//    String myText = "here's firf my awesome firf text";
//    System.out.println(myText.replace("firf", "nice"));// case sensitive, here's nice my awesome nice text
//    System.out.println(myText.replace('e', 'Z'));// hZrZ's firf my awZsomZ firf tZxt

//                29.Removing White Space - strip()
//    String firstname = " Jake ";
//    System.out.format("'%s'\n", firstname);//' Jake '
//    System.out.format("'%s'\n", firstname.strip());//'Jake'
//
//    String myText = """
//            first line here
//            second line here
//            third line here
//            """;
//
//    System.out.println(myText); // first line here
//                                // second line here
//                                // third line here

//    System.out.println(customStrip("' James '"));//'Jake'
//  }
//
//  public static String customStrip(String text) {
//    return text.replace(" ", "");
//  }


//    30. Getting Individual Characters of a String - charAt()
//    String myText = "Apples";
//    int length = myText.length();
//
//    System.out.println(myText.charAt(3));// l


//    31. Comparing String for Alphabetical Order - CompareTo()
//    String firstWord = "Apple";
//    String secondWord = "Banana";
//    String thirdWord = "Banana";
//    String fourthWord = "Aardvark";
//    String fifthWord = "apple";
//
//    System.out.println(firstWord.compareTo(secondWord));// -1
//    System.out.println(firstWord.compareTo(thirdWord));// 0
//    System.out.println(firstWord.compareTo(fourthWord));// 15
//
//    System.out.println(firstWord.compareTo(fifthWord));// -32
//    System.out.println(firstWord.compareToIgnoreCase(fifthWord));// 0
//
//    System.out.println("customCompareToIgnoreCase: ");
//    System.out.println(customCompareToIgnoreCase("Football", "football"));//0
//    System.out.println(customCompareToIgnoreCase("Basketball", "football"));//-1
//    System.out.println(customCompareToIgnoreCase("HOCKEY", "football"));//1
//
//    System.out.println("\ncompareToIgnoreCase: ");
//    System.out.println(compareToIgnoreCase("Football", "football"));// 0
//    System.out.println(compareToIgnoreCase("Basketball", "football"));// -4
//    System.out.println(compareToIgnoreCase("HOCKEY", "football"));// 2
//  }
//
//  public static int customCompareToIgnoreCase(String text1, String text2) {
//    if (text1.toLowerCase().charAt(0) > text2.toLowerCase().charAt(0)) {
//      return 1;
//    } else if (text1.toLowerCase().charAt(0) < text2.toLowerCase().charAt(0)) {
//      return -1;
//    }
//
//    return 0;
//  }
//
//  public static int compareToIgnoreCase(String text1, String text2) {
//    String lowerText1 = text1.toLowerCase();
//    String lowerText2 = text2.toLowerCase();
//
//    return lowerText1.compareTo(lowerText2);
//  }


//          32. Determining if Text is Contained in a String - cotains()
//    String myText = "Four score and seven years ago.";
//    System.out.println(myText.contains("seven"));// true
//    System.out.println(myText.contains("Seven"));// false


//          33. String concatenation - concat()
//    String text1 = "this is my text1";
//    String text2 = "this is my text2";
//    System.out.println(text1 + " " + text2);// this is my text1 this is my text2
//
//    System.out.println(text1.concat(text2));// this is my text1this is my text2
//    System.out.println(text1.concat(" my string literal"));// this is my text1 my string literal
//    System.out.println(" my string literal".concat(text2));//  my string literalthis is my text2
//    System.out.println(" my string literal".concat("second string literal"));//  my string literalsecond string literal
//
//    // For concatenating more than 3 strings, use the following
//    System.out.println("\n Using StringBuilder");
//    String finalString = new StringBuilder(text1.length() + text2.length() + 1)
//            .append(text1)
//            .append(" ")
//            .append(text2)
//            .toString();
//    System.out.println(finalString);// this is my text1 this is my text2
//
//    System.out.println("\n Using StringBuffer");
//    String otherFinalString = new StringBuffer()
//            .append(text1)
//            .append(" ")
//            .append(text2)
//            .toString();
//    System.out.println(otherFinalString); // this is my text1 this is my text2
//
//    System.out.format("%s %s\n", text1, text2); // this is my text1 this is my text2
//
//    String oneMoreFinalString = String.format("%s  ", text1, text2);
//    System.out.println(oneMoreFinalString);// this is my text1 this is my text2


//            34. Determining the Length of a String - length()
//    String myText = "for";
//    String secondText = "score";
//    StringBuilder builder = new StringBuilder(myText.length() + secondText.length())
//            .append(myText)
//            .append(secondText);
//    System.out.println(builder.toString()); // forscore
//
//    System.out.println(myText.length()); // 3
//
//    char[] chars = myText.toCharArray();
//    System.out.println(chars[2]); // r
//
//    int index = 2;
//    if (index < myText.length()) {
//      System.out.println(chars[index]); // r
//    }


//                35. Getting Parts of a String - substring
//    String myText = "apple";
//    String myNewText = myText.substring(0, 1).toUpperCase() + myText.substring(1);// [0,1)
//    String myNewText2 = new StringBuilder(myText.length())
//            .append(myText.substring(0, 1).toUpperCase())
//            .append(myText.substring(1)).toString();
//    String capitalFirstLetter = myText.substring(0, 1).toUpperCase();
//    String secondPart = myText.substring(1);
//    String myText3 = capitalFirstLetter.concat(secondPart);
//
//
//    System.out.println(myNewText);// Apple
//    System.out.println(myNewText2);// Apple
//    System.out.println(myText3);// Apple
//    System.out.format("%s%s", capitalFirstLetter, secondPart);// Apple


//               36. Searching within a String - indexOf()
//    String myText1 = "four score and seven years ago.";
//    System.out.println(myText1.indexOf("seven"));// 15
//
//    String myText2 = "ABCDEFGABCDEFG";
//    System.out.println(myText2.indexOf(65));// 0, 65 == 'A'
//    System.out.println(myText2.indexOf(122));// -1
//    System.out.println(myText2.indexOf("abc"));// -1, case sensitive
//
//    System.out.println(myText2.lastIndexOf("A"));// 7
//    System.out.println(myText2.lastIndexOf('A'));// 7
//
//    System.out.println(myText2.indexOf('A', 2));// 7
//
//    String phoneNumber = "(234) 333-5551"; // area code, exchange, line number
//    String areaCode = parseAreaCode(phoneNumber);
//    String exchange = parseExchange(phoneNumber);
//    String lineNumber = parseLineNumber(phoneNumber);
//
//    System.out.println("Area code: " + areaCode); // Area code: 234
//    System.out.println("exchange: " + exchange); // exchange: 333
//    System.out.println("line number: " + lineNumber); // line number: 5551
//
//  }
//
//  public static String parseAreaCode(String phoneNumber) {
//    int openParens = phoneNumber.indexOf('(');
//    int closeParens = phoneNumber.lastIndexOf(')');
//    return phoneNumber.substring(openParens + 1, closeParens);
//  }
//
//  public static String parseExchange(String phoneNumber) {
//    int spaceIndex = phoneNumber.indexOf(' ');
//    int hyphenIndex = phoneNumber.indexOf('-');
//    return phoneNumber.substring(spaceIndex + 1, hyphenIndex);
//  }
//
//  public static String parseLineNumber(String phoneNumber) {
//    int hyphenIndex = phoneNumber.indexOf('-');
//    return phoneNumber.substring(hyphenIndex + 1);

//                37. Splitting String Apart - split()
//    String text = """
//            Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
//            McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
//            Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NY
//            Flintstone,Fred,3/3/81,3333 GHI St.,Pear,MO
//            Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
//            """;
//
//    String[] people = text.split("\n");
//    System.out.println(people.length);// 5
//    System.out.println(people[2]);// Jetson, George, 5/5/83, 5555 MNO St., Grapefruit, NY
//
//    String[] george = people[2].split(",");
//    System.out.println(george[3]);// 5555 MNO St.


//                38. Beginning & Ending of Strings - startsWith() & endsWith()
//    String filename1 = "myfile.txt";
//    String filename2 = " file001.txt".strip();
//    String filename3 = "azfile001.txt";

//    System.out.println(filename1.endsWith("txt"));// true
//    System.out.println(filename1.endsWith("doc"));// false
//    System.out.println(filename1.endsWith(".txt"));// true


//    System.out.println(filename2.startsWith("file"));// true
//    System.out.println(filename3.startsWith("file"));// false


//               39. Comparing Strings for Equality - contentEquals()
    String firstText = "Apple";
    String secondText = "Apple";
    StringBuffer thirdText = new StringBuffer("Apple");

    System.out.println(firstText.contentEquals(secondText)); // true
    System.out.println(firstText.equals(secondText)); // true

    System.out.println(firstText.contentEquals(thirdText)); // true
    System.out.println(firstText.equals(thirdText)); // true
  }
}
