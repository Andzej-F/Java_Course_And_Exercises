package _2_Gettting_Started_With_Java;

import java.time.LocalDate;

public class PersonDemo {
  public static void main(String[] args) {
    Person johnny = new Person("johnny", "ward", LocalDate.of(1986, 06, 15));
    System.out.format("The person's first name is: %s", johnny.getFirstName());

    johnny.setLastName("smith");
    System.out.format("\nThe person's last name is: %s", johnny.getLastName());
  }
}
