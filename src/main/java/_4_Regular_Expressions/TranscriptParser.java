package _4_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
  public static void main(String[] args) {
    //    50. Parsing a Real Text Document
    /* String regex = """
            # This is my regex to parse the parts of a phone number
            (?:(?<countryCode>\\d{1,2})[-.\\s]?)? #Gets country code
            (?:(?<areaCode>\\d{3})[-.,\\s]?) #Gets area code
            (?:(?<exchange>\\d{3})[-.,\\s]?) # Gets exchange number
            (?<lineNumber>\\d{3,4}) # Gets line number
            """; */

    // //    <  ( [ { \ ^ - = $ ! | ] } ) ? * + . >

    String transcript = """
            Student Number:	1234598872			Grade:		11
            Birthdate:		01/02/2000			Gender:	M
            State ID:		8923827123
                        
            Cumulative GPA (Weighted)		3.82
            Cumulative GPA (Unweighted)	3.46
            """;

    String regex = """
            Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grab student number
            Grade:\\s+(?<grade>\\d{2}).* # Grab the grade
            Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* # Grab birthdate
            Gender:\\s(?<gender>\\w+)\\b.* # Grab gender value
            State\\sID:\\s+(?<stateID>\\d{10}).* # Grab state ID number
            Weighted\\)\\s+(?<weightedGPA>[\\d.]+).* # Grab the weighted GPA
            Unweighted\\)\\s+(?<unweightedGPA>[\\d.]+).* # Grab the unweighted GPA
            """;
    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS | Pattern.DOTALL);
    Matcher mat = pat.matcher(transcript);

    if (mat.matches()) {
      System.out.format("Student Number: %s\n", mat.group("studentNumber"));
      System.out.format("Grade: %s\n", mat.group("grade"));
      System.out.format("Birthdate: %s %s %s\n", mat.group("birthMonth"), mat.group("birthDay"), mat.group("birthYear"));
      System.out.format("Gender: %s\n", mat.group("gender"));
      System.out.format("State ID: %s\n", mat.group("stateID"));
      System.out.format("GPA Weighted: %s\n", mat.group("weightedGPA"));
      System.out.format("GPA Unweighted: %s\n", mat.group("unweightedGPA"));
    }
//                            51. Greedy Operators
  }
}