package _7_Testing_Code;

/* 2. Use TDD to write tests for a method that can take a String input like:
“Billy, Bob, 1234 Big St., Big City, California, 90210”
And return an Object representing that person. You can name your class
Exercise2 or Person or whatever you like. To test this easily, you’ll
need to have the IDE generate an equals() & hashcode() method in your
class that models a Person (you’ll learn more about that in a later section).
To do so, you can right click on an empty line within your class and
select, “Generate…” and click “Next” every time (probably will be three times)
followed by “Finish”. You’ll now be able to continue with your test(s).
A: Person */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
  private String firstName;
  private String lastName;
  private String street;
  private String city;
  private String state;
  private String postalCode;

  private Person getInfo(String text) {
//  “Billy, Bob, 1234 Big St., Big City, California, 90210”
    String regex = """
            (?<firstName>\\w+),\\s
            (?<lastName>\\w+),\\s
            (?<street>\\d{4}\\s(\\w+\\s)+\\w+.),\\s
            (?<city>\\w+\\s\\w+),\\s
            (?<state>\\w+),\\s
            (?<postalCode>\\d{5})
                       """;


    Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
    Matcher mat = pat.matcher(text);

    System.out.println("mat.find()" + mat.find());
    this.firstName = mat.group("firstName");
    this.lastName = mat.group("lastName");
    this.street = mat.group("street");
    this.city = mat.group("city");
    this.state = mat.group("state");
    this.postalCode = mat.group("postalCode");

    return this;
  }

  @Override
  public String toString() {
    return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", postalCode='" + postalCode + '\'' +
            '}';
  }

  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person.getInfo("Billy, Bob, 1234 Big St., Big City, California, 90210").toString());
  }
}
