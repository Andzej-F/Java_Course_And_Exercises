package _6_Control_Flow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
8. Use Regex with named parameters and a loop to parse the addresses below and print out
the:
 •street address
 •city
 •state
 •postal code
Transfer this list of addresses into your
program using a Java text block “”” String.

12345 First Street, First City, AA 90210
22222 Second Street, Second City, BB 22222
33333 Third Street, Third City, CC 33333
44444 Fourth Street, Fourth City, DD 44444
55555 Fifth Street, Fifth City, EE 55555
66666 Sixth Street, Sixth City, FF 66666
77777 Seventh Street, Seventh City, GG 77777
88888 Eighth Street, Eighth City, HH 88888
99999 Ninth Street, Ninth City, II 99999
00000 Tenth Street, Tenth City, JJ 00000
*/
public class Exercise8 {
  public static void main(String[] args) {
    String adsList = """
            12345 First Street, First City, AA 90210
            22222 Second Street, Second City, BB 22222
            33333 Third Street, Third City, CC 33333
            44444 Fourth Street, Fourth City, DD 44444
            55555 Fifth Street, Fifth City, EE 55555
            66666 Sixth Street, Sixth City, FF 66666
            77777 Seventh Street, Seventh City, GG 77777
            88888 Eighth Street, Eighth City, HH 88888
            99999 Ninth Street, Ninth City, II 99999
            00000 Tenth Street, Tenth City, JJ 00000
            """;

    /*  Pattern pat = Pattern.compile("""
        (?<street>.*?),\\s+
        (?<city>.*?),\\s+
        (?<state>[A-Z]{2})\\s+
        (?<zip>\\d{5})$
        """, Pattern.MULTILINE | Pattern.COMMENTS); */

    String regex = """
            (?<street>\\d{5}\\s\\w+\\sStreet),\\s
            (?<city>\\w+\\sCity),\\s
            (?<state>[A-Z]{2})\\s
            (?<postalCode>\\d{5})$
            """;

    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS | Pattern.MULTILINE);
    Matcher mat = pat.matcher(adsList);

    while (mat.find()) {
      System.out.printf("Street: %s%n", mat.group("street"));
      System.out.printf("City: %s%n", mat.group("city"));
      System.out.printf("State: %s%n", mat.group("state"));
      System.out.printf("postalCode: %s%n", mat.group("postalCode"));
      System.out.printf("**************************************%n%n");
    }
  }
}
