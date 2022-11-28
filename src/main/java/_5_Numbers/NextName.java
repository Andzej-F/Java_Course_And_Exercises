package _5_Numbers;

/*
3. Using only what you’ve learned so far in this course,
•create a class that contains 10 lowercase names
•has a method that can be called 10 separate times,
•each time, returning the next name
If the method is called “next()”, the first time it’s called, it returns “name1”,
the second time “next()” is called, it returns “name2”, etc.

3.1 Make the next() method capitalize the first letter of each name as it outputs them. */
public class NextName {
  private int index = 0;
  private String[] names = {"beverly", "kerry", "terry", "fannie", "shannah",
          "jerrold", "sefton", "james", "shae", "alain"};


  public String next() {
    if (index < names.length) {
      String fullname = names[index++];
      return fullname.substring(0, 1).toUpperCase() + fullname.substring(1);

    }

    return "No names left";
  }


  public static void main(String[] args) {

    NextName person = new NextName();

    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
    System.out.println(person.next());
  }
}
